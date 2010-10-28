package Problema9;

public class Circle implements Displaceable, Area {
	private Point center;
	private double radius;

	public Circle(double x, double y, double radius) {
		this.radius = radius;
		center = new Point(x, y);
	}

	public double getX() {
		return center.getX();
	}

	public double getY() {
		return center.getY();
	}

	public double getRadius() {
		return radius;
	}

	public void move(double dx, double dy) {
		center.move(dx, dy);
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
