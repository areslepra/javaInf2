package Problema6;

public class InfoSemana {
	private int temperaturasMaximas[];
	private int temperaturasMinimas[];
	private int promedioHumedad[];
	
	public InfoSemana () {
		this.temperaturasMaximas = new int[7];
		this.temperaturasMinimas = new int[7];
		this.promedioHumedad = new int[7];
	}
	
	public int getDiaTemperaturaMaxima() {
		int max = 0;
		int maxVal = this.temperaturasMaximas[0];
		
		for (int i = 0; i < 7; i++) {
			if(this.temperaturasMaximas[i] > maxVal) {
				maxVal = this.temperaturasMaximas[i];
				max = i;
			}
		}
		return (max + 1);
	}
	
	public int getDiaTemperaturaMinima() {
		int max = 0;
		int maxVal = this.temperaturasMinimas[0];
		
		for (int i = 0; i < 7; i++) {
			if(this.temperaturasMinimas[i] < maxVal) {
				maxVal = this.temperaturasMinimas[i];
				max = i;
			}
		}
		return (max + 1);
	}
	
	public String toString() {
		String aux = "";
		aux += "Temperaturas maximas:";
		for (int i = 0; i < this.temperaturasMaximas.length; i++) {
			aux += this.temperaturasMaximas[i] + ",";	
		}
		
		aux += "Temperaturas minimas:";
		for (int i = 0; i < this.temperaturasMaximas.length; i++) {
			aux += this.temperaturasMinimas[i] + ",";
		}
		
		aux += "Humedad promedio:";
		for (int i = 0; i < this.promedioHumedad.length; i++) {
			aux += this.promedioHumedad[i] + ",";
		}
		return aux;
	}
	
	


	public int getTemperaturasMaximas(int dia) {
		return temperaturasMaximas[dia-1];
	}

	public void setTemperaturasMaximas(int temperaturasMaximas, int dia) {
		this.temperaturasMaximas[dia-1] = temperaturasMaximas;
	}

	public int getTemperaturasMinimas(int dia) {
		return temperaturasMinimas[dia-1];
	}

	public void setTemperaturasMinimas(int temperaturasMinimas, int dia) {
		this.temperaturasMinimas[dia-1] = temperaturasMinimas;
	}

	public int getPromedioHumedad(int dia) {
		return promedioHumedad[dia-1];
	}

	public void setPromedioHumedad(int promedioHumedad, int dia) {
		this.promedioHumedad[dia] = promedioHumedad;
	}
}
