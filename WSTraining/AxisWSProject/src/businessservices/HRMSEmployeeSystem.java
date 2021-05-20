package businessservices;

import javax.jws.WebService;

public class HRMSEmployeeSystem {//implements EmployeeSystem {
	public String getEmployeeName(int empno) {
		return "HREMP"+empno;
	}
}
