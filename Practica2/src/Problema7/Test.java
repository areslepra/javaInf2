package Problema7;

public class Test {

	public static void main(String[] args) {
		ContactManager cm = new ContactManager();
		cm.addCustomer("ares", "Test 1234", "1234567", "example@example.com");
		cm.addBusinessCustomer("ares", "Test 1234", "1234567", "example@example.com",2);
		cm.addCustomer("ares", "Test 1234", "1234567", "example@example.com");
		cm.addBusinessCustomer("tdd", "Test 1234", "1234567", "example@example.com",2);
		cm.addCustomer("tdd", "Test 1234", "1234567", "example@example.com");
		cm.addBusinessCustomer("ads", "Test 1234", "1234567", "ares.14@hotmail.com",2);
		
		cm.findAll("d");
		cm.findAll("ares");
	}

}
