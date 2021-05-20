/**
 * SimpleWebServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class SimpleWebServiceSOAPSkeleton implements services.SimpleWebService_PortType, org.apache.axis.wsdl.Skeleton {
    private services.SimpleWebService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cardNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validateCard", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://services/", "validateCard"));
        _oper.setSoapAction("http://services/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validateCard") == null) {
            _myOperations.put("validateCard", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validateCard")).add(_oper);
    }

    public SimpleWebServiceSOAPSkeleton() {
        this.impl = new services.SimpleWebServiceSOAPImpl();
    }

    public SimpleWebServiceSOAPSkeleton(services.SimpleWebService_PortType impl) {
        this.impl = impl;
    }
    public boolean validateCard(int cardNumber) throws java.rmi.RemoteException
    {
        boolean ret = impl.validateCard(cardNumber);
        return ret;
    }

}
