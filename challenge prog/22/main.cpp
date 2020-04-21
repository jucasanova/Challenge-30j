#include <iostream>
#include <stdio.h>
#include <string>
#include <iomanip>
#include <ctime>
#include <cstdlib>

using namespace std;

#include "Arme.h"

int main(void)	{
	
	string pseudo;
	int vieJoueur = 100;
	int attaqueJoueur;
	int vieKraken = 400;
	int attaqueKraken = 10;
	int de;
	string choixArme;
	
	cout<<"Bienvenue à toi jeune combatant !\nQuel est ton pseudo ?\n";
	cin>>pseudo;
	cout<<"Quelle arme veux-tu choisir ? (Arc, Lame Tranchante ou Massue) \n";
	cin>>choixArme;
	
	Arme arme(choixArme);
	attaqueJoueur = arme.getAttaque();
	
	cout<<"Très bien "<<pseudo<<" ! A l'attaque !\n\n";
	
	srand(time(NULL));
	
	while ((vieJoueur > 0)&&(vieKraken > 0))	{
		de = rand()%7;
		cout<<"Valeur dé : "<<de<<"\n";
		if (de%2 == 0)	{
			cout<<"Attaque du joueur !"<<"\n";
			vieKraken -= attaqueJoueur;
			cout<<"Vie du Kraken : "<<vieKraken<<"\n";
		}
		else {
			cout<<"Attaque du joueur ratée !"<<"\n";
			cout<<"Vie du Kraken : "<<vieKraken<<"\n";
		}
		if (de == 6)	{
			cout<<"Attaque du Kraken !"<<"\n";
			vieJoueur -= attaqueKraken;
			cout<<"Vie du Joueur : "<<vieJoueur<<"\n"<<"\n";
		}
		else {
			cout<<"Attaque du Kraken ratée !"<<"\n";
			cout<<"Vie du Joueur : "<<vieJoueur<<"\n"<<"\n";
		}
	}
	
	if (vieJoueur <= 0)	{
		cout<<"Vous avez perdu !\n";
	}
	else {
		cout<<"Vous avez gagné !\n";
	}
	
	return 0;
}

































