package Problema3;

public class Alumno {

	private String nombre;
	private int[] notas = new int[4];
	
	public Alumno () {
		this.nombre = "";
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i] = 0;
		}
	}
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i] = 0;
		}		
	}
	
	public Alumno(String nombre, int[] notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public int getNota(int indice) {
		return notas[indice];
	}

	public void setNotas(int notas, int indice) {
		this.notas[indice] = notas;
	}
	
	public int cantidadAprobados() {
		int cantidad = 0;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] >=7) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public String toString() {
		return ("Alumno: " + this.nombre + " - Notas: " 
				+ this.notas[0] + " - " + this.notas[1]
				+ " - " + this.notas[2] + " - " + this.notas[3]);
	}
}
