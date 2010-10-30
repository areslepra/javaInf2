package Problema8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class load {
	public static void main(String args[]) throws IOException {
		DataInputStream miarchivo = new DataInputStream(new FileInputStream(
				"promedio.txt"));
		double promedio = 0.0;
		int numero1, numero2, numero3;
		miarchivo.readUTF();
		numero1 = miarchivo.readInt();
		miarchivo.readUTF();
		numero2 = miarchivo.readInt();
		miarchivo.readUTF();
		numero3 = miarchivo.readInt();
		miarchivo.readUTF();
		promedio = miarchivo.readDouble();
		miarchivo.close();
		System.out.println("N1:" + numero1);
		System.out.println("N2:" + numero2);
		System.out.println("N3:" + numero3);
		System.out.println("Promedio:" + promedio);
	}

}
