package transactionxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("transactionxml/transactions.xml");
        TicketBookingService bookingService = (TicketBookingService) context.getBean("bookingBean");
        bookingService.bookSeat("superman", 1, 1);
    }
}
