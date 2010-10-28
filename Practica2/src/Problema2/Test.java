package Problema2;

public class Test {

	public static void main(String args[]) {
		Tarea t[] = new Tarea[5];
		int tiempo = 0;
		
		t[0] = new Gimnasia(true);
		t[1] = new Gimnasia(false);
		t[2] = new TareaEscolar(2);
		t[3] = new TareaEscolar(6);
		t[4] = new Comidas();
		
		for (int i = 0; i < 5; i++) {
			tiempo += t[i].cuantoTiempo();
		}
		
		System.out.println("Tiempo total: " + tiempo);
	}
	
	
}
