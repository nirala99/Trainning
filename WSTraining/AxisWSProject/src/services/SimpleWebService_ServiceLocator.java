/**
 * SimpleWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class SimpleWebService_ServiceLocator extends org.apache.axis.client.Service implements services.SimpleWebService_Service {

    public SimpleWebService_ServiceLocator() {
    }


    public SimpleWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SimpleWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SimpleWebServiceSOAP
    private java.lang.String SimpleWebServiceSOAP_address = "http://localhost:8180/AxisWSProject/services/SimpleWebService";

    public java.lang.String getSimpleWebServiceSOAPAddress() {
        return SimpleWebServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SimpleWebServiceSOAPWSDDServiceName = "SimpleWebServiceSOAP";

    public java.lang.String getSimpleWebServiceSOAPWSDDServiceName() {
        return SimpleWebServiceSOAPWSDDServiceName;
    }

    public void setSimpleWebServiceSOAPWSDDServiceName(java.lang.String name) {
        SimpleWebServiceSOAPWSDDServiceName = name;
    }

    public services.SimpleWebService_PortType getSimpleWebServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SimpleWebServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSimpleWebServiceSOAP(endpoint);
    }

    public services.SimpleWebService_PortType getSimpleWebServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            services.SimpleWebServiceSOAPStub _stub = new services.SimpleWebServiceSOAPStub(portAddress, this);
            _stub.setPortName(getSimpleWebServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSimpleWebServiceSOAPEndpointAddress(java.lang.String address) {
        SimpleWebServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (services.SimpleWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                services.SimpleWebServiceSOAPStub _stub = new services.SimpleWebServiceSOAPStub(new java.net.URL(SimpleWebServiceSOAP_address), this);
                _stub.setPortName(getSimpleWebServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SimpleWebServiceSOAP".equals(inputPortName)) {
            return getSimpleWebServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services/", "SimpleWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services/", "SimpleWebServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SimpleWebServiceSOAP".equals(portName)) {
            setSimpleWebServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
