package Problema2;

public class Circulo extends Figura{
	
	private double radio;

	public Circulo() {
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI * this.radio * this.radio;
	}
	
	public double perimetro() {
		return Math.PI * 2 * this.radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String toString() {
		return "Circulo [Radio=" + radio + ", Area=" + this.area() + ", Perimetro=" + this.perimetro() + "]";
	}

	
}
