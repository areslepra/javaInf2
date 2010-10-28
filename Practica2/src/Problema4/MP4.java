package Problema4;

public class MP4 extends MP3{
	private String video[];
	private String imagen[];
	private double pantalla;
	
	public MP4() {
		super();
	}

	public String[] getVideo() {
		return video;
	}

	public void setVideo(String video[]) {
		this.video = video;
	}

	public String[] getImagen() {
		return imagen;
	}

	public void setImagen(String imagen[]) {
		this.imagen = imagen;
	}

	public double getPantalla() {
		return pantalla;
	}

	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}
	
	public String toString() {
		String rst;
		rst = "MP4 |";
		rst += super.getMarca() + " |";
		rst += super.getMemoria() + " |";
		rst += super.getPrecio() + " |";
		String audio[] = super.getAudio();
		for (int i = 0; i < audio.length; i++) {
			rst += "," + audio[i];
		}
		rst +=  " |";
		rst += super.isVoz() + " |";

		for (int i = 0; i < this.video.length; i++) {
			rst += "," + this.video[i];
		}
		rst += " |";
		
		for (int i = 0; i < this.imagen.length; i++) {
			rst += "," + this.imagen[i];
		}
		rst += " |";
		rst += this.pantalla + " |";

		return rst;
	}
}
