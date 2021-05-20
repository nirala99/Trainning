package businessservices;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="EmployeeInfo")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class Employee {
	
	int empno;
	String name;
	double salary;
	double netSalary;
	
	List<String> skills;
	Map<String, String> projectsAssigned;
	EmployeeType employeeType;
	
	
	
	public Employee() {
	}
	
	public Employee(int empno, String name, double salary, double netSalary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.netSalary = netSalary;
	}
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Map<String, String> getProjectsAssigned() {
		return projectsAssigned;
	}

	public void setProjectsAssigned(Map<String, String> projectsAssigned) {
		this.projectsAssigned = projectsAssigned;
	}

	@XmlAttribute(name="employeeNumber",required=true)
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	@XmlElement(name="employeeName",
			required=true,nillable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@XmlTransient
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	

}
