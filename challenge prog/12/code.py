# -*- coding: utf-8 -*-
"""
Created on Sat Apr  4 11:39:26 2020

@author: Casanova
"""


print("Bienvenue au niveau -1, que voulez-vous faire ?")

parking = [];


for i in range(0,5):
    parking.append("H")

for i in range(5,27):
    parking.append("D")

parking[0] = "V"


def afficher_parking():
    i=0
    
    for etat in parking:
        print("emplacement n°",i+1," : ",etat)
        i+=1

run = True

while(run):
    choix = int(input("Entrer votre choix :\n1. Garer véhicule\n2. Récupérer véhicule\n3. Quitter\n"))
    
    if(choix == 1):
        print("Voici les places de ce niveau : ")
        afficher_parking()
        print("Quelle place voulez-vous ?")
        choixPlace = int(input())
        
        if(parking[choixPlace-1] == "V"):
            print("Place occupée")
        if(parking[choixPlace-1] == "H"):
            parking[choixPlace-1] = "V"
            print("Place handicapée réservée !")
        if(parking[choixPlace-1] == "D"):
            parking[choixPlace-1] = "V"
            print("Place réservée !")
            
    if(choix == 2):
        print("A quel emplacement est votre véhicule ?")
        place = int(input())
        
        if((place > 1) and (place < 26)): 
            if((parking[place-1] == "D") or (parking[place-1] == "H")):
                print("Place invalide !")
            else:
                if(place-1 < 5):
                    parking[place-1] = "H"
                    print("Véhicule récupéré !")
                else:
                    parking[place-1] = "D"
                    print("Vehicule récupéré !")
        else:
            print("Place invalide")
        
    if(choix == 3):
        run = False
        
print("A bientot !")