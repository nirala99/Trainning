/**
 * SimpleWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public interface SimpleWebService_Service extends javax.xml.rpc.Service {
    public java.lang.String getSimpleWebServiceSOAPAddress();

    public services.SimpleWebService_PortType getSimpleWebServiceSOAP() throws javax.xml.rpc.ServiceException;

    public services.SimpleWebService_PortType getSimpleWebServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
