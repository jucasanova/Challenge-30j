#pragma once
#include <iostream>
#include <string>
using namespace std;


class Arme	{
	public:
		Arme(string nom);
		void setNom(string nom)	{this->nom = nom;}
		void setAttaque(int attaque)	{this->attaque = attaque;}
		int getAttaque()	{return this->attaque;}
	private:
		string nom;
		int attaque;
};
