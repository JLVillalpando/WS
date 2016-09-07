/**
 * AgentPendingDepositsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class AgentPendingDepositsResponse  implements java.io.Serializable {
    private int statusCode;

    private java.lang.String statusMessage;

    private com.epagoinc.clientswitchdepositnotificationservice.AgentDeposit[] pendingDeposits;

    public AgentPendingDepositsResponse() {
    }

    public AgentPendingDepositsResponse(
           int statusCode,
           java.lang.String statusMessage,
           com.epagoinc.clientswitchdepositnotificationservice.AgentDeposit[] pendingDeposits) {
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.pendingDeposits = pendingDeposits;
    }


    /**
     * Gets the statusCode value for this AgentPendingDepositsResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AgentPendingDepositsResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this AgentPendingDepositsResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this AgentPendingDepositsResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the pendingDeposits value for this AgentPendingDepositsResponse.
     * 
     * @return pendingDeposits
     */
    public com.epagoinc.clientswitchdepositnotificationservice .AgentDeposit[] getPendingDeposits() {
        return pendingDeposits;
    }


    /**
     * Sets the pendingDeposits value for this AgentPendingDepositsResponse.
     * 
     * @param pendingDeposits
     */
    public void setPendingDeposits(com.epagoinc.clientswitchdepositnotificationservice .AgentDeposit[] pendingDeposits) {
        this.pendingDeposits = pendingDeposits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentPendingDepositsResponse)) return false;
        AgentPendingDepositsResponse other = (AgentPendingDepositsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.statusCode == other.getStatusCode() &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.pendingDeposits==null && other.getPendingDeposits()==null) || 
             (this.pendingDeposits!=null &&
              java.util.Arrays.equals(this.pendingDeposits, other.getPendingDeposits())));
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
        _hashCode += getStatusCode();
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getPendingDeposits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingDeposits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPendingDeposits(), i);
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
        new org.apache.axis.description.TypeDesc(AgentPendingDepositsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "statusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDeposits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "pendingDeposits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentDeposit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentDeposit"));
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
