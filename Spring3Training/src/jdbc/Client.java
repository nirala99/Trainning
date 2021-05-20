package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        BaseDAO<Employee> employeeJDBCDAO = (BaseDAO<Employee>) context.getBean("employeeJDBCDAO");

        //get employee count
        System.out.println("Total number of employees: " + employeeJDBCDAO.getCount());

        String name = "John";

        //add employee
        Employee emp = new Employee();
        emp.setEmpno(15);
        emp.setName(name);
        employeeJDBCDAO.add(emp);


        //find employee
        System.out.println(employeeJDBCDAO.find(4));

        //find employee
        System.out.println(employeeJDBCDAO.findEmployeeByName("John"));

        //find employees with name john
        System.out.println(employeeJDBCDAO.findAll());


    }
}
