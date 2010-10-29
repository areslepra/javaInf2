package Problema7;

public class Customer {
	
	private String name;
	private Info inf;
	
	public Customer (String name, Info info) {
		this.name = name;
		this.inf = info;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Info getInfo() {
		return this.inf;
	}

}
