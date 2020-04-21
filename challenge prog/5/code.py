# -*- coding: utf-8 -*-
"""
Created on Wed Apr  1 14:00:17 2020

@author: Casanova
"""

from tkinter import *

fenetre = Tk()
fenetre.title("Séances de cinéma - Logiciel de gestion")
fenetre.geometry("400x300")

def click_btn(film_id,nb_places):
    print("click", film_id,"!")
    
    print("Vous avez choisi :",films[film_id]['titre'])
    
    if (films[film_id]['places'] > 1):
        films[film_id]['places'] -= 1
        nb_places.set(films[film_id]['places'])
        print("Votre place a été réservée !")
    else:
        if (films[film_id]['places'] == 1):
            films[film_id]['places'] -= 1
            nb_places.set("Complet !")
            print("Votre place a été réservée !")
        else:
            nb_places.set("Complet !")
            print("Séance complète !")

films = [
         {
         "titre": "Voyage au centre du HTML",
          "seance": "18H07",
          "places": 200
          },
         {
         "titre": "Les 9 jsons cachés",
         "seance": "17H35",
         "places": 80
         },
         {
         "titre": "Algobox - Le Film",
         "seance": "18H15",
         "places": 120
         }]
   
for i,film in enumerate(films, start =0):
    
    titre = film['titre']
    seance = film['seance']
    place = film['places']
    place_var = StringVar()
    place_var.set(place)

    titre_label = Label(fenetre, text=titre)
    titre_label.grid(row=i, column=0)
    
    seance_label = Label(fenetre, text=seance)
    seance_label.grid(row=i, column=1)
    
    places_label = Label(fenetre, textvariable=place_var)
    places_label.grid(row=i, column=2)
    
    book_bouton = Button(fenetre, text="Réserver", 
                         command=lambda num=i, 
                         txt=place_var:click_btn(num,txt))
    book_bouton.grid(row=i, column=3)


fenetre.mainloop()