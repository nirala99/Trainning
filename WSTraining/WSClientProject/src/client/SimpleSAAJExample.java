package client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class SimpleSAAJExample {

	public static void main(String[] args) {
		
		try {
			MessageFactory mf =  MessageFactory.newInstance();
			SOAPMessage message = mf.createMessage();
			SOAPPart soapPart = message.getSOAPPart();

			// get the SOAP Envelope
			SOAPEnvelope envMsg = soapPart.getEnvelope();
			// get SOAP Body/Header
			SOAPBody soapBody = envMsg.getBody(); //envMsg.getHeader()
			SOAPBodyElement sbe =  soapBody.addBodyElement(
					new QName("http://businessservices","validateCard"));
			
			sbe.addChildElement("cardNumber");			
			message.saveChanges();
			System.out.println("Request message:");
			// check the message
			message.writeTo(System.out);

			// Make a SOAP Call
			SOAPConnection connection = SOAPConnectionFactory
					.newInstance().createConnection();
			
			SOAPMessage responseMessage = connection.call(message,
		new URL(
		"http://localhost:8180/AxisWSProject/services/CardService"));
			
			System.out.println("\nResponse Message:");
			responseMessage.writeTo(System.out);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
