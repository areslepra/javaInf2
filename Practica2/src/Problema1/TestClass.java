package Problema1;

public class TestClass {

	public static void main(String[] args) {
		Train t = new Train();
		
		t.addCar(new BoxCar(3,2,1));
		t.addCar(new TankerCar(5,1));
		
		System.out.println(t.capacidad());
	}

}
