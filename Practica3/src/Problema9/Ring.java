package Problema9;

public class Ring implements Area, Displaceable {
	private Circle inner, outer; // representan círculos interior y exterior,

	public Ring(double x, double y, double rad, double width) {
		inner = new Circle(x, y, rad);
		outer = new Circle(x, y, rad + width);
	}

	public double getArea() {
		return outer.getArea() - inner.getArea();
	}

	public double getX() {
		return inner.getX();
	}

	public double getY() {
		return inner.getY();
	}

	public void move(double dx, double dy) {
		outer.move(dx, dy);
		inner.move(dx,dy);
	}
}