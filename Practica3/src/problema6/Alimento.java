package problema6;

public class Alimento extends Producto {
	private Fecha caducidad;

	public Alimento(int id, int p, Fecha c) {
		super(id, p);
		caducidad = c;
	}

	public Fecha dameCaducidad() {
		return caducidad;
	}
}