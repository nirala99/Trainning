package client;

import org.hibernate.Session;
import util.HibernateUtil;
import entities.Person;

public class PersonLifecycleClient {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person p = new Person();
        p.setPersonName("PL");
        session.persist(p); // Insert
        session.getTransaction().commit();
        System.out.println(p + " Inserted");

        session.close();
        session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction(); // Select
        Person pDB = (Person) session.get(Person.class, 1);
        System.out.println(pDB + " Fetched");

        pDB.setPersonName(pDB.getPersonName() + "2");
        session.merge(pDB);
        System.out.println(pDB + " Updated");
        //session.flush();

        session.refresh(pDB); // select  the last committed data
        System.out.println(pDB + " Refreshed");
        pDB.setPersonName(pDB.getPersonName() + "3");
        System.out.println(pDB + " Updated");

        //session.delete(pDB);
        //System.out.println(pDB+" Deleted");

        session.getTransaction().commit();
        session.close();
    }
}
