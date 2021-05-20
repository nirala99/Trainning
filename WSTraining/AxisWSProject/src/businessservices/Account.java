package businessservices;

public class Account {

	int accountId;
	String name;
	double balance;
	AccountType accountType;
	
	public void credit(int amount){
		if(amount>0){
			setBalance(getBalance()+amount);
		}
	}  
	
	public void debit(int amount){
		if(amount>0 && amount<getBalance()){
			setBalance(getBalance()-amount);
		}
	}
	
/*	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}*/

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
