/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restclient;


import customerdb.Customer;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author root
 */
public class GetCustomer {

    public static void main(String args[]) throws JAXBException {
        String resource = "http://localhost:8080/CustomerDB/resources/customers/1";
        HttpURLConnection htCon = null;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(resource);
            htCon = (HttpURLConnection) url.openConnection();
            InputStream is = htCon.getInputStream();
            int read = 0;
            while (((read = is.read()) != -1)) {
                sb.append((char) read);
            }
            System.out.println(sb.toString());
            JAXBContext ctx=JAXBContext.newInstance(Customer.class);
            Customer customer=(Customer)ctx.createUnmarshaller().unmarshal(new StringReader(sb.toString()));
            System.out.println(customer);


        } catch (IOException ex) {
            Logger.getLogger(GetCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
