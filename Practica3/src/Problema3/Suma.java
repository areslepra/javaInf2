package Problema3;

public class Suma implements OperacionBinaria {

	private double a,b;
	
	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double opera() {
		return this.a + this.b;
	}
	
	public String toString() {
		return Double.toString(opera());
	}
	
}
