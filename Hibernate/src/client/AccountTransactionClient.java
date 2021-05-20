package client;

import org.hibernate.Session;
import util.HibernateUtil;
import entities.Account;
import entities.Transaction;

public class AccountTransactionClient {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAccountType("Savings");
        a1.setBalance(1000);

        Account a2 = new Account();
        a2.setAccountType("Current");
        a2.setBalance(2000);

        for (int i = 1; i <= 10; i++) {
            Transaction t = new Transaction();
            t.setTransactionType((i % 2 == 0) ? "Credit" : "Debit");
            t.setAmount(i * 1000);
            if (i % 2 == 0) {
                // c -> p
                t.setAccount(a1);
                // p -> c
                a1.getTransactions().add(t);
            } else {
                t.setAccount(a2);
                a2.getTransactions().add(t);
            }
        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.persist(a1); // save with childs using cascade
        session.persist(a2);

        session.getTransaction().commit();
        session.close();


        // fetching objects
        session = HibernateUtil.getSessionFactory().openSession();
        // fetch object using Get
        //Account a = (Account) session.get(Account.class, 1);

        //fetch Object using session.refresh
	Account a = new Account();
        a.setAccountId(1);
        session.refresh(a);

        System.out.println(a);
        System.out.println("Transactions Count "+ a.getTransactions().size());
        session.close();
        
    }
}
