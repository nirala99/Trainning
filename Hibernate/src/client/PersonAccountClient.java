package client;

import org.hibernate.Session;
import entities.Account;
import entities.Person;
import entities.Transaction;
import util.HibernateUtil;

public class PersonAccountClient {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
      
        Person p1 = new Person();
        p1.setPersonName("P1");
      
        Person p2 = new Person();
        p2.setPersonName("P2");

        session.persist(p1);
        session.persist(p2);
        session.getTransaction().commit();

        Account a1 = new Account();
        a1.setAccountType("Savings");
        a1.setBalance(1222);

        Account a2 = new Account();
        a2.setAccountType("Current");
        a2.setBalance(20000);

        // Associate Accounts with Transaction
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

        // associate person with accounts
        a1.getOwners().add(p1);
        a1.getOwners().add(p2);
        a2.getOwners().add(p1);

        session.beginTransaction();
        session.persist(a1);
        session.persist(a2);
        session.getTransaction().commit();
        session.close();

        // fetch the objects
        session = HibernateUtil.getSessionFactory().openSession();
        Person pFetch = (Person) session.get(Person.class, 2);
        //Person pFetch = new Person();
        pFetch.setPersonId(1);
        session.refresh(pFetch);
        System.out.println("Person " + pFetch);
        System.out.println("Accounts Owned " + pFetch.getAccounts());

        for (Account acc : pFetch.getAccounts()) {
            System.out.println(acc.getAccountId() + " has " + acc.getTransactions().size() + " transactions");
        }
        session.close();

    }
}
