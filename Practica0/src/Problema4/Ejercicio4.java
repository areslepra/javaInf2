package Problema4;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		int n = 20;
		
		double sumatoriaX = 0;
		double sumatoriaY = 0;
		double sumatoriaX2 = 0;
		double sumatoriaY2 = 0;
		double sumatoriaXY = 0;
		
		double m = 0;
		double h = 0;
		double delta = 0;
		
		double x[] = new double[n];
		double y[] = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = i;
			y[i] = i;
		}
		
		for (int i = 0; i < x.length; i++) {
			sumatoriaX += x[i];
			sumatoriaY += y[i];
			sumatoriaX2 += Math.sqrt(x[i]);
			sumatoriaY2 += Math.sqrt(y[i]);
			sumatoriaXY += x[i]*y[i];
		}
		
		delta = n * sumatoriaX2 - Math.pow(sumatoriaX,2);
		m = (n * sumatoriaXY - sumatoriaX*sumatoriaY)/delta;
		h = (sumatoriaX2*sumatoriaY - sumatoriaX*sumatoriaXY)/delta;
		
		System.out.println("M = " + m);
		System.out.println("H = " + h);
	}

}
