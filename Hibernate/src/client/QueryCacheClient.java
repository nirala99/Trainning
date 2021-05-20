package client;

import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;
import entities.Account;

public class QueryCacheClient {

	
	public static void main(String[] args) {
		displayAccounts();
		displayAccounts();
		displayAccounts();
		displayAccounts();
	}

	public static void displayAccounts(){
		Session session = HibernateUtil.getCacheSessionFactory()
						.openSession();
		List<Account> accs = session.createQuery("from Account")
								.setMaxResults(15)
								.setCacheable(true)
								.list();
			
		System.out.println(accs);
		session.close();
	}
}
