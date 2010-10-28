package problema6;

public class Producto {
	private int idproducto;
	private int precio;

	public Producto(int id, int p) {
		idproducto = id;
		precio = p;
	}

	public int dameIdProducto() {
		return idproducto;
	}

	public int damePrecio() {
		return precio;
	}
	
	public boolean isEcologico() {
		return false;
	}
}
