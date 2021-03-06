package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String titre = "Les bases de la programmation";
		String auteur = "Graven";
		String editeur = "Nevarg";
		
		boolean test = true;
		
		List<String> chapitres = new ArrayList<>();
		
		chapitres.add("Chapitre 1. Qu�est-ce que le Java ?");
		chapitres.add("Chapitre 2. Qu�est-ce qu�une variable");
		chapitres.add("Chapitre 3. Les Conditions");
		chapitres.add("Chapitre 4. Les tableaux");
				
		System.out.println("Titre de l'ouvrage : " + titre);
		System.out.println("Nom de l'auteur : " + auteur);
		System.out.println("Soci�t� �ditrice : " + editeur);
		
		System.out.println("Sommaire :");
		
		chapitres.forEach(System.out::println);
		
		List<String> chapitreIntro = new ArrayList<>();
		chapitreIntro.add("Les bases de la programmation");
		chapitreIntro.add("Par Graven - Edition Nevarg");
		
		List<String> chapitre1 = new ArrayList<>();
		chapitre1.add("La java est un langage de programmation, Le java est un langage de programmation orient�e objet");
		chapitre1.add("Il permet de faire des applications, des sites web ou encore des bots discords");
		chapitre1.add("Lien pour t�l�charger Java : http ://////");
		chapitre1.add("Il faut aussi le JDK c�est un kit de d�veloppement pour faire des applications en Java. T�l�charger le ici : http///�.");
		
		List<String> chapitre2 = new ArrayList<>();
		chapitre2.add("Une variable est un �l�ment pour stocker temporairement une valeur qui peut changer, varier lors de l�ex�cution du programme.");
		chapitre2.add("Il existe diff�rents types de variable :");
		chapitre2.add("Int pour les nombres");
		chapitre2.add("Floats pour les nombres � virgule");
		chapitre2.add("Boolean pour le VRAI ou FAUX");
		chapitre2.add("String pour le text");
		chapitre2.add("");
		chapitre2.add("Pour faire une variable vous devez faire �a");
		chapitre2.add("Type nomDeLaVariable = valeur ;");
		chapitre2.add("Quelques exemples :");
		chapitre2.add("String pseudo = �Graven�;");
		chapitre2.add("Boolean gagner = false;");
		chapitre2.add("int age = 21;");
		chapitre2.add("float prix = 19.99;");
		
		List<String> chapitre3 = new ArrayList<>();
		chapitre3.add("La condition permet de v�rifier des choses");
		chapitre3.add("Si une condition est vraie alors c�est bien");
		chapitre3.add("Sinon c�est pas bien");
		chapitre3.add("On utilise le if pour le si");
		chapitre3.add("Et le else pour le sinon");
		chapitre3.add("");
		chapitre3.add("Plus d�informations ici : http:////");
		
		List<String> chapitre4 = new ArrayList<>();
		chapitre4.add("Le tableau stocke plusieurs valeurs");
		chapitre4.add("On doit mettre :");
		chapitre4.add("Type[] nomDuTableau = [elements]");
		chapitre4.add("Un tableau commence � 0");
		chapitre4.add("On peut r�cup�rer le premier �lement en faisant nomDuTableau[0]");
		chapitre4.add("On peut utiliser la boucle for each pour afficher chaque valeur du tableau :");
		chapitre4.add("for(Type element : nomDuTableau) {");
		chapitre4.add("System.out.println(element) ;");
		chapitre4.add("}");
		
		List<String> chapitreFin = new ArrayList<>();
		chapitreFin.add("Merci d�avoir lu, ce livre a pour but de vous donner un outil pr�cieux pour apprendre � d�velopper :");
		chapitreFin.add("Le lien de ma chaine youtube :");
		chapitreFin.add("http://youtube.com/user/gravenilvectuto");
		
		Livre livreGraven = new Livre(titre);
		
		livreGraven.ajouterPage(chapitreIntro);
		livreGraven.ajouterPage(chapitre1);
		livreGraven.ajouterPage(chapitre2);
		livreGraven.ajouterPage(chapitre3);
		livreGraven.ajouterPage(chapitre4);
		livreGraven.ajouterPage(chapitreFin);
		
		System.out.println("Nombre de pages : " + livreGraven.getNombrePages());
		
		System.out.println("Quelle page voulez-vous lire ?");
		Scanner scan = new Scanner(System.in);
		int choixPage = scan.nextInt();
		
		while(test == true) {
			
			System.out.println("Page n� " + choixPage + "\n");
			
			if(livreGraven.getNombrePages() >= choixPage && choixPage > 0){
				List<String> lignes = livreGraven.getPage(choixPage-1);
				lignes.forEach(ligne -> System.out.println(ligne));
			}
			else {
				System.out.println("Page introuvable");
			}
			
			System.out.println("Entrer 1 pour aller � la page suivante, 2 pour retourner � la page pr�c�dente et 3 pour quitter :");
			int choix = scan.nextInt();
			
			if (choix == 1)	{
				choixPage += 1;
			}
			else	{
				if (choix == 2)	{
					choixPage -= 1;
				}
				else {
					if (choix == 3) {
						test = false;
					}
				}
			}
			
		}
		scan.close();
		
	}

}
