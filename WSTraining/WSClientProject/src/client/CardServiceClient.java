package client;

import businessservices.CardServiceLocator;
import businessservices.CardServicePortType;
import businessservices.xsd.Account;
import businessservices.xsd.Customer;

public class CardServiceClient {
	public static void main(String[] args) throws Exception {
		CardServiceLocator loc = new CardServiceLocator();
		
		CardServicePortType svc =  loc.getCardServiceHttpSoap11Endpoint();
		
		System.out.println("Is Card Valid: "
				+svc.validateCard(100011110l));
		
		
		System.out.println(svc.balanceEnquiry(1111));
		
		
		Account acc =  svc.openAccount(new Customer(11,"test@test",
				new Long[]{333l,444l},"test",null));
		
		System.out.println("Account Created: "+acc.getAccountId()
				+","+acc.getName()+","+acc.getBalance());
		
		}
}
