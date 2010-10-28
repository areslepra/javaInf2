package problema6;

public class TerneraEcologica extends Carne implements ProductoEcologico {
	
	private double codigoOrigen;

	public TerneraEcologica(int id, int p, Fecha c) {
		super(id, p, c);
	}
	
	public double getCodigoOrigen() {
		return codigoOrigen;
	}

	public void setCodigoOrigen(double codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	public double codigoOrigen() {
		return this.codigoOrigen;
	}
	
	public boolean isEcologico() {
		return true;
	}

}
