package fr.ensma.a3.ia.elementsdejeu.plateaux;
import java.util.List;
import fr.ensma.a3.ia.elementsdejeu.cases.CaseAttaquee;

public class PlateauAttaque extends Plateau{
	private List<CaseAttaquee> listecases;
	
	public PlateauAttaque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlateauAttaque(int taillex, int tailley) {
		super(taillex, tailley);
		// TODO Auto-generated constructor stub
	}

	public List<CaseAttaquee> getListecases() {
		return listecases;
	}

	public void setListecases(List<CaseAttaquee> listecases) {
		this.listecases = listecases;
	}

}
