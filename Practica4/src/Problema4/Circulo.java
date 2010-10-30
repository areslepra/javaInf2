package Problema4;

public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	double area() {
		return Math.PI * radio * radio;
	}

}
