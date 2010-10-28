package Problema6;

abstract class Gate {
	/** Constantes simbólicas de valores a usar en simulación */
	public static final int FALSE = 0;
	public static final int TRUE = 1;
	public static final int UNKNOWN = 2;
	private int[] inputs; // entrada de la compuerta

	/**
	 * El constructor inicializa todas las entradas de las compuertas con el
	 * valor UNKNOWN
	 */
	public Gate(int numInputs) {
		this.inputs = new int[numInputs];
		for (int i = 0; i < this.inputs.length; i++) {
			this.inputs[i] = UNKNOWN;
		}
	}

	public int numInputs() {
		return this.inputs.length;
	}

	public void setInput(int inum, int val) {
		this.inputs[inum] = val;
	}

	public int getInput(int inum) {
		return this.inputs[inum];
	}

	abstract int eval();
};