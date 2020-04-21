package sample;

public class CompteCourant {

    // attributs
    private String nomProprietaire;
    private int montant;
    private int decouvertAutorise;

    // constructeur
    public CompteCourant(String nomProprietaire, int montant){
        this.nomProprietaire = nomProprietaire;
        this.montant = montant;
        this.decouvertAutorise = 0;
    }

    public int getSolde()   {
        return this.montant;
    }

    // methodes
    public void afficherSolde(){
        System.out.println("Solde : " + this.montant + "€");
    }

    public void deposerArgent(int montant){
        this.montant += montant;
    }

    public void retirerArgent(int montant){
        int montantApresCalcul = this.montant - montant;
        if(montantApresCalcul >= this.decouvertAutorise){
            this.montant -= montant;
        }else{
            System.out.println("Vous n'avez pas les fonds !");
        }
    }


}