/**
 * CardService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices;

public interface CardService extends javax.xml.rpc.Service {
    public java.lang.String getCardServiceHttpSoap11EndpointAddress();

    public businessservices.CardServicePortType getCardServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public businessservices.CardServicePortType getCardServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getCardServiceHttpSoap12EndpointAddress();

    public businessservices.CardServicePortType getCardServiceHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException;

    public businessservices.CardServicePortType getCardServiceHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
