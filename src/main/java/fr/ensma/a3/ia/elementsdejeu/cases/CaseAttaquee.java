package fr.ensma.a3.ia.elementsdejeu.cases;

public class CaseAttaquee extends Case{
	private int vierestant;
	private EtatCase etatcourant;
	
	public CaseAttaquee() {
		setEtatCourant(EtatCase.Unknown);
	}
	
	public int getVieRestant() {
		return vierestant;
	}

	public void setVieRestant(int vierestant) {
		this.vierestant = vierestant;
	}

	public EtatCase getEtatCourant() {
		return etatcourant;
	}

	public void setEtatCourant(EtatCase etatcourant) {
		this.etatcourant = etatcourant;
	}

}
