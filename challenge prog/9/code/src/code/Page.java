package code;

import java.util.List;

public class Page {
	
	private List<String> lignes;
	
	public Page(List<String> lignes)	{
		this.lignes = lignes;
	}

	public List<String> getLignes() {
		return lignes;
	}

	public void setLignes(List<String> lignes) {
		this.lignes = lignes;
	}
}
