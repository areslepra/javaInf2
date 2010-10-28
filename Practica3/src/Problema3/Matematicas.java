package Problema3;

class Matematicas {
	public static void main(String[] args) {
		OperacionBinaria op1 = new Suma(4, 3);
		OperacionBinaria op2 = new Resta(4, 3);
		OperacionBinaria op3 = new Multiplicacion(4, 3);
		OperacionBinaria op4 = new Division(4, 3);
		// estas 2 sentencias determinan la relación entre Suma/Resta
		// //Multiplicacion/División
		Suma op5 = new Resta(3, 4);
		Multiplicacion op6 = new Division(3, 4);
		OperacionBinaria[] v = { op1, op2, op3, op4, op5, op6 };
		for (int i = 0; i < v.length; i++)
			System.out.println(v[i]);
	}
}