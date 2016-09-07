/**
 * Agent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice ;

public class Agent  implements java.io.Serializable {
    private java.lang.String street;

    private java.lang.String neighborhood;

    private java.lang.String geoPoliticalLocation;

    private java.lang.String name;  // attribute

    private java.lang.String code;  // attribute

    private java.lang.String categoryCode;  // attribute

    public Agent() {
    }

    public Agent(
           java.lang.String street,
           java.lang.String neighborhood,
           java.lang.String geoPoliticalLocation,
           java.lang.String name,
           java.lang.String code,
           java.lang.String categoryCode) {
           this.street = street;
           this.neighborhood = neighborhood;
           this.geoPoliticalLocation = geoPoliticalLocation;
           this.name = name;
           this.code = code;
           this.categoryCode = categoryCode;
    }


    /**
     * Gets the street value for this Agent.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Agent.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the neighborhood value for this Agent.
     * 
     * @return neighborhood
     */
    public java.lang.String getNeighborhood() {
        return neighborhood;
    }


    /**
     * Sets the neighborhood value for this Agent.
     * 
     * @param neighborhood
     */
    public void setNeighborhood(java.lang.String neighborhood) {
        this.neighborhood = neighborhood;
    }


    /**
     * Gets the geoPoliticalLocation value for this Agent.
     * 
     * @return geoPoliticalLocation
     */
    public java.lang.String getGeoPoliticalLocation() {
        return geoPoliticalLocation;
    }


    /**
     * Sets the geoPoliticalLocation value for this Agent.
     * 
     * @param geoPoliticalLocation
     */
    public void setGeoPoliticalLocation(java.lang.String geoPoliticalLocation) {
        this.geoPoliticalLocation = geoPoliticalLocation;
    }


    /**
     * Gets the name value for this Agent.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Agent.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the code value for this Agent.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this Agent.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the categoryCode value for this Agent.
     * 
     * @return categoryCode
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this Agent.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Agent)) return false;
        Agent other = (Agent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.neighborhood==null && other.getNeighborhood()==null) || 
             (this.neighborhood!=null &&
              this.neighborhood.equals(other.getNeighborhood()))) &&
            ((this.geoPoliticalLocation==null && other.getGeoPoliticalLocation()==null) || 
             (this.geoPoliticalLocation!=null &&
              this.geoPoliticalLocation.equals(other.getGeoPoliticalLocation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode())));
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
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getNeighborhood() != null) {
            _hashCode += getNeighborhood().hashCode();
        }
        if (getGeoPoliticalLocation() != null) {
            _hashCode += getGeoPoliticalLocation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Agent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Agent"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "categoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neighborhood");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "neighborhood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoPoliticalLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "geoPoliticalLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
