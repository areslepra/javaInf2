package problema6;

public class Almacen {

	public static void main(String args[]) {
		
	}
	
	boolean hayAlimentosEcologicos(Producto[] Almacen)  {
		for (int i = 0; i < Almacen.length; i++) {
			if(Almacen[i].isEcologico()) {
				return true;
			}
		}
		return false;
	}
}
