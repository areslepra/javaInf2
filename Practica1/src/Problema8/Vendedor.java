package Problema8;

public class Vendedor {
	private String nombre;
	private int legajo;
	
	public Vendedor() {
	}
	
	public Vendedor(String Nombre, int legajo) {
		this.nombre=Nombre;
		this.legajo=legajo;
	}
	
	public String toString() {
		return ("( Vendedor: " + this.nombre + ", Legajo: " + this.legajo + " )");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	
}
