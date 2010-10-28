package Problema8;

public class Test {
	public static void main(String args[]) {
		Talonario t = new Talonario('A',"Juan Perez", 10);
		if (t.numeroDisp(20)) {
			System.out.println("Esta disponible");
		}else{
			System.out.println("No esta disponible");
		}
	}
}
