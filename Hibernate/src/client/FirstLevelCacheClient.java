package client;

import org.hibernate.Session;
import util.HibernateUtil;
import entities.Account;

public class FirstLevelCacheClient {
    static Session currentSession;
    public static void main(String[] args) {
        currentSession = HibernateUtil.getSessionFactory().openSession();
        System.out.println(getAccount(3));
        System.out.println(getAccount(3));
        System.out.println(getAccount(3));
        System.out.println(getAccount(3));
        currentSession.close();
    }

    public static Account getAccount(int id) {
        System.out.println("Fetching " + id);
        return (Account) currentSession.get(Account.class, id);
    }
}
