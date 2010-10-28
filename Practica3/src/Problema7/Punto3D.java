package Problema7;

public class Punto3D extends Punto2D {

	private double z;

	public Punto3D() {
		super();
		this.z = 0;
	}

	public Punto3D(double x, double y, double z, String e) {
		super(x, y, e);
		this.z = z;
	}

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int compareTo(Object arg0) {
		int parent = super.compareTo(arg0);
		if(parent == 0) {
			if(this.z > ((Punto3D)arg0).getZ()) {
				return -1;
			}else{
				if(this.z < ((Punto3D)arg0).getZ()) {
					return 1;
				}else{
					return 0;
				}
			}
		}else{
			return parent;
		}
	}

	public String toString() {
		return getEtiqueta() + " (" + super.getX() + ", " + super.getY() + ", " + z + ")";
	}
	
}
