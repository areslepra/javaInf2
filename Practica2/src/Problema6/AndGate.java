package Problema6;

public class AndGate extends Gate{

	public AndGate(int numInputs) {
		super(numInputs);
	}

	int eval() {
		for (int i = 0; i < super.numInputs(); i++) {
			if(super.getInput(i) == FALSE) {
				return FALSE;
			}else if(super.getInput(i) == UNKNOWN) {
				return UNKNOWN;
			}
		}
		return TRUE;
	}

	
}
