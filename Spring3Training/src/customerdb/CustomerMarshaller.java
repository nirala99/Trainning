package customerdb;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class CustomerMarshaller {

    public static void main(String args[]) throws JAXBException {
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setAddressline1("GF1 87");
        customer.setAddressline2("SEC 6");
        customer.setCity("Ghaziabad");
        customer.setCreditLimit(200);
        customer.setCustomerId(5);
        customer.setEmail("nirala99@gmail.com");
        customer.setFax("8055533568");
        customer.setName("Nirb hay Kumar");
        customer.setPhone("8055533568");
        customer.setState("Bihar");
        customer.setZip("201010");

        JAXBContext ctx = JAXBContext.newInstance(Customer.class);
        StringWriter write = new StringWriter();
        ctx.createMarshaller().marshal(customer, write);
        String custString = write.toString();
        System.out.println(custString);
        customer = (Customer) ctx.createUnmarshaller().unmarshal(new StringReader(custString));
        System.out.println(customer);
    }
}
