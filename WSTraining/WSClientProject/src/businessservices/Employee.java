/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package businessservices;

public class Employee  implements java.io.Serializable {
    private businessservices.EmployeeType employeeType;

    private java.lang.String employeeName;

    private businessservices.EmployeeProjectsAssignedEntry[] projectsAssigned;

    private double salary;

    private java.lang.String[] skills;

    private int employeeNumber;  // attribute

    public Employee() {
    }

    public Employee(
           businessservices.EmployeeType employeeType,
           java.lang.String employeeName,
           businessservices.EmployeeProjectsAssignedEntry[] projectsAssigned,
           double salary,
           java.lang.String[] skills,
           int employeeNumber) {
           this.employeeType = employeeType;
           this.employeeName = employeeName;
           this.projectsAssigned = projectsAssigned;
           this.salary = salary;
           this.skills = skills;
           this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the employeeType value for this Employee.
     * 
     * @return employeeType
     */
    public businessservices.EmployeeType getEmployeeType() {
        return employeeType;
    }


    /**
     * Sets the employeeType value for this Employee.
     * 
     * @param employeeType
     */
    public void setEmployeeType(businessservices.EmployeeType employeeType) {
        this.employeeType = employeeType;
    }


    /**
     * Gets the employeeName value for this Employee.
     * 
     * @return employeeName
     */
    public java.lang.String getEmployeeName() {
        return employeeName;
    }


    /**
     * Sets the employeeName value for this Employee.
     * 
     * @param employeeName
     */
    public void setEmployeeName(java.lang.String employeeName) {
        this.employeeName = employeeName;
    }


    /**
     * Gets the projectsAssigned value for this Employee.
     * 
     * @return projectsAssigned
     */
    public businessservices.EmployeeProjectsAssignedEntry[] getProjectsAssigned() {
        return projectsAssigned;
    }


    /**
     * Sets the projectsAssigned value for this Employee.
     * 
     * @param projectsAssigned
     */
    public void setProjectsAssigned(businessservices.EmployeeProjectsAssignedEntry[] projectsAssigned) {
        this.projectsAssigned = projectsAssigned;
    }


    /**
     * Gets the salary value for this Employee.
     * 
     * @return salary
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this Employee.
     * 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Gets the skills value for this Employee.
     * 
     * @return skills
     */
    public java.lang.String[] getSkills() {
        return skills;
    }


    /**
     * Sets the skills value for this Employee.
     * 
     * @param skills
     */
    public void setSkills(java.lang.String[] skills) {
        this.skills = skills;
    }

    public java.lang.String getSkills(int i) {
        return this.skills[i];
    }

    public void setSkills(int i, java.lang.String _value) {
        this.skills[i] = _value;
    }


    /**
     * Gets the employeeNumber value for this Employee.
     * 
     * @return employeeNumber
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this Employee.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeType==null && other.getEmployeeType()==null) || 
             (this.employeeType!=null &&
              this.employeeType.equals(other.getEmployeeType()))) &&
            ((this.employeeName==null && other.getEmployeeName()==null) || 
             (this.employeeName!=null &&
              this.employeeName.equals(other.getEmployeeName()))) &&
            ((this.projectsAssigned==null && other.getProjectsAssigned()==null) || 
             (this.projectsAssigned!=null &&
              java.util.Arrays.equals(this.projectsAssigned, other.getProjectsAssigned()))) &&
            this.salary == other.getSalary() &&
            ((this.skills==null && other.getSkills()==null) || 
             (this.skills!=null &&
              java.util.Arrays.equals(this.skills, other.getSkills()))) &&
            this.employeeNumber == other.getEmployeeNumber();
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
        if (getEmployeeType() != null) {
            _hashCode += getEmployeeType().hashCode();
        }
        if (getEmployeeName() != null) {
            _hashCode += getEmployeeName().hashCode();
        }
        if (getProjectsAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectsAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectsAssigned(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getSalary()).hashCode();
        if (getSkills() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSkills());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSkills(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getEmployeeNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://businessservices/", "employee"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("employeeNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "employeeNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://businessservices/", "employeeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectsAssigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectsAssigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://businessservices/", ">>employee>projectsAssigned>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skills");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
