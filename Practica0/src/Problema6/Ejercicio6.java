package Problema6;

public class Ejercicio6 {
	
	public static int busquedaSecuencial(int buscado, int lista[]) {
		int encontrado = -1;
		int i = 0;
		while (i < lista.length && encontrado < 0) {
			if(lista[i] == buscado) {
				encontrado = (i);
			}
			i++;
		}
		return encontrado;
	}

	public static void main(String args[]) {
		int[] numeros = {4,2,5,8,1,7,8};
		int index;
		int min;
		int swap;
		
		for (int i = 0; i < numeros.length; i++) {
			index = i;
			min = numeros[i];
			for (int j = i; j < numeros.length; j++) {
				if(min > numeros[j]) {
					index = j;
					min = numeros[j];
				}
			}
			swap = numeros[i];
			numeros[i] = numeros[index];
			numeros[index] = swap;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println(busquedaSecuencial(4,numeros));
		
	}
	
}
