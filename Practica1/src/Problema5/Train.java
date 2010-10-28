package Problema5;

public class Train{
	private Carriage[] vagones;
	private int partida;
	private int llegada;
	private float[] precios = new float [2];
	
	public Train() {
	}

	public Train(float[] precios) {
		this.precios = precios;
	}

	public Train(Carriage[] vagones, float[] precios) {
		this.vagones = vagones;
		this.precios = precios;
	}

	public Train(Carriage[] vagones, int partida, int llegada, float[] precios) {
		this.vagones = vagones;
		this.partida = partida;
		this.llegada = llegada;
		this.precios = precios;
	}

	public Carriage[] getVagones() {
		return vagones;
	}	
	
	public void setVagones(Carriage[] vagones) {
		this.vagones = vagones;
	}
	
	public void addVagon(Carriage c) {
		try{
			Carriage aux[] = new Carriage[this.vagones.length + 1];
			for (int i = 0; i < this.vagones.length; i++) {
				aux[i] = this.vagones[i];
			}
			aux[aux.length-1] = c;
			this.vagones = aux;			
		} catch (NullPointerException ex) {
			this.vagones = new Carriage[1];
			this.vagones[0] = c;
		}
	}

	public int getPartida() {
		return partida;
	}

	public void setPartida(int partida) {
		this.partida = partida;
	}

	public int getLlegada() {
		return llegada;
	}

	public void setLlegada(int llegada) {
		this.llegada = llegada;
	}

	public float[] getPrecios() {
		return precios;
	}

	public void setPrecios(float[] precios) {
		this.precios = precios;
	}
	
	public void llenarVagones() {
		for (int i = 0; i < vagones.length; i++) {
			vagones[i].llenarAsiento();
		}
	}
	
	public int cantidadPClase() {
		int contador = 0;
		for (int i = 0; i < vagones.length; i++) {
			if(vagones[i].getTipo() == 1) {
				for (int j = 0; j < 40; j++) {
					if(vagones[i].getAsiento(j))
						contador++;
				}
			}
		}
		return contador;
	}
	
	public int cantidadSClase() {
		int contador = 0;
		for (int i = 0; i < vagones.length; i++) {
			if(vagones[i].getTipo() == 2) {
				for (int j = 0; j < 40; j++) {
					if(vagones[i].getAsiento(j))
						contador++;
				}
			}
		}
		return contador;
	}
	
	public float totalTickets() {
		return this.cantidadPClase() * this.precios[0] + this.cantidadSClase() * this.precios[1];
	}
	
}
