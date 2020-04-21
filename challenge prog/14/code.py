# -*- coding: utf-8 -*-
"""
Created on Mon Apr  6 10:24:40 2020

@author: Casanova
"""

ages = ['moins de 21 ans', 
        'entre 21 et 65 ans', 
        'plus de 65 ans']

tailles = ['entre 0.5m et 1m50', 
           'entre 1m50 et 1m70', 
           'entre 1m70 et 1m80',
           'entre 1m80 et 1m90',
           'plus de 1m90']

codes = ['7777x7777777x777777x7777',
         '77x77',
         '9999x9999x999',
         '77777x777777x77777',
         '9999x9xxx',
         'x9x99x9xx',
         '7777x7777777777777x7777',
         'x99999x999999x9',
         '777777x7x7x77',
         'x77x77',
         'x9999999999x99']

ageT = []
sexeT = []
tailleT = []

def taille(code):
    ct = 0
    for c in code:
        if c == 'x':
            ct +=1
    return tailles[ct-1]

def sexe(code):
    i=0
    
    while code[i] == 'x':
            i=i+1
    
    if code[0] == '7':
        sexe = "Masculin"
    elif code[0] == '9':
        sexe = "Feminin"
    else:
        sexe = "Autre"
    
    return sexe

def age(code):
    if (len(code) > 18):
        age = ages[1]
    elif (len(code) < 6):
        age = ages[2]
    else:
        age = ages[0]
    return age

def afficher_ADN(codes):
    for adn in codes:
        print(adn)


for code in codes:
    
    print(code)
    
    ageT.append(age(code))
    sexeT.append(sexe(code))
    tailleT.append(taille(code))
    
    print("Sexe :",sexe(code))
    print("Age :",age(code))
    print("Taille :",taille(code))

