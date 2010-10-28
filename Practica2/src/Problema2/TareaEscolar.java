package Problema2;

public class TareaEscolar extends Tarea {
	
	private int cProblemas;
	
	public TareaEscolar() {
		super();
	}
	
	public TareaEscolar(int cP) {
		super();
		
		this.cProblemas = cP;
	}
	
	public int getCProblemas() {
		return this.cProblemas;
	}
	
	public void setCProblemas(int cP) {
		this.cProblemas = cP;
	}
	
	public int cuantoTiempo() {
		return this.cProblemas * 10;
	}
}
