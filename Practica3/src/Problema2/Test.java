package Problema2;

public class Test {

	public static void main(String[] args) {
		Triangulo t[] = new Triangulo[2];
		t[0] = new Triangulo();
		t[0].setHeight(2);
		t[0].setWidth(2);
		
		t[1] = new Triangulo();
		t[1].setHeight(2);
		t[1].setWidth(2);
		
		if(t[0].menorArea(t[1])) {
			System.out.println(t[0]);
		}else{
			System.out.println(t[1]);
		}
				
		Rectangulo r[] = new Rectangulo[2];
		r[0] = new Rectangulo();
		r[0].setHeight(2);
		r[0].setWidth(2);
		
		r[1] = new Rectangulo();
		r[1].setHeight(2);
		r[1].setWidth(2);
		
		if(r[0].menorArea(r[1])) {
			System.out.println(r[0]);
		}else{
			System.out.println(r[1]);
		}
		Circulo c[] = new Circulo[2];
		
		c[0] = new Circulo();
		c[0].setRadio(2);

		c[1] = new Circulo();
		c[1].setRadio(2);
		
		if(c[0].menorArea(c[1])) {
			System.out.println(c[0]);
		}else{
			System.out.println(c[1]);
		}
	}

}
