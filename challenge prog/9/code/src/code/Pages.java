package code;

import java.util.List;

public class Pages {
	
	private List<String> lignes;
	
	public Pages(List<String> lignes)	{
		this.lignes = lignes;
	}

	public List<String> getLignes() {
		return lignes;
	}

	public void setLignes(List<String> lignes) {
		this.lignes = lignes;
	}
}
