package businessservices;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface EmployeeSystem {
	
	@WebMethod
	public String getEmployeeName(int empno);
	
	@WebMethod(operationName="findEmployee")
	public Employee getEmployee(
		@WebParam(name="employeeNumber") int empno);
	
	@WebMethod
	public boolean registerEmployee(
			@WebParam(name="employee") Employee emp);
	
	@WebMethod
	@Oneway
	public void uploadImage(byte[] image,int empno);
	
}




