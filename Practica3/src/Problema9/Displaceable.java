package Problema9;

public interface Displaceable {
	public double getX(); // retorna coordenada x del centro de la figura
							// desplazable

	public double getY(); // retorna la coordenada y del centro de la figura
							// desplazable

	public void move(double dx, double dy); // mueve el centro de la figura en
											// dx con respecto al //eje x y dy
											// con respecto al eje y
}
