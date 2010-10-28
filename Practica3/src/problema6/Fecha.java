package problema6;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha(int d, int m, int a) {
		dia = d;
		mes = m;
		año = a;
	}

	public int dameDia() {
		return dia;
	}

	public int dameMes() {
		return mes;
	}

	public int dameAño() {
		return año;
	}
}