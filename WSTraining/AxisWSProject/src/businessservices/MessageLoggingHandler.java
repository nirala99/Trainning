package businessservices;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class MessageLoggingHandler implements SOAPHandler<SOAPMessageContext>{

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close(MessageContext context) {
	
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessage msg = context.getMessage();
		try {
			if(!(Boolean)context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)){
				System.out.println("Request: ");
			}
			else{
				System.out.println("Response: ");
			}
			msg.writeTo(System.out);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true; // Continue further in Chain
	}

}









