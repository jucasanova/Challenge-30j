# -*- coding: utf-8 -*-
"""
Created on Thu Apr  2 12:22:19 2020

@author: Casanova
"""

import random

print("Bienvenue sur la machine à sous de Julien !")

fruits = ["ananas", "cerise", "orange", "pasteque", "pomme_dore"]

p = [0.2,0.25,0.40,0.1,0.05]

prix = {
        "orange":5,
        "cerise":15,
        "ananas":50,
        "pasteque":150,
        "pomme_dore":10000
        }

res = random.choices(fruits, weights=p, k=3)

print(res)



jetons = 0

if(res[0] == res[1] == res[2]):
    jetons = prix[res[0]]
    print("Bravo vous avez gagné",jetons,"jetons")

