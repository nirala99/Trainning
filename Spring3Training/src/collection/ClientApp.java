package collection;

import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import collection.Contact;
import collection.Employee;

public class ClientApp {

    public static void main(String[] args) {

        //start IOC Container
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Communicating with IOC Container
        Employee bean = (Employee) factory.getBean("empBean");

        System.out.println(bean.getName() + " " + bean.getProjects());

        System.out.println("************");
        System.out.println("Employee phone numbers:");
        Long[] phoneNumbers = bean.getPhoneNumbers();
        for (long l : phoneNumbers) {
            System.out.print(l + " ");
        }

        System.out.println("\n************");
        System.out.println("Employee skills:");
        Set<String> skills = bean.getSkills();
        System.out.println(skills);

        System.out.println("\n************");
        System.out.println("Employee Contacts:");
        Set<Contact> contacts = bean.getContacts();
        for (Contact contact : contacts) {
            System.out.println(contact.getContactName() + " " + contact.getContactEmail() + " " + contact.getContactNumber());
        }

        System.out.println("\n************");
        System.out.println("Employee Ratings:");
        System.out.println(bean.getRatings());

        System.out.println("\n************");
        System.out.println("Employee Skill Projects Map:");
        System.out.println(bean.getSkillProjects());

        System.out.println("\n************");
        System.out.println("Employee Bands:");
        System.out.println(bean.getBands());
    }
}
