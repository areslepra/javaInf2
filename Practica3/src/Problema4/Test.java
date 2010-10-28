package Problema4;

public class Test {
	
	public static void main(String args[]) {
		Mitad m = new Mitad();
		
		for (int n : m.evaluar( new int[] {2,4,6,8,10})) {
			System.out.println(n);
		}
		System.out.println("END");
		
		for (int n : Mitad.evaluar( new int[] {2,4,6,8,10},m)) {
			System.out.println(n);
		}
	}

}
