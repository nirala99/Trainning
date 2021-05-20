/**
 * EmployeSystemImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices;

public class EmployeSystemImplServiceLocator extends org.apache.axis.client.Service implements businessservices.EmployeSystemImplService {

    public EmployeSystemImplServiceLocator() {
    }


    public EmployeSystemImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmployeSystemImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmployeSystemImplPort
    private java.lang.String EmployeSystemImplPort_address = "http://localhost:8180/AxisWSProject/services/EmployeSystemImplService/";

    public java.lang.String getEmployeSystemImplPortAddress() {
        return EmployeSystemImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EmployeSystemImplPortWSDDServiceName = "EmployeSystemImplPort";

    public java.lang.String getEmployeSystemImplPortWSDDServiceName() {
        return EmployeSystemImplPortWSDDServiceName;
    }

    public void setEmployeSystemImplPortWSDDServiceName(java.lang.String name) {
        EmployeSystemImplPortWSDDServiceName = name;
    }

    public businessservices.EmployeeSystem getEmployeSystemImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmployeSystemImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmployeSystemImplPort(endpoint);
    }

    public businessservices.EmployeeSystem getEmployeSystemImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            businessservices.EmployeSystemImplPortBindingStub _stub = new businessservices.EmployeSystemImplPortBindingStub(portAddress, this);
            _stub.setPortName(getEmployeSystemImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeSystemImplPortEndpointAddress(java.lang.String address) {
        EmployeSystemImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (businessservices.EmployeeSystem.class.isAssignableFrom(serviceEndpointInterface)) {
                businessservices.EmployeSystemImplPortBindingStub _stub = new businessservices.EmployeSystemImplPortBindingStub(new java.net.URL(EmployeSystemImplPort_address), this);
                _stub.setPortName(getEmployeSystemImplPortWSDDServiceName());
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
        if ("EmployeSystemImplPort".equals(inputPortName)) {
            return getEmployeSystemImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://businessservices/", "EmployeSystemImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://businessservices/", "EmployeSystemImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EmployeSystemImplPort".equals(portName)) {
            setEmployeSystemImplPortEndpointAddress(address);
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
