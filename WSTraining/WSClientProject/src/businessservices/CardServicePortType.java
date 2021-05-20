/**
 * CardServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices;

public interface CardServicePortType extends java.rmi.Remote {
    public java.lang.Boolean login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.Boolean validateCard(java.lang.Long cardNumber) throws java.rmi.RemoteException;
    public businessservices.xsd.Account openAccount(businessservices.xsd.Customer newCustomer) throws java.rmi.RemoteException;
    public java.lang.Double balanceEnquiry(java.lang.Integer customerId) throws java.rmi.RemoteException;
}
