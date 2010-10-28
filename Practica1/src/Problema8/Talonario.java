package Problema8;

public class Talonario {
	private Vendedor v;
	private char identif;
	private boolean [] disponibles;
	
	public Talonario() {
		this.disponibles = new boolean[100];
		for (int i = 0; i < 100; i++) {
			this.disponibles[i] = true;
		}
		this.v = new Vendedor();
	}
	
	public Talonario(Vendedor vendedor, char identificador) {
		this.v = vendedor;
		this.identif = identificador;
		this.disponibles = new boolean[100];
		for (int i = 0; i < 100; i++) {
			this.disponibles[i] = true;
		}
	}
	
	public Talonario (char identificador, String Nombre, int legajo) {
		this.v = new Vendedor(Nombre,legajo);
		this.identif = identificador;
		this.disponibles = new boolean[100];
		for (int i = 0; i < 100; i++) {
			this.disponibles[i] = true;
		}
		
	}
	
	public void seVendio(int rifa) {
		this.disponibles[rifa-1] = false;
	}
	
	public boolean numeroDisp(int numero) {
		return this.disponibles[numero-1];
	}
	
	public boolean quedaAlguna() {
		boolean quedan = false;
		int i = 0;
		while (!quedan || i < 100) {
			quedan = this.disponibles[i];
		}
		return quedan;
	}

	public Vendedor getV() {
		return v;
	}

	public void setV(Vendedor v) {
		this.v = v;
	}

	public char getIdentif() {
		return identif;
	}

	public void setIdentif(char identif) {
		this.identif = identif;
	}

	public boolean getDisponibles(int numero) {
		return disponibles[numero-1];
	}

	public void setDisponibles(boolean disponibles, int numero) {
		this.disponibles[numero-1] = disponibles;
	}
}
