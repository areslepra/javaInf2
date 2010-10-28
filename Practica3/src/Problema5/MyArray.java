package Problema5;

@SuppressWarnings("unchecked")
public class MyArray implements Comparable {
	
	private int[] values;
	
	public MyArray(int[] v) {
		this.values = new int[v.length];
		for (int i = 0; i < v.length; i++) {
			this.values[i] = v[i];
		}
	}
	
	public int getSuma() {
		int s = 0;
		for (int i = 0; i < this.values.length; i++) {
			s += this.values[i];
		}
		return s;
	}

	public int compareTo(Object arg0) {
		return (this.getSuma() - ((MyArray)arg0).getSuma()) / Math.abs(this.getSuma() - ((MyArray)arg0).getSuma());
	}
}
