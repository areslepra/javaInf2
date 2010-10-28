package Problema3;

public class Codicion {
	
	public static void main(String args[]) {
		Alumno a = new Alumno("Ignacio Daniel Rostagno");
		int notas[] = {5,8,1,10}; 
		
		a.setNotas(notas);
		
		System.out.println(a);
		
		System.out.println("Aprobados: " + a.cantidadAprobados());
	}
}
