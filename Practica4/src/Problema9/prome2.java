package Problema9;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class prome2 {
	public static void main(String args[]) throws IOException {
		Scanner inputStream = new Scanner(System.in);
		DataOutputStream miarchivo = new DataOutputStream(new FileOutputStream(
				"promedio.txt"));
		double promedio = 0.0;
		int numero1, numero2, numero3;
		System.out.println("Enter the first number:");
		numero1 = inputStream.nextInt();
		System.out.println("Enter the second number:");
		numero2 = inputStream.nextInt();
		System.out.println("Enter the third number:");
		numero3 = inputStream.nextInt();
		miarchivo.writeUTF("El promedio de ");
		miarchivo.writeInt(numero1);
		miarchivo.writeUTF(", ");
		miarchivo.writeInt(numero2);
		miarchivo.writeUTF(" y ");
		miarchivo.writeInt(numero3);
		miarchivo.writeUTF(" es ");
		promedio = (numero1 + numero2 + numero3) / 3;
		miarchivo.writeDouble(promedio);
		miarchivo.close();
	}
}
