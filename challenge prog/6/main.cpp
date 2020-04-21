#include <iostream>
#include <stdio.h>
#include <string>
#include <iomanip>
using namespace std;


int main(void)	{
	
	float prod_min_noir = 117;
	float prod_min_blanc = prod_min_noir * 1.05;
	
	int dix_min_noir = prod_min_noir*10;
	int quarante_min_noir = prod_min_noir*40;
	int une_h_quinze_noir = prod_min_noir*75;
	
	int une_h_blanc = prod_min_blanc * 1 * 60;
	int dix_h_blanc = prod_min_blanc * 10 * 60;
	int trois_j_blanc = prod_min_blanc * 3 * 24 * 60;
	
	int non_prod_noir = 9*prod_min_noir*60*0.03;
	
	string prenom;
	
	int jour = 0;
	int prod = prod_min_noir;
	
	int nb_noir, nb_blanc, prix_n, prix_b;
	
	float prix_blanc, prix_noir;
	
	cout<<"Bienvenue à la chocolaterie\n\n";
	cout<<"Voici le nombre de chocolats noirs produit après :\n10min :\t"<<dix_min_noir<<"\n40min :\t"<<quarante_min_noir<<"\n1h15 :\t"<<une_h_quinze_noir<<"\n\n";
	cout<<"Voici le nombre de chocolats blancs produit après :\n1h :\t"<<une_h_blanc<<"\n10h :\t"<<dix_h_blanc<<"\n3j :\t"<<trois_j_blanc<<"\n\n";
	
	cout<<"Voici le chocolat noir que n'a pas produit la machine après :\n9h :\t"<<non_prod_noir<<"\n\n";
	
	cout<<"Bonjour, quel est votre prénom ?\n";
	cin>>prenom;
	cout<<"Bienvenue "<<prenom<<", nous vous attendions !\n\n";
	
	while(prod < 1000)	{
		prod *= 1.05;
		jour +=1;
	}
	
	cout<<"La production dépasse 1000 tablettes/minutes après "<<jour<<" jours\n\n";
	
	cout<<"Bonjour client, combien voulez-vous de tablettes de chocolat noir ?\n";
	cin>>nb_noir;
	cout<<"Et de chocolat blanc ?\n";
	cin>>nb_blanc;
	
	prix_noir = nb_noir * 6;
	prix_blanc = nb_blanc * 5;
	
	if (prix_noir + prix_blanc > 200)	{
		prix_noir *= 0.75;
		prix_blanc *= 0.75;
	}
	
	cout<<"Voici donc ce que vous devez payer :\nChocolat noir :\t\t"<<prix_noir<<" €\nChocolat blanc :\t"<<prix_blanc<<" €\nTotal :\t\t\t"<<prix_noir+prix_blanc<<" €\n\n";
	
	return 0;
}

































