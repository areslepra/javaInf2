package Problema5;

public class Carriage {
	private boolean asientos[] = new boolean[40];
	private int tipo;
	
	public Carriage() {
		for (int i = 0; i < asientos.length; i++) {
			asientos[i] = false;
		}
		this.tipo = 0;
	}
	
	public Carriage(int clase) {
		for (int i = 0; i < asientos.length; i++) {
			asientos[i] = false;
		}
		this.tipo = clase;
	}

	public boolean getAsiento(int numero) {
		return asientos[numero];
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public void llenarAsiento() {
		for (int i = 0; i < asientos.length; i++) {
			this.llenarAsiento(i);
		}
	}

	public void llenarAsiento(int numero) {
		if(this.tipo == 1) {
			this.asientos[numero] = Math.random() < 0.1;
		} else {
			this.asientos[numero] = Math.random() < 0.4;
		}
	}
	
}
