package Problema10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ListaLibros {

	private Libro libros[];

	public ListaLibros() {
		this.libros = null;
	}

	public void addLibro(Libro l) {
		if (this.libros == null) {
			this.libros = new Libro[1];
			this.libros[0] = l;
		} else {
			Libro a[] = new Libro[this.libros.length+1];
			for (int i = 0; i < this.libros.length; i++) {
				a[i] = this.libros[i];
			}
			a[this.libros.length] = l;
			this.libros = a;
		}
	}

	public String toString() {
		String c = "";
		for (int i = 0; i < this.libros.length; i++) {
			c += this.libros[i].toString() + "\n";
		}
		return c;
	}

	public void cargarDe(String path) {
		DataInputStream miarchivo;
		try{
			miarchivo = new DataInputStream(new FileInputStream(path));
		}catch (IOException e) {
			System.out.println("No se pudo leer. Archivo no encontrado.");
			return;
		}
		try {
			Libro ls[] = new Libro[miarchivo.readInt()];
			for (int i = 0; i < ls.length; i++) {
				ls[i] = new Libro(miarchivo.readUTF().replaceAll("\n", ""),miarchivo.readUTF().replaceAll("\n", ""));
			}
			this.libros = ls;
		} catch (IOException e) {
			System.out.println("No se pudo leer. Error en la lectura de los libros.");
		}
	}

	public void guardarA(String path) {
		DataOutputStream miarchivo;
		try {
			miarchivo = new DataOutputStream(new FileOutputStream(path));
		} catch (Exception e) {
			System.out.println("No se pudo guardar. Error al crear el archivo.");
			return;
		}
		try {
			miarchivo.writeInt(this.libros.length);
			for (int i = 0; i < this.libros.length; i++) {
				miarchivo.writeUTF(this.libros[i].getNombre()+"\n");
				miarchivo.writeUTF(this.libros[i].getAutor()+"\n");
			}
		} catch (IOException e) {
			System.out.println("No se pudo guardar. Error de escritura.");
			return;
		}
		try {
			miarchivo.close();
		} catch (IOException e) {
			System.out.println("No se pudo guardar. Error de cerrado de archivo.");
			return;
		}
	}
}
