package Problema13;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class prueba {
	public static void main (String [] z)throws IOException, ClassNotFoundException {
		Persona arreglo[] = null;
		Object obj;
		ObjectInputStream salida = null;
		try {
			salida= new ObjectInputStream(new FileInputStream("personas.dat"));
		}catch(IOException e) {
			System.out.println("No se pudo abrir el archivo");
		}
		while(true) {
			try {
				obj = salida.readObject();
				if(obj instanceof hombre || obj instanceof mujer) {
					if(arreglo == null) {
						arreglo = new Persona[1];
						arreglo[0] = (Persona)obj;
					}else{
						Persona arr[] = new Persona[arreglo.length+1];
						for (int i = 0; i < arreglo.length; i++) {
							arr[i] = arreglo[i];
						}
						arr[arreglo.length] = (Persona)obj;
						arreglo = arr;
					}
				}
			}catch(Exception e){
				break;
			}
		}
		if(arreglo != null) {
			for (int i = 0; i < arreglo.length; i++) {
				System.out.println(arreglo[i]);
			}
		}else{
			System.out.println("No hay Arreglo");
		}
	}
}