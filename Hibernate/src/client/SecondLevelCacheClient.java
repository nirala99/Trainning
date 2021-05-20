package client;

import org.hibernate.Session;
import util.HibernateUtil;
import entities.Account;

public class SecondLevelCacheClient {
    public static void main(String[] args) {
        System.out.println(getAccount(22));
        System.out.println(getAccount(22));
        try {// check the timeout delay
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("After Waiting");
        System.out.println(getAccount(22));
        System.out.println(getAccount(22));
    }

    public static Account getAccount(int id) {
        Session currentSession = HibernateUtil.getCacheSessionFactory().openSession();
        System.out.println("Fetching " + id);
        Account a = (Account) currentSession.get(Account.class, id);
        currentSession.close();
        return a;
    }
}
