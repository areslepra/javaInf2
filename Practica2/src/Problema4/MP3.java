package Problema4;

public class MP3 {

	private String marca;
	private int memoria;
	private double precio;
	private String []audio;
	private boolean voz;
	
	public MP3() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String[] getAudio() {
		return audio;
	}

	public void setAudio(String[] audio) {
		this.audio = audio;
	}

	public boolean isVoz() {
		return voz;
	}

	public void setVoz(boolean voz) {
		this.voz = voz;
	}
	
	public String toString() {
		String rst;
		rst = "MP3 |";
		rst += this.marca + " |";
		
		for (int i = 0; i < this.audio.length; i++) {
			rst += "," + this.audio[i];
		}
		rst += " |";
		rst += this.voz + " |";
		return rst;
	}
	
}
