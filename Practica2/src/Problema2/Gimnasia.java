package Problema2;

public class Gimnasia extends Tarea {
	
	private boolean bicicleta;
	
	public Gimnasia() {
		super();
	}
	
	public Gimnasia(boolean bicicleta) {
		super();
		this.bicicleta = bicicleta;
	}
	
	public void setBicicleta(boolean bicicleta) {
		this.bicicleta = bicicleta;
	}
	
	public boolean getBicicleta() {
		return this.bicicleta;
	}
	
	public int cuantoTiempo() {
		return (this.bicicleta ? 60 : 80);
	}

}
