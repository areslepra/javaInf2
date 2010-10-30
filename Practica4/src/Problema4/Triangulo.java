package Problema4;

public class Triangulo extends Figura {

	private double width;
	private double height;
	
	public Triangulo(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double area() {
		return this.height * this.width / 2;
	}

}

