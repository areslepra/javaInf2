package Problema3;

public class Multiplicacion implements OperacionBinaria {

	private double a,b;
	
	public Multiplicacion(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double opera() {
		return this.a * this.b;
	}
	
	public String toString() {
		return Double.toString(opera());
	}

}
