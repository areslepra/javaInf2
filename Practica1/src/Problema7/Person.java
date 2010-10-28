package Problema7;

public class Person {

	private int calories = 0;
	
	public Person() {
		this.calories = 0;
	}
	
	public void addCalories() {
		this.calories += 10;
	}
	
	public boolean decideToStop() {
		return (Math.random() < 0.001);
	}
	
	public int getCalories() {
		return this.calories;
	}
	
}
