package Problema5;

public class Test {
	
	public static void main(String args[]) {
		int[] a = new int[] {1,2,3,4}; /* crea un array e inicializa los elementos */
		int[] b = new int[] {-1,2,-3,4,-5};
		MyArray m1 = new MyArray(a); 
		MyArray m2 = new MyArray(b); 
		System.out.println(m1.compareTo(m2)); /* imprime 1, puesto que 1+2+3+4 > -1+2-3+4-5 */
	}

}
