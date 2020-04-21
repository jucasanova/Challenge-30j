package MagasinDeJouet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Jouet> jouets = new ArrayList<>();
		
		jouets.add(new Jouet("Scrubble Deluxe",20,"Petit jeu de soci�t�",5));
		jouets.add(new Jouet("Lu Garu",15,"Jeu avec pleins de r�les",10));
		jouets.add(new Jouet("Zebre Figurine",6,"Super figurine de Z�bre",5));
		jouets.add(new Jouet("Osobot Evo",70,"Robot pour apprendre � programmer",15));
		jouets.add(new Jouet("Araign�e peluche",30,"Peluche toute douce",5));
		jouets.add(new Jouet("Ligo Start wars",120,"Super Ligo box de Start wars",20));
		jouets.add(new Jouet("Bakogan Battle Pack",20,"Jeu de bataille de figurine",0));
		
		
		
		System.out.println("Avant tri : ");
		for(Jouet jouet:jouets){
			System.out.println("nom : " + jouet.getNom() + ", Prix : " + jouet.getPrix() + ", Description : " + jouet.getDescription() + ", Promo : " + jouet.getPromo() + "%");
		}
		
		Collections.sort(jouets, new Comparator<Jouet>(){

			@Override
			public int compare(Jouet jouet0, Jouet jouet1) {
				
				if(jouet0.getPrix() == jouet1.getPrix())	{
					return jouet0.compareTo(jouet1);
				}
				
				return jouet0.getPrix() - jouet1.getPrix();
			}
			
		});
		
		System.out.println("Apr�s tri : ");
		for(Jouet jouet:jouets){
			System.out.println("nom : " + jouet.getNom() + ", Prix : " + jouet.getPrix() + ", Description : " + jouet.getDescription() + ", Promo : " + jouet.getPromo() + "%");
		}
		
	}

}
