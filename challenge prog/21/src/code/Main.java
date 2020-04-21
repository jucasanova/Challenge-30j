package code;

import java.util.Scanner;

public class Main {

    private static int compteCourant;
    private static int decouvertAutorise;

    public static void affichersolde() {
        System.out.println("Votre solde : " + compteCourant + "€");
    }

    public static int deposerArgent(int montant) {
        System.out.println(montant + " € déposés !");
        return compteCourant += montant;
    }

    public static int retirerArgent(int montant) {
        if (montant > (compteCourant + decouvertAutorise)) {
            System.out.println("Montant supérieur au solde\nTransaction annulée");
            return compteCourant;
        }
        else {
            System.out.println(montant + " € retirés !");
            return compteCourant -= montant;
        }
    }

    public static void main(String[] args) {

        compteCourant = 9600;
        decouvertAutorise = -120;
        boolean run = true;

        while (run) {
            System.out.println("Bienvenue à la GBA (Graven Banque et Assurance) que souhaitez-vous faire ?");
            System.out.println("1. Afficher solde");
            System.out.println("2. Dépot argent");
            System.out.println("3. Retrait argent");
            System.out.println("4. Quitter");


            Scanner scan = new Scanner(System.in);
            int choix =  scan.nextInt();

            if (choix == 1) {
                affichersolde();
            }
            if (choix == 2) {
                System.out.println("Quel montant voulez-vous déposer ?");
                int montant = scan.nextInt();
                compteCourant = deposerArgent(montant);
            }
            if (choix == 3) {
                System.out.println("Quel montant voulez-vous retirer ?");
                int montant = scan.nextInt();
                compteCourant = retirerArgent(montant);
            }
            if (choix == 4) {
                System.out.println("A bientôt !");
                run = false;
            }
        }
        

    }

}
