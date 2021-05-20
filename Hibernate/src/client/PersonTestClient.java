package client;

import org.hibernate.Session;

import util.HibernateUtil;

import entities.Person;

public class PersonTestClient {

	
	public static void main(String[] args) {
		demoPersist();
		demoMerge();
	}
	
	public static void demoMerge(){
		Session session =  HibernateUtil.getSessionFactory().openSession();	
		session.beginTransaction();
		
		Person p3= new Person();
		p3.setPersonId(3);
		p3.setPersonName("P333");
		
		session.merge(p3);
		System.out.println(p3);
		
		//session.refresh(p3);
		//System.out.println(p3);
		
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	public static void demoPersist(){
		Session session =  HibernateUtil.getSessionFactory().openSession();	
		session.beginTransaction();
		
		Person p=null;
		for (int i = 1; i <= 10; i++) {
			p = new Person();
			p.setPersonName("p"+i);
			session.persist(p);
			System.out.println(p+" inserted");
		}
		
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	
	
}
