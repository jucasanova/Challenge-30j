# -*- coding: utf-8 -*-
"""
Created on Sat Apr 18 11:52:00 2020

@author: Casanova
"""

import pygame

class Panier(pygame.sprite.Sprite):
    
    def __init__(self, largeur, hauteur):
        super().__init__()
        self.largeur_ecran = largeur
        self.points = 15
        self.points_max = 15
        self.image = pygame.image.load("assets/panier.png")
        self.image = pygame.transform.scale(self.image, (100, 100))
        self.rect = self.image.get_rect()
        self.rect.x = largeur/2 - self.image.get_width()/2
        self.rect.y = hauteur - 175
        self.vitesse = 6
        
    def ajouter_point(self):
        if self.points <= self.points_max - 5:
            self.points += 5
        elif self.points < self.points_max:
            self.points = self.points_max
            
    def retirer_points(self):
        if self.points > 2:
            self.points -= 2
        else:
            self.points = 0
        
    def deplacement_droite(self):
        if self.rect.x < (self.largeur_ecran - self.image.get_width()):
            self.rect.x += self.vitesse
        
    def deplacement_gauche(self):
        if self.rect.x > 0:
            self.rect.x -= self.vitesse
