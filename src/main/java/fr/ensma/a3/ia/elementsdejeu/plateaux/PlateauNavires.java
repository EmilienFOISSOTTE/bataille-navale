package fr.ensma.a3.ia.elementsdejeu.plateaux;
import java.util.List;
import fr.ensma.a3.ia.elementsdejeu.cases.CaseNavires;

public class PlateauNavires extends Plateau{
	private List<CaseNavires> listecases;

	public PlateauNavires(int taillex, int tailley) {
		super(taillex, tailley);
		// TODO Auto-generated constructor stub
	}

	public PlateauNavires() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<CaseNavires> getListecases() {
		return listecases;
	}

	public void setListecases(List<CaseNavires> listecases) {
		this.listecases = listecases;
	}

}
