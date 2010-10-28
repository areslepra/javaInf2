package Problema2;

public class Rectangulo extends Figura{

	private double height;
	private double width;
	
	public Rectangulo() {
	}
	
	public Rectangulo(double height, double width) {
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
		return this.height * this.width;
	}
	
	public double perimetro() {
		return this.height * 2 + this.width * 2; 
	}

	public String toString() {
		return "Rectangulo [Base=" + height + ", Altura=" + width + ", Area=" + this.area() + ", Perimetro=" + this.perimetro() + "]";
	}
	
}
