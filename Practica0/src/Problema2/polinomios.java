package Problema2;

public class polinomios {
	
	public static long factorial(int n) {
		long fact = 1;
		while (n > 0) {
			fact *= n--;
		}
		return fact;
	}
	
	public static int potencia(int n, int e) {
		int aux = n;
		for (int i = 0; i < (e-1); i++) {
			aux *= n;
		}
		return aux;
	}
	
	public static void main(String args[]) {
		int n = 5;
		float x = 1;
		float hermite0, hermite1, hermite2 = 0;
		
		hermite0 = 1;
		hermite1 = 2 * x;
		
		for (int i = 1; i < n; i++) {
			hermite2 = 2 * x * hermite1 - 2 * (i) * hermite0; 
			hermite0 = hermite1;
			hermite1 = hermite2;
		}
		
		System.out.println(hermite2);
		
		
	}
}
