package jdbcall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcall/jdbc.xml");
        BaseDAO<Employee> dao = (BaseDAO<Employee>)context.getBean("employeeJDBCDAO");
	//BaseDAO<Employee> dao = (BaseDAO<Employee>)context.getBean("namedJdbcEmployeeDAO");
        //BaseDAO<Employee> dao = (BaseDAO<Employee>) context.getBean("employeeJDBCSimpleDAO");



        //get employee count
        System.out.println("Total number of employees: " + dao.getCount());

        //add employee
        Employee emp = new Employee();
        emp.setEmpno(3);
        emp.setEname("Nirbhay");
        dao.addEmp(emp);

        //find employee
        System.out.println(dao.find(4));

        //find employees
        System.out.println(dao.findAll());
    }
}
