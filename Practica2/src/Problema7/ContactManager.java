package Problema7;

public class ContactManager {

	private Customer list[];

	public ContactManager() {
	}

	public void addCustomer(String name, String address, String phone, String email) {
		if(list != null) {
			Customer[] aux = new Customer[list.length+1];
			for (int i = 0; i < list.length; i++) {
				aux[i] = list[i];
			}
			aux[list.length] = new Customer(name, new Info(address,phone,email));
			list = aux;
		}else{
			list = new Customer[1];
			list[0] = new Customer(name, new Info(address,phone,email));
		}
	}

	public void addBusinessCustomer(String name, String address, String phone, String email, int accountNo) {
		if(list != null) {
			Customer[] aux = new Customer[list.length+1];
			for (int i = 0; i < list.length; i++) {
				aux[i] = list[i];
			}
			aux[list.length] = new BusinessCustomer(name, new Info(address,phone,email),accountNo);
			list = aux;
		}else{
			list = new Customer[1];
			list[0] = new BusinessCustomer(name, new Info(address,phone,email),accountNo);
		}
	}

	public Customer[] findAll(String name) {
		if(list != null) {
			Customer[] aux = null;
			for (int i = 0; i < list.length; i++) {
				if(list[i].getName() == name) {
					if(aux != null) {
						Customer[] aux2 = new Customer[aux.length+1];
						for (int j = 0; j < aux.length; j++) {
							aux2[j] = aux[j];
						}
						aux2[aux.length] = list[i];
						aux = aux2;
					}else{
						aux = new Customer[1];
						aux[0] = list[i];
					}
				}
			}
			return aux;
		}else{
			return null;
		}
	}
}
