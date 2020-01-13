package fr.ensma.a3.ia.elementsdejeu.bateaux;

public class MorceauDeBateau {
	private int defense;
	private Boolean coule;
	private Boolean touche;
	
	
	public MorceauDeBateau(int defense, Boolean coule, Boolean touche) {
		super();
		this.defense = defense;
		this.coule = coule;
		this.touche = touche;
	}


	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Boolean getCoule() {
		return coule;
	}

	public void setCoule(Boolean coule) {
		this.coule = coule;
	}

	public Boolean getTouche() {
		return touche;
	}

	public void setTouche(Boolean touche) {
		this.touche = touche;
	}

}
