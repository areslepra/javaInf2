package Problema1;

public class Raiz {
	
	public static double discriminante(double a, double b, double c) {
		return (b * b - 4 * a * c);
	}
	
	public static double raizA(double a, double b, double c) {
		return ((-b + Math.sqrt(discriminante(a,b,c)))/ (2 * a));
	}
	
	public static double raizB(double a, double b, double c) {
		return ((-b - Math.sqrt(discriminante(a,b,c)))/ (2 * a));
	}
	
	public static void main(String args[]) {
		double a,b,c;
		
		a = 1;
		b = 2;
		c = -8;
		
		if(a == 0 && b == 0) {
			System.out.println("No hay solucion");
		}else if (a == 0 && b != 0) {
			System.out.println(-c / b);
		}else if (discriminante(a,b,c) < 0) {
			System.out.println("No hay soluciones reales");
		}else if (discriminante(a,b,c) == 0) {
			System.out.println(raizA(a,b,c));
		}else {
			System.out.println(raizA(a,b,c));
			System.out.println(raizB(a,b,c));
		}
	}
}
