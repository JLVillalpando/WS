/**
 * AgentPendingDepositsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class AgentPendingDepositsRequest  implements java.io.Serializable {
    private java.lang.Object pendingDepositsRequest;

    public AgentPendingDepositsRequest() {
    }

    public AgentPendingDepositsRequest(
           java.lang.Object pendingDepositsRequest) {
           this.pendingDepositsRequest = pendingDepositsRequest;
    }


    /**
     * Gets the pendingDepositsRequest value for this AgentPendingDepositsRequest.
     * 
     * @return pendingDepositsRequest
     */
    public java.lang.Object getPendingDepositsRequest() {
        return pendingDepositsRequest;
    }


    /**
     * Sets the pendingDepositsRequest value for this AgentPendingDepositsRequest.
     * 
     * @param pendingDepositsRequest
     */
    public void setPendingDepositsRequest(java.lang.Object pendingDepositsRequest) {
        this.pendingDepositsRequest = pendingDepositsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentPendingDepositsRequest)) return false;
        AgentPendingDepositsRequest other = (AgentPendingDepositsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pendingDepositsRequest==null && other.getPendingDepositsRequest()==null) || 
             (this.pendingDepositsRequest!=null &&
              this.pendingDepositsRequest.equals(other.getPendingDepositsRequest())));
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
        if (getPendingDepositsRequest() != null) {
            _hashCode += getPendingDepositsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgentPendingDepositsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDepositsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "pendingDepositsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
