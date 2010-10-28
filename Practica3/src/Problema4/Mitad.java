package Problema4;

public class Mitad implements Funcion{
	
	public Mitad() {
	}
	
	public int evaluar(int x) {
		return x/2;
	}
	
	public int[] evaluar(int [] x) {
		int y[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			y[i] = this.evaluar(x[i]);
		}
		return y;
	}
	
	public static int[] evaluar(int [] x, Funcion f) {
		int y[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			y[i] = f.evaluar(x[i]);
		}
		return y;
	}


}
