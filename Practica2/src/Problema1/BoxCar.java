package Problema1;

public class BoxCar extends TrainCar {
	
	private float widht;
	private float height;
	
	public BoxCar() {
		super();
	}

	public BoxCar(float l, float h, float w) {
		super(l);
		this.height = h;
		this.widht = w;
	}

	public float getWidht() {
		return widht;
	}

	public void setWidht(float widht) {
		this.widht = widht;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public double volumen() {
		return super.getLongitud() * this.widht * this.height;
	}

}
