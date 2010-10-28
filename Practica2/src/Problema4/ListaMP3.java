package Problema4;

public class ListaMP3 {
	
	private MP3 listado[];
	
	public ListaMP3() {
	}

	public MP3[] getListado() {
		return listado;
	}

	public void setListado(MP3[] listado) {
		this.listado = listado;
	}
	
	public String toString() {
		String rst;
		rst = "Tipo | Marca | Memoria [GB] | Precio [$] | Formatos de audio | Graba voz | Formatos de video | Formatos de imagen | Pntalla [pulgadas] | ";
		for (int i = 0; i < listado.length; i++) {
			rst += "\n" + listado[i].toString();
		}
		return rst;
	}

}
