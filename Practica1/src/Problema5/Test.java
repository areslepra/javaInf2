package Problema5;

public class Test {
	public static void main(String args[]) {
		Carriage c = new Carriage(2);
		
		for (int i = 0; i < 40; i++) {
			c.llenarAsiento(i);
		}
		
		for (int i = 0; i < 40; i++) {
			System.out.println("Asiento[" + i + "] = " + c.getAsiento(i));
		}
	}
}
