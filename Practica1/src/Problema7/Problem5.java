package Problema7;

public class Problem5 {
	
	private static final int MAXCYCLES = 25;
	
	public static void main(String args[]) {
		Person p1 = new Person();
		Person p2 = new Person();
		int cycles = 0;
		
		while (!p1.decideToStop()
				&& !p2.decideToStop()
				&& cycles < MAXCYCLES
				) {
			p1.addCalories();
			p2.addCalories();
			cycles++;
		}

		
		System.out.println(p1.getCalories() + p2.getCalories());
	}
}
