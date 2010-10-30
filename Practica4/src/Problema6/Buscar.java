package Problema6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buscar {
	public static void main(String[] z) {
		z = new String[2];
		z[0] = "file";
		z[1] = "cadena";
		String archivo, cadena, linea = null;
		FileReader fi;
		BufferedReader br;
		if (z.length != 2) {
			System.out.println("Argumentos invalidos");
			return;
		}
		archivo = z[0];
		cadena = z[1];
		try {
			fi = new FileReader(archivo);
			br = new BufferedReader(fi);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			return;
		}
		int nlinea = 0;
		int[][] pos = null;
		int p;
		while (true) {
			try {
				linea = br.readLine();
			} catch (IOException e) {
				System.out.println("No se encontro el caracter");
				break;
			}
			if (linea != null) {
				nlinea++;
				p = linea.indexOf(cadena);
				if(p >= 0) {
					if(pos != null) {
						int[][] aux = new int[pos.length+1][2];
						for (int i = 0; i < pos.length; i++) {
							aux[i] = pos[i];
						}
						aux[pos.length][0] = nlinea;
						aux[pos.length][1] = p;
					}else{
						pos = new int[1][2];
						pos[0][0] = nlinea;
						pos[0][1] = p;
					}
				}
			}
		}
		if(pos != null) {
			System.out.println("Se encontro veces " + pos.length + " la cadena");
			for (int i = 0; i < pos.length; i++) {
				System.out.println((i+1) + " - Linea: " + pos[i][0] + " Posicion:" + pos[i][1]);
			}
		}else{
			System.out.println("No se encontro la cadena");
		}
	}
}
