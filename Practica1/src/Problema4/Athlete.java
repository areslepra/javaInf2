package Problema4;

public class Athlete {

	private String nombre;
	private String nacionalidad;
	private int numero;
	private double tiempo;
	
	public Athlete() {
		this.nombre = "";
		this.nacionalidad = "";
		this.tiempo = 0;
		this.numero = 0;
	}

	public Athlete(String nombre) {
		this.nombre = nombre;
		this.nacionalidad = "";
		this.tiempo = 0;
		this.numero = 0;
	}

	public Athlete(String nombre, int numero) {
		this.nombre = nombre;
		this.nacionalidad = "";
		this.tiempo = 0;
		this.numero = numero;
	}

	public Athlete(String nombre, int numero, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.tiempo = 0;
		this.numero = numero;
	}

	public Athlete(String nombre, int numero, String nacionalidad, double tiempo) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.tiempo = tiempo;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
