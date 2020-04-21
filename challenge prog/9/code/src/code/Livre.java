package code;

import java.util.ArrayList;
import java.util.List;

public class Livre {
	
	private List<Page> pages;
	private String nomLivre;
	
	public Livre(String nomLivre)	{
		this.pages = new ArrayList<>();
		this.nomLivre = nomLivre;
	}
	
	public List<String> getPage(int numPage)	{
		return pages.get(numPage).getLignes();
	}
	
	public void ajouterPage(List<String> lignes)	{
		pages.add(new Page(lignes));
	}
	
	public int getNombrePages()	{
		return this.pages.size();
	}
	
	public String getNomLivre() {
		return nomLivre;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
}
