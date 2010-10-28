package Problema8;

@SuppressWarnings("unchecked")
public class Paquete implements Comparable{

	private long emisor;
	private long receptor;
	private int id;
	private byte dato[];
	
	public Paquete(long emisor, long receptor, int id, byte[] dato) {
		byte relleno = 0;
		
		this.emisor = emisor;
		this.receptor = receptor;
		this.id = id;
		this.dato = new byte[1000];
		for (int i = 0; i < dato.length; i++) {
			this.dato[i] = dato[i];
		}
		for (int i = dato.length; i < this.dato.length; i++) {
			this.dato[i] = relleno;
			relleno = (byte)(relleno == 0 ? -1 : 0);
		}
	}

	public long getReceptor() {
		return receptor;
	}
	
	public void setDato(int index, byte dato) {
		this.dato[index] = dato;
	}
	
	public long getID() {
		return this.id;
	}

	public boolean equals(Paquete obj) {
		return this.emisor == obj.getReceptor() && this.id == obj.getID();
	}

	public int compareTo(Object o) {
		if(this.id < ((Paquete)o).getID()) {
			return -1;
		}else{
			if(this.id > ((Paquete)o).getID()) {
				return 1;
			}else{
				return 0;
			}
		}
	}
}
