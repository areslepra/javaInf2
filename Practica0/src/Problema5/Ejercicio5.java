package Problema5;

public class Ejercicio5 {
	
	public static boolean palindromo(String palabra) {
		
		for (int i = 0; i < (palabra.length()/2+1); i++) {
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-(i+1))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println(palindromo("ABCcdCBA"));
	}

}
