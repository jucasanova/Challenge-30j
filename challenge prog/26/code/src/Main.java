import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean run = true;
        String portail = "1";
        int elixir = 0;

        Scanner scanner = new Scanner(System.in);

        while(run) {

            switch(portail) {
                case "1":
                    System.out.println("Bienvenue devant le portail n°1");
                    System.out.println("Veuillez entrer votre pseudo : ");
                    String pseudoA = scanner.nextLine();
                    if (pseudoA.contains("XR12CV7")) {
                        System.out.println("Décryptage terminé");
                        portail = "2";
                    }
                    else {
                        System.out.println("Accès à la dimension non autorisé");
                    }
                    break;
                case "1B":
                    System.out.println("Bienvenue devant le portail n°1");
                    System.out.println("Veuillez entrer votre pseudo : ");
                    String pseudoB = scanner.nextLine();
                    if (pseudoB.contains("XR12CV7")) {
                        System.out.println("L’erreur est la raison du doute, souffre la fureur du dragon");
                        portail = "1";
                    }
                    else {
                        System.out.println("Voulez-vous un elixir ? (Oui/Non)");
                        if (scanner.nextLine() == "Oui"){
                            elixir += 1;
                        }
                        portail = "3";
                    }
                    break;
                case "2":
                    System.out.println("Bienvenue devant le portail n°2, l’obscurité s’intensifie");
                    System.out.println("Veuillez entrer un nombre entre 1 et 9 : ");
                    int choix2 = scanner.nextInt();
                    if (choix2 % 2 == 0) {
                        System.out.println("La voix des anciens est avec nous");
                        portail = "3";
                    }
                    else {
                        portail = "1B";
                    }
                    break;
                case "2B":
                    System.out.println("Bienvenue devant le portail n°2 – La détresse");
                    if (elixir > 0) {
                        System.out.println("La solution donne gain de cause");
                        portail = "2";
                    }
                    else {
                        portail = "4";
                    }
                    break;
                case "3":
                    System.out.println("Bienvenue devant le portail n°3, l’attente");
                    String phrase = scanner.nextLine();
                    if (phrase.contains("dragon")) {
                        portail = "2B";
                    }
                    else {
                        portail = "2";
                    }
                    break;
                case "4":
                    System.out.println("Bienvenue devant le portail n°2, l’obscurité s’intensifie");
                    System.out.println("Veuillez entrer un nombre entre 1 et 9 : ");
                    int choix4 = scanner.nextInt();
                    if (choix4 % 2 == 0) {
                        System.out.println("Gagné ! vous rejoignez la constellation");
                        run = false;
                    }
                    else {
                        portail = "1B";
                    }
                    break;
            }

        }

    }

}
