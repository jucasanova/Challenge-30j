# -*- coding: utf-8 -*-
"""
Created on Sat Apr 18 10:55:06 2020

@author: Casanova
"""

from panier import Panier
from oeuf import OeufChocolat
import pygame

pygame.init()

largeur = 800
hauteur = 480

fenetre = pygame.display.set_mode((largeur, hauteur))
pygame.display.set_caption("Chasse aux oeufs")

fond = pygame.image.load("assets/fond.jpg")
sol = pygame.image.load("assets/sol.png")

touches_actives = {}

panier = Panier(largeur, hauteur)
panier_group = pygame.sprite.Group()
panier_group.add(panier)

chocolat_couleur = (87, 64, 53)


premier_oeuf = OeufChocolat(largeur, hauteur, panier_group, panier)

run = True

while(run):
    
    fenetre.blit(fond, (0, 0))
    fenetre.blit(premier_oeuf.image, premier_oeuf.rect)
    fenetre.blit(panier.image, panier.rect)
    fenetre.blit(sol, (0, 0))
    
    pygame.draw.rect(fenetre, chocolat_couleur, [10, hauteur - 25, ((largeur-20)/15)*panier.points, 32])
    
    premier_oeuf.gravite()
    
    print(panier.points)
    
    pygame.display.flip()
    
    if touches_actives.get(pygame.K_RIGHT):
        panier.deplacement_droite()
    elif touches_actives.get(pygame.K_LEFT):
        panier.deplacement_gauche()
    
    for evenement in pygame.event.get():
        
        if evenement.type == pygame.KEYDOWN:
            touches_actives[evenement.key] = True
        elif evenement.type == pygame.KEYUP:
            touches_actives[evenement.key] = False
        
        elif evenement.type == pygame.QUIT:
            run = False
            pygame.quit()
    
    if panier.points == 0:
        print("Perdu !")
        run = False
        pygame.quit()