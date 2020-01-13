package fr.ensma.a3.ia.elementsdejeu.bateaux;
import java.util.ArrayList;
import java.util.List;

public class Bateau extends {
	private int id;
	private int longueur;	
	private int posix, posigrec;
	private boolean horizontal;
	
	private TypeBateau typebateau;
	private List<MorceauDeBateau> batiment;
	
	public Bateau(int id, int posix, int posigrec, TypeBateau montypebateau) {
		this.id = id;
		this.posix = posix;
		this.posigrec = posigrec;
		typebateau = montypebateau;
		longueur = montypebateau.getLongueurBateau();
		batiment = new ArrayList<MorceauDeBateau>();
	}

	public void addMorceau(MorceauDeBateau morceau) throws BatimentPleinException{
		if (batiment.size() < longueur) {
			morceau.setTouche(false);
			morceau.setCoule(false);
			morceau.setDefense(longueur);
			batiment.add(morceau);
		}
		else {
			throw new BatimentPleinException();
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeBateau getTypebateau() {
		return typebateau;
	}

	public void setTypebateau(TypeBateau typebateau) {
		this.typebateau = typebateau;
	}

	public int getLongueur() {
		return longueur;
	}
}
