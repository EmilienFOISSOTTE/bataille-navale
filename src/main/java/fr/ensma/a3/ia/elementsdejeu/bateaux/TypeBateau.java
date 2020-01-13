package fr.ensma.a3.ia.elementsdejeu.bateaux;

public enum TypeBateau {
	PorteAvion(6), Croiseur(5), ContreTorpilleur(4), 
	SousMarin(3), Torpilleur(2);
	
	private int longueurbateau;
	
	private TypeBateau(int val) {
		longueurbateau=val;
	}
	
	public int getLongueurBateau() {
		return longueurbateau;
	}
}
