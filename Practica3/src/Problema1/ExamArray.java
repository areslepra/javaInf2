package Problema1;

public class ExamArray implements ExamIntf {
	
	private double[] notas;
	private int index;
	
	public ExamArray() {
		this.notas = new double[100];
		index = 0;
	}

	public double avg() {
		int sum = 0;
		for (int i = 0; i < this.index; i++) {
			sum += this.notas[i];
		}
		return (sum/(this.index+1));
	}

	public double get(int index) {
		return this.notas[index];
	}

	public boolean put(double value) {
		if(this.index < 100) {
			this.notas[this.index++] = value;
			return true;
		}else{
			return false;
		}
	}

	public void sort() {
		double aux;
		for (int i = 0; i < this.index; i++) {
			for (int j = i; j < this.index -1 ; j++) {
				if(this.notas[j] > this.notas[j+1]) {
					aux = this.notas[j];
					this.notas[j] = this.notas[j+1];
					this.notas[j+1] = aux;
				}
			}
		}
	}

}
