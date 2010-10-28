package Problema4;

public class Race {
	private int distance;
	private Athlete ganador;
	private Athlete[] competitors;
	
	public Race() {
		this.distance = 0;
	}
	
	public Race(int distance) {
		this.distance = distance;
	}

	public Race(int distance, Athlete[] a) {
		this.distance = distance;
		this.competitors = a;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Athlete getGanador() {
		return ganador;
	}

	public Athlete getCompetitor(int indice) {
		try {
			return competitors[indice];
		} catch (NullPointerException ex) {
			return new Athlete();
		}
	}
	
	public Athlete[] getCompetitors() {
		return competitors;
	}

	public void setCompetitors(Athlete[] competitors) {
		this.competitors = competitors;
	}
	
	public void addCompetitor(Athlete a) {
		try{
			Athlete aux[] = new Athlete[this.competitors.length + 1];
			for (int i = 0; i < this.competitors.length; i++) {
				aux[i] = this.competitors[i];
			}
			aux[aux.length-1] = a;
			this.competitors = aux;			
		} catch (NullPointerException ex) {
			this.competitors = new Athlete[1];
			this.competitors[0] = a;
		}
		//this.competitors[this.competitors.length-1] = a;
	}
	
	public void buscarGanador() {
		this.ganador = this.competitors[0];
		for (int i = 0; i < competitors.length; i++) {
			if(this.ganador.getTiempo() > this.competitors[i].getTiempo()) {
				this.ganador = this.competitors[i];
			}
		}
	}
	
}
