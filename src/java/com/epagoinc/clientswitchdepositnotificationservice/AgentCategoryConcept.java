/**
 * AgentCategoryConcept.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice ;

public class AgentCategoryConcept  implements java.io.Serializable {
    private java.lang.String conceptCode;  // attribute

    public AgentCategoryConcept() {
    }

    public AgentCategoryConcept(
           java.lang.String conceptCode) {
           this.conceptCode = conceptCode;
    }


    /**
     * Gets the conceptCode value for this AgentCategoryConcept.
     * 
     * @return conceptCode
     */
    public java.lang.String getConceptCode() {
        return conceptCode;
    }


    /**
     * Sets the conceptCode value for this AgentCategoryConcept.
     * 
     * @param conceptCode
     */
    public void setConceptCode(java.lang.String conceptCode) {
        this.conceptCode = conceptCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentCategoryConcept)) return false;
        AgentCategoryConcept other = (AgentCategoryConcept) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conceptCode==null && other.getConceptCode()==null) || 
             (this.conceptCode!=null &&
              this.conceptCode.equals(other.getConceptCode())));
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
        if (getConceptCode() != null) {
            _hashCode += getConceptCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgentCategoryConcept.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentCategoryConcept"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conceptCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conceptCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
