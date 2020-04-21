# -*- coding: utf-8 -*-
"""
Created on Sat Apr 18 13:57:12 2020

@author: Casanova
"""

import pygame
import random

class OeufChocolat(pygame.sprite.Sprite):
    
    def __init__(self, largeur, hauteur, panier_group, panier):
        super().__init__()
        self.image = pygame.image.load("assets/oeuf.png")
        self.image = pygame.transform.scale(self.image, (50, 50))
        self.hauteur_ecran = hauteur
        self.largeur_ecran = largeur
        self.rect = self.image.get_rect()
        self.rect.x = random.randint(0, largeur - 50)
        self.rect.y = 0
        self.vitesse = 2
        self.panier_group = panier_group
        self.panier = panier
        
    def gravite(self):
        
        if pygame.sprite.spritecollide(self, self.panier_group, False, pygame.sprite.collide_mask) and self.rect.y > 400:
            self.panier.ajouter_point()
            self.rect.x = random.randint(0, self.largeur_ecran - 50)
            self.rect.y = 0 - self.image.get_height()
        
        if self.rect.y < self.hauteur_ecran:
            self.rect.y += self.vitesse
        else:
            self.panier.retirer_points()
            self.rect.x = random.randint(0, self.largeur_ecran - 50)
            self.rect.y = 0 - self.image.get_height()
        