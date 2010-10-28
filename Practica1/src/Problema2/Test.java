package Problema2;

public class Test {
	public static void main(String args[]) {
		Tanque t = new Tanque();
		while (t.getContenido() > 1.0) {
			t.sacaMitad();
		}
		
		System.out.println(t.getContenido());
	}
}
