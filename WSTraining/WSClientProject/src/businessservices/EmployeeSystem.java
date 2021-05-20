/**
 * EmployeeSystem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices;

public interface EmployeeSystem extends java.rmi.Remote {
    public java.lang.String getEmployeeName(int arg0) throws java.rmi.RemoteException;
    public businessservices.Employee findEmployee(int employeeNumber) throws java.rmi.RemoteException;
    public boolean registerEmployee(businessservices.Employee employee) throws java.rmi.RemoteException;
    public void uploadImage(byte[] arg0, int arg1) throws java.rmi.RemoteException;
}
