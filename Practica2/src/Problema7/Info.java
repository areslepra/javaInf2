package Problema7;

public class Info {
	
	private String address;
	private String phone;
	private String email;
	
	public Info (String address, String phone, String email) {
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
}
