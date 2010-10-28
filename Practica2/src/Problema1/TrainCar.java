/**
 * 
 */
package Problema1;

/**
 * @author lab1
 *
 */
abstract class TrainCar {
	
	private float longitud;
	
	public TrainCar() {}
	public TrainCar(float l) {
		this.longitud = l;
	}
	
	public final float getLongitud() {
		return longitud;
	}
	public final void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	abstract public double volumen();
	
}
