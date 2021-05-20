package businessservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.BindingType;

@WebService(serviceName="MySimpleService")
@SOAPBinding(parameterStyle=ParameterStyle.WRAPPED,
				style=Style.DOCUMENT,use=Use.LITERAL)
public class SimpleBusinessService {
	
	@WebMethod(exclude=true)
	public String getCustomerName(int customerId){
		return "Customer"+customerId;
	}
	
	@WebMethod(operationName="transfer",action="bankTransfer")
	public void performTransfer(
			@WebParam(name="debitAccount") int account1,
			@WebParam(name="creditAccount") int account2,
			@WebParam(name="transferAmount") double amount){
		System.out.println("Performing Transfer of amount "+amount
				+" from "+account1+" to "+account2);
	}

}









