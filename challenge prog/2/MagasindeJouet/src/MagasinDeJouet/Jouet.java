package MagasinDeJouet;

public class Jouet implements Comparable<Jouet> {

	private String nom;
	private int prix;
	private String description;
	private int promo;
	
	Jouet(String nom, int prix, String description, int promo){
		this.setNom(nom);
		this.setPrix(prix);
		this.setDescription(description);
		this.setPromo(promo);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public int compareTo(Jouet jouet1) {
		return this.getNom().compareTo(jouet1.getNom());
	}
	
}
