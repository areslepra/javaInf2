package Problema3;

public class Ejecicio3 {
	
	public static void main(String args[]) {
		int n = 20;
		double med[] = new double[n];
		double x = 0;
		double o = 0;
		for (int i = 0; i < n; i++) {
			med[i] = Math.random() * 10;
		}
		
		for (int i = 0; i < med.length; i++) {
			x=x+med[i];
		}
		x /= n;
		
		System.out.println("Promedio: " + x);
		
		for (int i = 0; i < med.length; i++) {
			o = Math.pow(med[i] - x, 2);
		}
		o = Math.sqrt(o/n);
				
		System.out.println("Sigma: " + o);
	}
}
