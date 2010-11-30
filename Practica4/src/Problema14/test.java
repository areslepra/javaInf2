package Problema14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test {

	public static void main(String c[]) {
		Object obj;
		ObjectInputStream salida = null;
		int cant = 0;
		try {
			salida = new ObjectInputStream(new FileInputStream("personas.dat"));
		} catch (IOException e) {
			System.out.println("No se pudo abrir el archivo");
		}
		while (true) {
			try {
				obj = salida.readObject();
				if (obj instanceof Integer) {
					cant ++;
				}
			} catch (Exception e) {
				break;
			}
		}
		System.out.println("Se encontraron " + cant + " objetos Integer");
	}
}
