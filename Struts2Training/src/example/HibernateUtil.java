package example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	static SessionFactory factory;
	public static SessionFactory gerSessionFactory(){
		if(factory==null){
			//build the session factory
			AnnotationConfiguration config=new AnnotationConfiguration();
			config.addAnnotatedClass(Employee.class);
			factory=config.configure("example/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}

       public static void main(String args[]){
           Session session = gerSessionFactory().getCurrentSession();
           session.beginTransaction();
           Employee employee=new Employee();
           employee.setEmpno(100);
           employee.setName("NIrbhay");
           employee.setSalary(50.0f);
           session.persist(employee);
           session.getTransaction().commit();
           
       }
               
}
