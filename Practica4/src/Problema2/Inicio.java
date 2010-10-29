package Problema2;

import java.util.Scanner;

public class Inicio {

	public static void menu(Empleado em[]) {
		while (true) {
			Scanner s = new Scanner(System.in);
			int opt;
			do {
				System.out.println("Seleccione opcion:");
				System.out.println("\n1) Calcular el sueldo mínimo");
				System.out.println("\n2) Buscar Sueldo");
				System.out.println("\n3) Sueldo Promedio");
				System.out.println("\n4) Salir");
				System.out.println("Opcion:");
				opt = s.nextInt();
			} while (opt != 1 && opt != 2 && opt != 3 && opt != 4);
			switch (opt) {
			case 1:
				double menor;
				int cant;
				cant = 1;
				menor = em[0].getSueldo();
				for (int i = 0; i < em.length; i++) {
					if (menor == em[i].getSueldo()) {
						cant++;
					} else {
						if (menor > em[i].getSueldo()) {
							menor = em[i].getSueldo();
							cant = 1;
						}
					}
				}
				System.out.println("Menor sueldo: " + menor + " " + cant
						+ "veces");
				continue;
			case 2:
				double sueldo;
				System.out.println("Sueldo a buscar:");
				sueldo = s.nextDouble();
				int encontrado = -1;
				for (int i = 0; i < em.length; i++) {
					if (em[i].getSueldo() == sueldo) {
						encontrado = i;
						break;
					}
				}
				System.out.println("Sueldo en la posicion:" + encontrado);
				continue;
			case 3:
				float prom = 0;
				for (int i = 0; i < em.length; i++) {
					prom += em[i].getSueldo();
				}
				prom /= 10;
				int id = 0;
				for (int i = 0; i < em.length; i++) {
					if (Math.abs(prom - em[id].getSueldo()) > Math.abs(prom
							- em[i].getSueldo())) {
						id = i;
					}
				}
				System.out.println("El promedio de los sueldos es :" + prom
						+ " y el mas cercano es " + em[id].getNombre() + "con "
						+ em[id].getSueldo());
				continue;
			case 4:
				return;
			}
		}
	}

	public static void main(String[] args) {
		Empleado em[] = new Empleado[10];
		Scanner s = new Scanner(System.in);
		String nombre;
		double sueldo;
		for (int i = 0; i < em.length; i++) {
			System.out.println("Ingrese empleado:");
			System.out.println("Nombre:");
			nombre = s.nextLine();
			System.out.println("Sueldo:");
			sueldo = s.nextDouble();
			em[i] = new Empleado(nombre, sueldo);
		}
		menu(em);
	}
}
