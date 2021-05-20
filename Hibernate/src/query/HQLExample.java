package query;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import entities.Account;
import util.HibernateUtil;

public class HQLExample {
    public static void populateAccounts() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        for (int i = 1; i <= 100; i++) {
            Account ac = new Account();
            ac.setAccountType((i % 2 == 0) ? "Savings" : "Current");
            ac.setBalance(i * 100);
            session.persist(ac);
        }
        session.getTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        //populateAccounts();
        Session session = HibernateUtil.getSessionFactory().openSession();
        String HQL ="from Account where balance between :min and :max ";
        Query hQry = session.createQuery(HQL);
        hQry.setParameter("min", 1000.0);
        hQry.setParameter("max", 1500.0);
        //hQry.setFirstResult(10);
        hQry.setMaxResults(10);
        List<Account> accs = hQry.list(); // list of Object
        //hQry.uniqueResult(); single Object
        for (Account account : accs) {
            System.out.println(account);
        }
        session.close();
    }
}