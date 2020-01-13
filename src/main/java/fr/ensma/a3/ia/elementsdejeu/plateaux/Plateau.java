package fr.ensma.a3.ia.elementsdejeu.plateaux;

public abstract class Plateau {
	private int taillex, tailley;

	public Plateau() {
		super();
		this.taillex = 10;
		this.tailley = 10;
	}
	
	public Plateau(int taillex, int tailley) {
		super();
		this.taillex = taillex;
		this.tailley = tailley;
	}
	
	public int getTaillex() {
		return taillex;
	}

	public void setTaillex(int taillex) {
		this.taillex = taillex;
	}

	public int getTailley() {
		return tailley;
	}

	public void setTailley(int tailley) {
		this.tailley = tailley;
	}

}
