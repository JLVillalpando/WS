/**
 * VoidNotificationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class VoidNotificationResponse  implements java.io.Serializable {
    private java.lang.String clientSwitchVoidNotificationId;

    private java.lang.String ePagoVoidNotificationId;

    private int statusCode;

    private java.lang.String statusmessage;

    public VoidNotificationResponse() {
    }

    public VoidNotificationResponse(
           java.lang.String clientSwitchVoidNotificationId,
           java.lang.String ePagoVoidNotificationId,
           int statusCode,
           java.lang.String statusmessage) {
           this.clientSwitchVoidNotificationId = clientSwitchVoidNotificationId;
           this.ePagoVoidNotificationId = ePagoVoidNotificationId;
           this.statusCode = statusCode;
           this.statusmessage = statusmessage;
    }


    /**
     * Gets the clientSwitchVoidNotificationId value for this VoidNotificationResponse.
     * 
     * @return clientSwitchVoidNotificationId
     */
    public java.lang.String getClientSwitchVoidNotificationId() {
        return clientSwitchVoidNotificationId;
    }


    /**
     * Sets the clientSwitchVoidNotificationId value for this VoidNotificationResponse.
     * 
     * @param clientSwitchVoidNotificationId
     */
    public void setClientSwitchVoidNotificationId(java.lang.String clientSwitchVoidNotificationId) {
        this.clientSwitchVoidNotificationId = clientSwitchVoidNotificationId;
    }


    /**
     * Gets the ePagoVoidNotificationId value for this VoidNotificationResponse.
     * 
     * @return ePagoVoidNotificationId
     */
    public java.lang.String getEPagoVoidNotificationId() {
        return ePagoVoidNotificationId;
    }


    /**
     * Sets the ePagoVoidNotificationId value for this VoidNotificationResponse.
     * 
     * @param ePagoVoidNotificationId
     */
    public void setEPagoVoidNotificationId(java.lang.String ePagoVoidNotificationId) {
        this.ePagoVoidNotificationId = ePagoVoidNotificationId;
    }


    /**
     * Gets the statusCode value for this VoidNotificationResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this VoidNotificationResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusmessage value for this VoidNotificationResponse.
     * 
     * @return statusmessage
     */
    public java.lang.String getStatusmessage() {
        return statusmessage;
    }


    /**
     * Sets the statusmessage value for this VoidNotificationResponse.
     * 
     * @param statusmessage
     */
    public void setStatusmessage(java.lang.String statusmessage) {
        this.statusmessage = statusmessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoidNotificationResponse)) return false;
        VoidNotificationResponse other = (VoidNotificationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSwitchVoidNotificationId==null && other.getClientSwitchVoidNotificationId()==null) || 
             (this.clientSwitchVoidNotificationId!=null &&
              this.clientSwitchVoidNotificationId.equals(other.getClientSwitchVoidNotificationId()))) &&
            ((this.ePagoVoidNotificationId==null && other.getEPagoVoidNotificationId()==null) || 
             (this.ePagoVoidNotificationId!=null &&
              this.ePagoVoidNotificationId.equals(other.getEPagoVoidNotificationId()))) &&
            this.statusCode == other.getStatusCode() &&
            ((this.statusmessage==null && other.getStatusmessage()==null) || 
             (this.statusmessage!=null &&
              this.statusmessage.equals(other.getStatusmessage())));
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
        if (getClientSwitchVoidNotificationId() != null) {
            _hashCode += getClientSwitchVoidNotificationId().hashCode();
        }
        if (getEPagoVoidNotificationId() != null) {
            _hashCode += getEPagoVoidNotificationId().hashCode();
        }
        _hashCode += getStatusCode();
        if (getStatusmessage() != null) {
            _hashCode += getStatusmessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoidNotificationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoVoidNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoVoidNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusmessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "statusmessage"));
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
