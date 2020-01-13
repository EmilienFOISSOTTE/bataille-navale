package fr.ensma.a3.ia.elementsdejeu.cases;

import fr.ensma.a3.ia.elementsdejeu.bateaux.MorceauDeBateau;

public class CaseNavires extends Case{
	private MorceauDeBateau morceau;
	
	public CaseNavires(MorceauDeBateau morceau) {
		this.setMorceau(morceau);
	}

	public MorceauDeBateau getMorceau() {
		return morceau;
	}

	public void setMorceau(MorceauDeBateau morceau) {
		this.morceau = morceau;
	}
}
