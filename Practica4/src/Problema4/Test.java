package Problema4;

import java.util.Scanner;

public class Test {
	
	private static Figura[] addFigura(Figura[] figuras, Figura f) {
		if(figuras != null) {
			Figura fs[] = new Figura[figuras.length+1];
			for (int i = 0; i < fs.length - 1; i++) {
				fs[i] = figuras[i];
			}
			figuras = fs;
		}else{
			figuras = new Figura[1];
		}
		figuras[figuras.length - 1] = f;
		return figuras;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tipo;
		Figura fgs[] = null;
		do{
			do{
			System.out.println("Tipo de figura:");
			System.out.println("1-Circulo");
			System.out.println("2-Triangulo");
			System.out.println("3-Rectangulo");
			System.out.println("4-Terminar");
			tipo = s.nextInt();
			}while(tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4);
			switch(tipo) {
			case 1:
				double radio;
				do{
					System.out.println("Radio:");
					radio = s.nextDouble();
				}while(radio <= 0);
				fgs = addFigura(fgs, new Circulo(radio));
				continue;
			case 2:
				double width;
				double height;
				do{
					System.out.println("Ancho:");
					width = s.nextDouble();
				}while(width <= 0);
				do{
					System.out.println("Alto:");
					height = s.nextDouble();
				}while(height <= 0);
				fgs = addFigura(fgs, new Triangulo(width,height));
				continue;
			case 3:
				double width2;
				double height2;
				do{
					System.out.println("Ancho:");
					width2 = s.nextDouble();
				}while(width2 <= 0);
				do{
					System.out.println("Alto:");
					height2 = s.nextDouble();
				}while(height2 <= 0);
				fgs = addFigura(fgs, new Triangulo(width2,height2));
				continue;
			}
		}while(tipo != 4);
		int indice = 0;
		for (int i = 0; i < fgs.length; i++) {
			if(fgs[i].esMenorQue(fgs[indice]) == 1) {
				indice = i;
			}
		}
		System.out.println("Menor: ");
		System.out.println(fgs[indice].getClass().getSimpleName() + " de area " + fgs[indice].area());
	}

}
