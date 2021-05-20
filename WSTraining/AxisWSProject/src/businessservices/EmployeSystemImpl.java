package businessservices;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="businessservices.EmployeeSystem")
@HandlerChain(file="handlers.xml")
public class EmployeSystemImpl implements EmployeeSystem {
	
	
	static Map<Integer, Employee> employees 
		= new HashMap<Integer, Employee>();

	@Override
	public String getEmployeeName(int empno) {
		String name="";
		if(employees.containsKey(empno)){
			name=employees.get(empno).getName();
		}
		return name;
	}
	
	@Override
	public void uploadImage(byte[] image, int empno) {
		try {
			FileOutputStream fos = new FileOutputStream(
					new File("C:/WS/uploadedImages/"
							+empno+".jpg"));
			fos.write(image);
			fos.close();
			System.out.println("Image Uploaded for Employee "
					+empno+ " with length "+image.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public Employee getEmployee(int empno) {
		System.out.println("Fetching Employee "+empno);
		Employee e = null;
		if(employees.containsKey(empno)){
			e =employees.get(empno);
		}
		return e;
	}
	
	@Override
	public boolean registerEmployee(Employee emp) {
		employees.put(emp.getEmpno(), emp);
		System.out.println("Employee Added "+emp.getEmpno());
		return true;
	}
}
