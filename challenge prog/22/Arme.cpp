#include <iostream>

using namespace std;

#include "Arme.h"

Arme::Arme(string nom)	{
	if (nom == "Arc")	{
		this->setNom(nom);
		this->setAttaque(15);
	}
	if (nom == "Lame Tranchante")	{
		this->setNom(nom);
		this->setAttaque(30);
	}
	if (nom == "Massue")	{
		this->setNom(nom);
		this->setAttaque(23);
	}
}






















