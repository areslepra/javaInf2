package Problema7;

@SuppressWarnings("unchecked")
public abstract class Datos implements Comparable {
	
	private String etiqueta;
	
	public Datos() {
		this.etiqueta = "";
	}
	
	public Datos(String e) {
		this.etiqueta = e;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String toString() {
		return etiqueta;
	}
}
