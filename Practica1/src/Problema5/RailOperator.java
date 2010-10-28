package Problema5;

public class RailOperator {

	private Train[] trains;
	private String nombre;
	private int id;
	
	public RailOperator() {
		nombre = "";
		id = 0;
	}
	
	public RailOperator(String Nombre, int id) {
		this.nombre = Nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}
	
	public void addTrain(Train t) {
		try {
			Train aux[] = new Train[this.trains.length + 1];
			for (int i = 0; i < this.trains.length; i++) {
				aux[i] = this.trains[i];
			}
			aux[aux.length - 1] = t;
			this.trains = aux;
		} catch (NullPointerException ex) {
			this.trains = new Train[1];
			this.trains[0] = t;
		}

	}
	
	public Train masRentable() {
		int num = 0;
		double costo = this.trains[0].totalTickets();
		
		for (int i = 0; i < this.trains.length; i++) {
			if(costo < this.trains[i].totalTickets()) {
				num = i;
			}
		}
		return this.trains[num];
	}
}
