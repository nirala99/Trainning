/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices.xsd;

public class Customer  implements java.io.Serializable {
    private java.lang.Integer customerId;

    private java.lang.String email;

    private java.lang.Long[] mobileNumber;

    private java.lang.String name;

    private businessservices.xsd.Account[] ownedAccount;

    public Customer() {
    }

    public Customer(
           java.lang.Integer customerId,
           java.lang.String email,
           java.lang.Long[] mobileNumber,
           java.lang.String name,
           businessservices.xsd.Account[] ownedAccount) {
           this.customerId = customerId;
           this.email = email;
           this.mobileNumber = mobileNumber;
           this.name = name;
           this.ownedAccount = ownedAccount;
    }


    /**
     * Gets the customerId value for this Customer.
     * 
     * @return customerId
     */
    public java.lang.Integer getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Customer.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the email value for this Customer.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Customer.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the mobileNumber value for this Customer.
     * 
     * @return mobileNumber
     */
    public java.lang.Long[] getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this Customer.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.Long[] mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public java.lang.Long getMobileNumber(int i) {
        return this.mobileNumber[i];
    }

    public void setMobileNumber(int i, java.lang.Long _value) {
        this.mobileNumber[i] = _value;
    }


    /**
     * Gets the name value for this Customer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Customer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownedAccount value for this Customer.
     * 
     * @return ownedAccount
     */
    public businessservices.xsd.Account[] getOwnedAccount() {
        return ownedAccount;
    }


    /**
     * Sets the ownedAccount value for this Customer.
     * 
     * @param ownedAccount
     */
    public void setOwnedAccount(businessservices.xsd.Account[] ownedAccount) {
        this.ownedAccount = ownedAccount;
    }

    public businessservices.xsd.Account getOwnedAccount(int i) {
        return this.ownedAccount[i];
    }

    public void setOwnedAccount(int i, businessservices.xsd.Account _value) {
        this.ownedAccount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              java.util.Arrays.equals(this.mobileNumber, other.getMobileNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ownedAccount==null && other.getOwnedAccount()==null) || 
             (this.ownedAccount!=null &&
              java.util.Arrays.equals(this.ownedAccount, other.getOwnedAccount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getMobileNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobileNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwnedAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnedAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnedAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://businessservices/xsd", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://businessservices/xsd", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://businessservices/xsd", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://businessservices/xsd", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://businessservices/xsd", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownedAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://businessservices/xsd", "ownedAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://businessservices/xsd", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
