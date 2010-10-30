package Problema5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buscar {

	public static void main(String[] z) {
		String archivo, linea = null;
		char caracter;
		FileReader fi;
		BufferedReader br;
		if (z.length != 2) {
			System.out.println("Argumentos invalidos");
			return;
		}
		if (z[1].length() > 1) {
			System.out.println("Segundo argumento no es caracter");
			return;
		}
		archivo = z[0];
		caracter = z[1].charAt(0);
		try {
			fi = new FileReader(archivo);
			br = new BufferedReader(fi);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			return;
		}
		int nlinea = 0;
		int index_char = 0;
		while (true) {
			try {
				linea = br.readLine();
			} catch (IOException e) {
				System.out.println("No se encontro el caracter");
			}
			if (linea != null) {
				nlinea++;
				System.out.println(linea);
				index_char = linea.charAt(caracter);
				if (index_char > 0) {
					System.out.println("Encontrado en la linea " + nlinea
							+ " caracter " + index_char);
					return;
				}
			}
		}
	}
}
