/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restclient;

import customerdb.Customer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author root
 */
public class GetCustomerClient {

    private final String URL = "http://localhost:8080/CustomerDB/resources/customers";

    public Customer geCustomerEntity(int cid) {
        ResponseEntity<Customer> response;
        Customer customer = null;
        try {
            String newUrl = URL + "/" + cid;
            response = (ResponseEntity<Customer>) new RestTemplate().getForEntity(newUrl, Customer.class);
            customer = (Customer) response.getBody();
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public void updateCustomer(Customer cust) {
        try {
            String newUrl = URL + "/" + cust.getCustomerId();
            new RestTemplate().put(new URI(newUrl), cust);

        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        } catch (RestClientException e) {
            e.printStackTrace();
        }
    }

    public Customer geCustomerObject(int cid) {
        Customer customer = null;
        try {
            String newUrl = URL + "/" + cid;
            customer = (Customer) new RestTemplate().getForObject(newUrl, Customer.class);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public static void main(String arg[]) {
        GetCustomerClient getCustClient = new GetCustomerClient();
        Customer customer1 = getCustClient.geCustomerEntity(410);
        System.out.println("Response code : " + customer1);

        Customer customer2 = getCustClient.geCustomerObject(777);
        System.out.println("Response code : " + customer2);

        customer2.setName("Nirbhay");
        customer2.setCustomerId(2345);

        getCustClient.updateCustomer(customer2);
        Customer customer3 = getCustClient.geCustomerObject(customer2.getCustomerId());
        System.out.println("Response code : " + customer3);
    }
}
