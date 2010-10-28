package Problema4;

public class Competition {
	
	private Race Races[];
	
	public Competition() {
	}

	public Race[] getRaces() {
		return Races;
	}

	public void setRaces(Race[] races) {
		Races = races;
	}
	
	public void addRace(Race r) {
		try{
			Race aux[] = new Race[this.Races.length + 1];
			for (int i = 0; i < this.Races.length; i++) {
				aux[i] = this.Races[i];
			}
			aux[aux.length-1] = r;
			this.Races = aux;			
		} catch (NullPointerException ex) {
			this.Races = new Race[1];
			this.Races[0] = r;
		}
		//this.competitors[this.competitors.length-1] = a;
	}
	
	public void buscarGanadores() {
		for (int i = 0; i < Races.length; i++) {
			Races[i].buscarGanador();
		}
	}
	
}
