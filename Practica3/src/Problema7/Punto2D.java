package Problema7;

public class Punto2D extends Datos {
	
	private double x;
	private double y;
	
	public Punto2D() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public Punto2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto2D(double x, double y,String e) {
		super(e);
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int compareTo(Object arg0) {
		if(this.y > ((Punto2D)arg0).getY()) {
			return -1;
		}else{
			if(this.y < ((Punto2D)arg0).getY()) {
				return 1;
			}else{
				if(this.x > ((Punto2D)arg0).getX()) {
					return -1;
				}else{
					if(this.x < ((Punto2D)arg0).getX()) {
						return 1;
					}else{
						return 0;
					}
				}
			}
		}
	}

	public String toString() {
		return super.toString() + " (" + x + "," + y + ")";
	}

}
