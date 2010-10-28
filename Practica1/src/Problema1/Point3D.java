package Problema1;

public class Point3D {
	private int x;
	private int y;
	private int z;
	
	public Point3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Point3D(int x1, int y1, int z1) {
		this.x = x1;
		this.y = y1;
		this.z = z1;		
	}
	
	public Point3D(int low, int high) {
		this.x = (int)(low + Math.random() * (high - low));
		this.y = (int)(low + Math.random() * (high - low));
		this.z = (int)(low + Math.random() * (high - low));				
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
	
	public boolean equals(Point3D q) {
		return (q.getX() == this.x && q.getY() == this.y && q.getZ() == this.z);
	}
	
	public boolean equals(int x1, int y1, int z1) {
		return (x1 == this.x && y1 == this.y && z1 == this.z);
	}
	
	public void shiftX(int tx) {
		this.x += tx;
	}

	public void shiftY(int ty) {
		this.y += ty;
	}

	public void shiftZ(int tz) {
		this.z += tz;
	}
	
	public Point3D translate (int tx, int ty, int tz){
		return (new Point3D(this.x + tx, this.y + ty, this.z + tz));
	}
	
	public double distanceOrigin() {
		return (Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2)));
	}
	
	public double distanceToPoint(Point3D q) {
		return (Math.sqrt(Math.pow(this.x-q.getX(), 2) + Math.pow(this.y-q.getY(), 2) + Math.pow(this.z-q.getZ(), 2)));
	}
	
	public int scalarProduct(Point3D q) {
		return (this.x * q.getX() + this.y * q.getY() + this.z * q.getZ());
	}
	
	public String whichSpacce() {
		if(this.distanceOrigin() == 0) {
			return "Origen!";
		}else{
			String resultado = "";
			
			if(this.x > 0) {
				resultado += "semiplano derecho, ";
			}else{
				resultado += "semiplano izquierdo, ";
			}
			if(this.y > 0) {
				resultado += "superior ";
			}else{
				resultado += "inferior ";
			}
			if(this.z > 0) {
				resultado += "y delante.";
			}else{
				resultado += "y detraz.";
			}
			return resultado;
		}
	}
	
	public boolean inBox(int xbox, int ybox, int zbox, int width, int height, int depth) {
		return (
				this.x > xbox && this.y > ybox && this.z > zbox 
				&& this.x < (xbox + width) && this.y < (ybox + height) && this.z < (ybox + depth) 
				);
	}
	
	public boolean inSphere (Point3D center, int radius) {
		return(this.distanceToPoint(center) <= radius);
	}

}
