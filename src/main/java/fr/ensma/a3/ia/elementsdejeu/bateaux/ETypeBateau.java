package fr.ensma.a3.ia.elementsdejeu.bateaux;

public enum ETypeBateau {
	PorteAvion(6), Croiseur(5), ContreTorpilleur(4), 
	SousMarin(3), Torpilleur(2), Voilier(1);
	
	private int longueurbateau;
	
	private ETypeBateau(int val) {
		longueurbateau=val;
	}
	
	public int getLongueurBateau() {
		return longueurbateau;
	}
}
