package hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate/orm.xml");
        BaseDAO<Employee> dao = (BaseDAO<Employee>) context.getBean("hibernateEmployeeDAO");

        Employee e = new Employee();
        e.setEmpno(4);
        e.setEname("Manohar Josi");

        Employee e2 = new Employee();
        e2.setEmpno(5);
        e2.setEname("Manoj Bajpayee");

        dao.addEmp(e);
        dao.addEmp(e2);
        System.out.print("Find emp " + dao.findAll());

    }
}
