package Problema2;

public abstract class Figura implements Ordenable{
	abstract double area();
	abstract double perimetro();
	
	public boolean menorArea(Figura O1) {
		return this.area() < O1.area();
	}

	public boolean menorPerimetro(Figura O1) {
		return this.perimetro() < O1.perimetro();
	}

}