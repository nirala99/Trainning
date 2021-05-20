package businessservices;

import java.util.List;
import java.util.Map;

public class Customer {

	int customerId;
	String name;
	String email;
	
	Account[] ownedAccount;
	List<Long> mobileNumber;
	
	
	public void printCustomerDetails(){
		System.out.println("Customer Name: "+getName()+
				", Email: "+getEmail()+", Mobile Number:"
				+getMobileNumber());
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Long> getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(List<Long> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account[] getOwnedAccount() {
		return ownedAccount;
	}

	public void setOwnedAccount(Account[] ownedAccount) {
		this.ownedAccount = ownedAccount;
	}
}
