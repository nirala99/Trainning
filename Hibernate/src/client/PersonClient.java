package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import entities.Person;
import util.HibernateUtil;

public class PersonClient {

    public static void main(String[] args) throws Exception {
        // 1. Get the SessionFactory using
        // HibernateUtil/Configuration
        SessionFactory factory = HibernateUtil.getSessionFactory();
        // 2. Get the Session Using Session Factory
        Session currentSession = factory.openSession();
        //factory.getCurrentSession() : Not require close session
        Person p1 = new Person();
        p1.setPersonName("P5");
        // 3. Begin Transaction [for each/group of Operations]
        currentSession.beginTransaction();
        currentSession.persist(p1);
        // 4. Commit Transaction
        currentSession.getTransaction().commit();
        // 5. Close the Session
        currentSession.close();
    }
}
