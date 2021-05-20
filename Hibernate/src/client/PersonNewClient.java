package client;

import org.hibernate.Session;

import util.HibernateUtil;

import entities.Person;

public class PersonNewClient {

    public static void main(String[] args) {

        // Detached
        Person p1 = new Person();
        p1.setPersonId(1);
        p1.setPersonName("Person-I Changed");

        Person p2 = new Person();
        p2.setPersonId(2);
        p2.setPersonName("Person-II Changed");


        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.merge(p1); 	// update   O -> R  -> Update Record
        session.refresh(p2);  //  select   R -> O

        System.out.println("P1=" + p1 + " P2=" + p2);

        session.getTransaction().commit();
        session.close();


        // Persist Demo
	session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //session.persist(p1);  // Insert
        //session.persist(p2);
        session.getTransaction().commit();
        session.close();
    }
}
