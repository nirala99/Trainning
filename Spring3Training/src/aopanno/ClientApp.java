package aopanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno/aop.xml");
        Bank bank = (Bank) context.getBean("onlineBank");
        try {
            System.out.println(bank.getBalance(1));
            bank.transfer(1, 2, 2000);
            bank.validateCard(11111111L);
            bank.fixedDeposit(21, 5000);
        } catch (BankException e) {
            e.printStackTrace();
        }
    }
}
