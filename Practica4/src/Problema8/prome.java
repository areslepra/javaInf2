package Problema8;

import java.io.*;

class prome {
	public static void main(String args[]) throws IOException {
		InputStream in = System.in;
		DataInputStream inputStream = new DataInputStream(in);
		DataOutputStream miarchivo = new DataOutputStream(new FileOutputStream(
				"promedio.txt"));
		double promedio = 0.0;
		int numero1, numero2, numero3;
		System.out.println("Enter the first number:");
		numero1 = Integer.valueOf(inputStream.readLine().trim()).intValue();
		System.out.println("Enter the second number:");
		numero2 = Integer.valueOf(inputStream.readLine().trim()).intValue();
		System.out.println("Enter the third number:");
		numero3 = Integer.valueOf(inputStream.readLine().trim()).intValue();
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
		String line = inputStream.readLine();
	}
}
