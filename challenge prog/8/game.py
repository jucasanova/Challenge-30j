# -*- coding: utf-8 -*-
"""
Created on Thu Apr  2 13:54:06 2020

@author: Casanova
"""

import pygame
import random

pygame.init()

class Emplacement(pygame.sprite.Sprite):
    
    def __init__(self, pos_x,pos_y):
        super().__init__()
        self.image = pygame.image.load("images/pomme_dore.png")
        self.rect = self.image.get_rect()
        self.rect.x = pos_x
        self.rect.y = pos_y

    def set_image(self, image):
        self.image = image

fruits = ["ananas", "cerise", "orange", "pasteque", "pomme_dore"]

p = [0.2,0.25,0.40,0.1,0.05]

prix = {
        "orange":5,
        "cerise":15,
        "ananas":50,
        "pasteque":150,
        "pomme_dore":10000
        }


largeur =800
hauteur = 460
ecran = pygame.display.set_mode((largeur, hauteur)) 
pygame.display.set_caption("Machine a sous - Jus lien")
couleur = [255, 255, 255]

fond = pygame.image.load("images/slot.png")
police = pygame.font.SysFont("Times New Roman", 30)

jetons = 1000

fruit_img = {
    "orange": pygame.image.load("images/orange.png"),
    "cerise": pygame.image.load("images/cerise.png"),
    "ananas": pygame.image.load("images/ananas.png"),
    "pasteque": pygame.image.load("images/pasteque.png"),
    "pomme_dore": pygame.image.load("images/pomme_dore.png")
}

val_x = 126
val_y = hauteur * 0.55

emplacements = pygame.sprite.Group()
emplacement_gauche = Emplacement(val_x + 101, val_y)
emplacement_milieu = Emplacement(val_x + 202, val_y)
emplacement_droite = Emplacement(val_x + 302, val_y)

emplacements.add(emplacement_gauche)
emplacements.add(emplacement_milieu)
emplacements.add(emplacement_droite)

def lancement():
    
    global jetons
    
    jetons -= 10
    
    res = random.choices(fruits, weights=p, k=3)
    
    emplacement_gauche.set_image(fruit_img[res[0]])
    emplacement_milieu.set_image(fruit_img[res[1]])
    emplacement_droite.set_image(fruit_img[res[2]])

    
    if(res[0] == res[1] == res[2]):
        jetons += prix[res[0]]

run = True

while run:
    
    ecran.fill(couleur)
    ecran.blit(fond, (0,0))
    emplacements.draw(ecran)
    
    texte = police.render("jetons = "+str(jetons), True, (0, 0, 0))
    ecran.blit(texte, (10, 20))
    
    pygame.display.flip()
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False
            pygame.quit()
        
        if event.type == pygame.KEYDOWN and jetons >= 10:
            if event.key == pygame.K_SPACE:
                lancement()
            