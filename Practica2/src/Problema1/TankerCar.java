package Problema1;

public class TankerCar extends TrainCar {
	
	private float radio;

	public TankerCar() {
		super();
	}
	
	public TankerCar(float l, float r) {
		super(l);
		this.radio = r;
	}
	
	public double volumen() {
		return Math.PI * super.getLongitud() * this.radio * this.radio;
	}

}