package Problema3;

public class Resta extends Suma implements OperacionBinaria {
	
	public Resta(double a, double b) {
		super(a,-b);
	}
	
	public double opera() {
		return super.opera();
	}

	public String toString() {
		return Double.toString(opera());
	}

}
