package client;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import businessservices.EmployeSystemImplServiceLocator;
import businessservices.Employee;
import businessservices.EmployeeProjectsAssignedEntry;
import businessservices.EmployeeSystem;
import businessservices.EmployeeType;

public class EmployeeServiceClient {
	public static void main(String[] args)throws Exception {
		
		EmployeSystemImplServiceLocator loc = new EmployeSystemImplServiceLocator();
		EmployeeSystem svc = loc.getEmployeSystemImplPort();
		
		Employee e = new Employee();
		e.setEmployeeName("test");
		e.setEmployeeNumber(1111);
		e.setSalary(4556);
		e.setSkills(new String[]{"A","B"});
		e.setEmployeeType(EmployeeType.SALARIED);
		
		EmployeeProjectsAssignedEntry empEntry = 
			new EmployeeProjectsAssignedEntry();
		empEntry.setKey("P1");
		empEntry.setValue("Project 1");
		
		e.setProjectsAssigned(new EmployeeProjectsAssignedEntry[]{empEntry});
		// register 
		System.out.println(svc.registerEmployee(e));
		// find
		Employee empResponse =  svc.findEmployee(1111);
		
		System.out.println("No:"+empResponse.getEmployeeNumber()
				+" Name: "+empResponse.getEmployeeName()+
				" Salary: "+empResponse.getSalary()
				+" Type: "+empResponse.getEmployeeType());
		System.out.print("Skills:");
		for (String skill: empResponse.getSkills()) {
			System.out.print(skill+" ");
		}
		System.out.println();
		
		System.out.print("Projects: ");
		for(EmployeeProjectsAssignedEntry entry: 
			empResponse.getProjectsAssigned()){
			System.out.println(entry.getKey()+" "
					+entry.getValue());
		}
		
		ByteArrayOutputStream baos=  
				new ByteArrayOutputStream();
		
		ImageWriter imgOut = (ImageWriter) ImageIO
			.getImageWritersByMIMEType("image/jpeg").next();
		
		ImageOutputStream ios = ImageIO
			.createImageOutputStream(baos);
		
		imgOut.setOutput(ios);
		imgOut.write(ImageIO.read(new File("img.jpg")));
		ios.close();
		byte[] image = baos.toByteArray();
		
		svc.uploadImage(image,4545);
	}
}
