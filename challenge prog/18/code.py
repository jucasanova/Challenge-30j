# -*- coding: utf-8 -*-
"""
Created on Mon Apr 13 18:59:49 2020

@author: Casanova
"""

import time

class LaveLinge:
    
    def __init__(self,tours_minute = 1400, contenance = 8):
        self.tours_minute = tours_minute
        self.contenance = contenance
        self.temperature = 60

def demarrer_machine(poids = 8):
    print("Démarrage machine pour", poids, "kg de linge")
    duree_machine = 35
    compteur_tour = 0
    print("Cela consommera 60L d'eau et durera", duree_machine, "minutes")
    
    while duree_machine > 0:
        print(duree_machine)
        compteur_tour += 1400
        duree_machine -= 1
        time.sleep(1)
    
    print("Fin de la machine")
    print("La machine a effectué", compteur_tour, "tours")

print("Ouverture de la machine à laver")

poids = int(input("Combien de kg de linge voulez-vous laver ? "))

if ((poids%8) == 0):
    nb_machine = int(poids/8)
else:
    nb_machine = int(poids/8) + 1

print("Il y aura ", nb_machine, "machine(s)")

eau = nb_machine * 60

print("Cela consommera", eau, "L d'eau")

demarrer_machine()
