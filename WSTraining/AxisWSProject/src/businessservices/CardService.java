package businessservices;

import java.util.HashMap;
import java.util.Map;


public class CardService {

	
	public boolean validateCard(long cardNumber){
		System.out.println("Validating Card "+cardNumber);
		return (cardNumber>0);
	}
		
	Map<String,String> users = new HashMap();
	public CardService() {
		//add users
	}

	public boolean login(String username,String password){
		// check the users
		return true;
	}
	
	public double balanceEnquiry(int customerId){
		System.out.println("Getting Balance for Customer "+customerId);
		Account ac = new Account();
		ac.setAccountId(customerId);
		ac.setBalance(customerId);
		ac.setName("Savings");
		return 	ac.getBalance();
	}
	
	public Account openAccount(Customer newCustomer){
		System.out.println("opening Account for "+newCustomer.getName());
		Account newAccount = new Account();
		newAccount.setAccountId(newCustomer.getCustomerId());
		newAccount.setName(newCustomer.getName());
		newAccount.setBalance(1000);
		return newAccount;
	}
}








