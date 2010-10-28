package Problema6;

public class Test {

	public static void main(String[] args) {
		AndGate y = new AndGate(2);
		System.out.println(y.eval());
		
		y.setInput(0, AndGate.TRUE);
		y.setInput(1, AndGate.TRUE);
		
		System.out.println(y.eval());
		
		y.setInput(1, AndGate.FALSE);
		
		System.out.println(y.eval());
	}

}
