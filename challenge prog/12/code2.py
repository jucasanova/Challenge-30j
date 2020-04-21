# -*- coding: utf-8 -*-
"""
Created on Sat Apr  4 12:51:58 2020

@author: Casanova
"""

import random
import string
import re


parking = [['D']*27]*3

code_debloquage = [['.']*27]*3

PH = []

for i in range(2):
    PH.append(str(random.randint(0,26)))
    parking[0][int(PH[i])] = "H"
    parking[1][int(PH[i])] = "H"
    parking[2][int(PH[i])] = "H"

def generer_code():
    #format AAAA-2222-XX
    lettres = string.ascii_uppercase
    res = ''.join(random.choice(lettres) for i in range(4))
    res += "-"
    res += str(random.randint(1000,9999))
    res += "-"
    res += ''.join(random.choice(lettres) for i in range(2))
    return res
    
    
def afficher_parking(niv):
    
    print("Niveau -",niv)
    i=0
    for etat in parking[niv]:
        print("emplacement n°",i+1," : ",etat)
        i+=1
        

def gestion(niv):
    choix = int(input("1. Garer véhicule\n2. Récupérer véhicule\n3. Quitter\n"))
    
    if(choix == 1):
        print("Voici les places de ce niveau : ")
        afficher_parking(niv)
        print("Quelle place voulez-vous ?")
        choixPlace = int(input())
        
        if(parking[niv][choixPlace-1] == "V"):
            print("Place occupée")
        if(parking[niv][choixPlace-1] == "H"):
            print("Entrer code :")
            code_i = input()
            verif = re.search("^HP-[1-9]*-[a-zA-Z]*", code_i)
            if (verif):
                code = generer_code()
                code_debloquage[niv][choixPlace-1] = code
                parking[niv][choixPlace-1] = "V"
                print("Place handicapée réservée ! Voici votre code :",code)
            else:
                print("Mauvais format de code")
        if(parking[niv][choixPlace-1] == "D"):
            code = generer_code()
            code_debloquage[niv][choixPlace-1] = code
            parking[niv][choixPlace-1] = "V"
            print("Place réservée ! Voici votre code :",code)
            
    if(choix == 2):
        print("A quel emplacement est votre véhicule ?")
        place = int(input())
        
        if((place >= 1) and (place <= 27)): 
            if((parking[niv][place-1] == "D") or (parking[niv][place-1] == "H")):
                print("Place invalide !")
            else:
                print("Entrer votre code :")
                code = input()
                if(code == code_debloquage[niv][place-1]):
                    code_debloquage[niv][place-1] = '.'
                    parking[niv][place-1] = "D"
                    print("Véhicule récupéré !")
                else:
                    print("Mauvais code !")
        else:
            print("Place invalide")

run = True

while(run):
    print("A quel étage voulez-vous aller ? (1,2 ou 3)\nEntrer 4 pour quitter")
    etage = int(input())
    
    if(etage < 4):
        gestion(etage)
    else:
        run = False

