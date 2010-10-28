package Problema3;

public class Division extends Multiplicacion implements OperacionBinaria {
	
	public Division(double a, double b) {
		super(a, 1/ b);
	}
	
	public double opera() {
		return super.opera();
	}
	
	public String toString() {
		return Double.toString(opera());
	}
}
