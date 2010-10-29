package Problema7;

public class BusinessCustomer extends Customer {
	
	private int accountNo;
	
	public BusinessCustomer (String name, Info info, int accountNo) {
		super(name, info);
		
		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

}
