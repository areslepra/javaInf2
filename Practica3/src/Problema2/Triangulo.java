package Problema2;

public class Triangulo extends Figura{

	private double height;
	private double width;
	
	public Triangulo() {
	}
	
	public Triangulo(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {
		return this.height * this.width / 2;
	}
	
	public double perimetro() {
		return this.height + this.width + this.width;
	}

	public String toString() {
		return "Triangulo [Base=" + height + ", Altura=" + width + ", Area=" + this.area() + ", Perimetro=" + this.perimetro() + "]";
	}
	
	

}
