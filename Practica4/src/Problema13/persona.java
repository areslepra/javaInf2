package Problema13;

import java.io.Serializable;

@SuppressWarnings("serial")
class Persona implements Serializable {
	private String nombre;
	protected double estatura;
	protected double peso;

	Persona(String nom, double altura, double p) {
		nombre = nom;
		estatura = altura;
		peso = p;
	}

	public double IMC() {
		return peso / (estatura * estatura);
	}

	public String nombre() {
		return nombre;
	}

}