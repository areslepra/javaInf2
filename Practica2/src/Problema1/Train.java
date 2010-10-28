package Problema1;

public class Train {

	private TrainCar cars[];
	
	public Train() {
	}
	
	public Train(TrainCar [] t) {
		this.cars = t;
	}

	public TrainCar[] getCars() {
		return cars;
	}
	
	public TrainCar getCar(int i) {
		return this.cars[i];
	}

	public void setCars(TrainCar[] cars) {
		this.cars = cars;
	}
	
	public void addCar(TrainCar car) {
		try {
			TrainCar a[] = new TrainCar[this.cars.length + 1];
			for(int i = 0; i < this.cars.length; i++) {
				a[i] = this.cars[i];
			}
			a[this.cars.length] = car;
			this.cars = a;
		} catch(Exception e) {
			TrainCar a[] = new TrainCar[1];
			a[0] = car;
			this.cars = a;
		}
	}
	
	public void addCars(TrainCar[] cars) {
		try {
			TrainCar a[] = new TrainCar[this.cars.length + cars.length];
			for(int i = 0; i < this.cars.length; i++) {
				a[i] = this.cars[i];
			}
			for(int i = this.cars.length; i < cars.length; i++) {
				a[i] = cars[i];
			}
			this.cars = a;
		} catch(Exception e) {
			TrainCar a[] = new TrainCar[cars.length];
			for(int i = 0; i < cars.length; i++) {
				a[i] = cars[i];
			}
			this.cars = a;
		}
	}
	
	public double capacidad() {
		float v = 0;
		for(int i = 0; i < this.cars.length; i++) {
			v += this.cars[i].volumen();
		}
		return v;
	}
	
}
