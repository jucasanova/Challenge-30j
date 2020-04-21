# -*- coding: utf-8 -*-
"""
Created on Fri Mar 27 11:46:21 2020

@author: Casanova
"""

from random import *

trousseau = 0

def jarre():

    global trousseau    
    test = "oui"
    
    dif = int(input("Entrer niveau de difficulté (1,2 ou 3) : "))
    if dif == 3:
        dif += 1

    while (test == "oui"):
        
        #La liste des jarres
        T = [0, 0, 0, 0, 0] 
        
        while (T[0]+T[1]+T[2]+T[3]+T[4])<dif:
            j = int(random()*5)
            T[j] = 1
    
        print("Initialisation des jarres terminée")
        choix = int(input("Veuillez choisir une jarre parmi les 5 : "))
        
        if (T[choix] == 1):
            print("Piege")
            if (trousseau != 0):
                trousseau -= 1
        else:
            print("Gagne")
            trousseau += 1
    
        if (trousseau == 3):
            print("Tu deviens roi du temple")
            trousseau = 0
            
        test = input("Voulez-vous rejouer ? (oui/non) : ")
    