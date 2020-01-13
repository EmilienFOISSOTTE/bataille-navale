package fr.ensma.a3.ia.elementsdejeu.bateaux;
import java.util.ArrayList;
import java.util.List;

public class Bateau {
	private int id;
	private int longueur;	
	private int posix, posigrec;
	private EOrientation orientation;
	
	private ETypeBateau typebateau;
	private List<MorceauDeBateau> batiment;
	
	public Bateau(int id, int posix, int posigrec, ETypeBateau montypebateau) {
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

	public ETypeBateau getTypebateau() {
		return typebateau;
	}

	public void setTypebateau(ETypeBateau typebateau) {
		this.typebateau = typebateau;
	}

	public int getLongueur() {
		return longueur;
	}

	public int getPosix() {
		return posix;
	}

	public void setPosix(int posix) {
		this.posix = posix;
	}

	public int getPosigrec() {
		return posigrec;
	}

	public void setPosigrec(int posigrec) {
		this.posigrec = posigrec;
	}

	public EOrientation getOrientation() {
		return orientation;
	}

	public void setOrientation(EOrientation orientation) {
		this.orientation = orientation;
	}

	public List<MorceauDeBateau> getBatiment() {
		return batiment;
	}

	public void setBatiment(List<MorceauDeBateau> batiment) {
		this.batiment = batiment;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

}
