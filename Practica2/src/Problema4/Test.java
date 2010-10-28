package Problema4;

public class Test {
	
	public static void main(String args[]) {
		String[] tipos;
		
		ListaMP3 l = new ListaMP3();
		
		MP3 listado[] = new MP3[5];
		MP3 a = new MP3();
		a.setMarca("sony");
		a.setMemoria(2);
		a.setPrecio(319);
		tipos = new String[2];
		tipos[0] = "Mp3";
		tipos[1] = "Wma";
		a.setAudio(tipos);
		a.setVoz(true);
		listado[0] = a;

		a = new MP3();
		a.setMarca("sony");
		a.setMemoria(4);
		a.setPrecio(499);
		tipos = new String[2];
		tipos[0] = "Mp3";
		tipos[1] = "Wma";
		a.setAudio(tipos);
		a.setVoz(true);
		listado[1] = a;
		
		MP4 b = new MP4();
		b.setMarca("chess");
		b.setMemoria(1);
		b.setPrecio(149);
		tipos = new String[3];
		tipos[0] = "Mp3";
		tipos[1] = "Wav";
		tipos[2] = "Wma";
		b.setAudio(tipos);
		b.setVoz(true);
		tipos = new String[4];
		tipos[0] = "SMV";
		tipos[1] = "AVI";
		tipos[2] = "WMV";
		tipos[3] = "MPG";
		b.setVideo(tipos);
		tipos = new String[2];
		tipos[0] = "JPG";
		tipos[1] = "BMP";
		b.setImagen(tipos);
		b.setPantalla(1.8);
		listado[2] = b;

		b = new MP4();
		b.setMarca("chess");
		b.setMemoria(4);
		b.setPrecio(249);
		tipos = new String[3];
		tipos[0] = "Mp3";
		tipos[1] = "Wav";
		tipos[2] = "Wma";
		b.setAudio(tipos);
		b.setVoz(false);
		tipos = new String[4];
		tipos[0] = "SMV";
		tipos[1] = "AVI";
		tipos[2] = "WMV";
		tipos[3] = "MPG";
		b.setVideo(tipos);
		tipos = new String[2];
		tipos[0] = "JPG";
		tipos[1] = "BMP";
		b.setImagen(tipos);
		b.setPantalla(1.8);
		listado[3] = b;

		b = new MP4();
		b.setMarca("chess");
		b.setMemoria(2);
		b.setPrecio(199);
		tipos = new String[3];
		tipos[0] = "Mp3";
		tipos[1] = "Wav";
		tipos[2] = "Wma";
		b.setAudio(tipos);
		b.setVoz(true);
		tipos = new String[3];
		tipos[0] = "ASF";
		tipos[1] = "AVI";
		tipos[2] = "WMV";
		b.setVideo(tipos);
		tipos = new String[3];
		tipos[0] = "JPG";
		tipos[1] = "BMP";
		tipos[1] = "BMP";
		b.setImagen(tipos);
		b.setPantalla(1.8);
		listado[4] = b;

		
		l.setListado(listado);
		
		System.out.println(l);
	}
}
