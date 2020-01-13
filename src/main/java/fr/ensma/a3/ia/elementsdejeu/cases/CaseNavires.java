package fr.ensma.a3.ia.elementsdejeu.cases;

import fr.ensma.a3.ia.elementsdejeu.bateaux.CaseBombe;
import fr.ensma.a3.ia.elementsdejeu.bateaux.MorceauDeBateau;

public class CaseNavires extends Case{
	private MorceauDeBateau morceau;
	private CaseBombe bombe;
	
	public CaseNavires(MorceauDeBateau morceau) {
		this.setMorceau(morceau);
	}
	
	public CaseNavires(MorceauDeBateau morceau, CaseBombe bombe) {
		this.setMorceau(morceau);
		this.bombe = bombe;
	}

	public MorceauDeBateau getMorceau() {
		return morceau;
	}

	public void setMorceau(MorceauDeBateau morceau) {
		this.morceau = morceau;
	}

	public CaseBombe getBombe() {
		return bombe;
	}
}
