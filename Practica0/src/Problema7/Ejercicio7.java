package Problema7;

public class Ejercicio7 {
	public static void main(String args[]) {
		int n = 20;
		
		double m[][] = new double[n][n];
		double s = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = i;
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			s += m[i][i];
		}
		
		System.out.println("Traza = " + s);
		
	}
}
