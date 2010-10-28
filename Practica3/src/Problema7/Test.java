package Problema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

	private static Datos[][] items;

	public static String readStr() {
		String sdato = "";
		try {
			// Definir un flujo de caracteres de entrada: "readIn"...
			BufferedReader readIn = new BufferedReader(new InputStreamReader(
					System.in));
			// Leer. La entrada, finaliza al pulsar la tecla Entrar...
			sdato = readIn.readLine();
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return sdato; // Devolver el dato tecleado..
	}

	private static void llenarArreglo(int indice) {
		Scanner Lee = new Scanner(System.in);
		int tipo;
		String etiqueta;
		double x, y, z;
		for (int i = 0; i < items[indice].length; i++) {
			System.out.println("Ingrese tipo de dato:");
			System.out.println("\t1 - Punto 2D");
			System.out.println("\t2 - Punto 3D");
			do {
				tipo = Lee.nextInt();
			} while (tipo != 1 && tipo != 2);
			switch (tipo) {
			case 1:
				System.out.println("Ingrese etiqueta:");
				etiqueta = readStr();
				System.out.println("Ingrese coordenada x:");
				x = Lee.nextDouble();
				System.out.println("Ingrese coordenada y:");
				y = Lee.nextDouble();
				items[indice][i] = new Punto2D(x, y, etiqueta);
				break;
			case 2:
				System.out.println("Ingrese etiqueta:");
				etiqueta = readStr();
				System.out.println("Ingrese coordenada x:");
				x = Lee.nextDouble();
				System.out.println("Ingrese coordenada y:");
				y = Lee.nextDouble();
				System.out.println("Ingrese coordenada z:");
				z = Lee.nextDouble();
				items[indice][i] = new Punto3D(x, y, z, etiqueta);
				break;
			}
		}
	}

	private static void agregarArreglo(int cantidadPuntos) {
		Datos[][] aux;
		try {
			aux = new Datos[items.length][cantidadPuntos];
			for (int i = 0; i < items.length; i++) {
				aux[i] = items[i];
			}
			items = aux;
			llenarArreglo(items.length);
		} catch (Exception e) {
			items = new Datos[1][cantidadPuntos];
			llenarArreglo(0);
		}
	}

	private static void iniciarArreglos() {
		Scanner Lee = new Scanner(System.in);
		int cantidad = 1;
		do {
			System.out.println("Ingrese cantidad de puntos:");
			do {
				if (cantidad < 0)
					System.out.println("Cantidad Incorrecta, debe ser mayor o igual a 0:");
				cantidad = Lee.nextInt();
			} while (cantidad < 0);
			if (cantidad != 0) {
				agregarArreglo(cantidad);
				Sorts.sort(items[items.length - 1]);
				for (int i = 0; i < items[items.length - 1].length; i++) {
					System.out.println(items[items.length - 1][i]);
				}
			}
		} while (cantidad != 0);
	}

	public static void main(String[] args) {
		iniciarArreglos();
	}

}
