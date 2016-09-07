/**
 * NotifyDepositResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice;

public class NotifyDepositResponse  implements java.io.Serializable {
    private java.lang.String clientSwitchNotificationId;

    private java.lang.String ePagoNotificationId;

    private int statusCode;

    private java.lang.String statusmessage;

    public NotifyDepositResponse() {
    }

    public NotifyDepositResponse(
           java.lang.String clientSwitchNotificationId,
           java.lang.String ePagoNotificationId,
           int statusCode,
           java.lang.String statusmessage) {
           this.clientSwitchNotificationId = clientSwitchNotificationId;
           this.ePagoNotificationId = ePagoNotificationId;
           this.statusCode = statusCode;
           this.statusmessage = statusmessage;
    }


    /**
     * Gets the clientSwitchNotificationId value for this NotifyDepositResponse.
     * 
     * @return clientSwitchNotificationId
     */
    public java.lang.String getClientSwitchNotificationId() {
        return clientSwitchNotificationId;
    }


    /**
     * Sets the clientSwitchNotificationId value for this NotifyDepositResponse.
     * 
     * @param clientSwitchNotificationId
     */
    public void setClientSwitchNotificationId(java.lang.String clientSwitchNotificationId) {
        this.clientSwitchNotificationId = clientSwitchNotificationId;
    }


    /**
     * Gets the ePagoNotificationId value for this NotifyDepositResponse.
     * 
     * @return ePagoNotificationId
     */
    public java.lang.String getEPagoNotificationId() {
        return ePagoNotificationId;
    }


    /**
     * Sets the ePagoNotificationId value for this NotifyDepositResponse.
     * 
     * @param ePagoNotificationId
     */
    public void setEPagoNotificationId(java.lang.String ePagoNotificationId) {
        this.ePagoNotificationId = ePagoNotificationId;
    }


    /**
     * Gets the statusCode value for this NotifyDepositResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this NotifyDepositResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusmessage value for this NotifyDepositResponse.
     * 
     * @return statusmessage
     */
    public java.lang.String getStatusmessage() {
        return statusmessage;
    }


    /**
     * Sets the statusmessage value for this NotifyDepositResponse.
     * 
     * @param statusmessage
     */
    public void setStatusmessage(java.lang.String statusmessage) {
        this.statusmessage = statusmessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyDepositResponse)) return false;
        NotifyDepositResponse other = (NotifyDepositResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSwitchNotificationId==null && other.getClientSwitchNotificationId()==null) || 
             (this.clientSwitchNotificationId!=null &&
              this.clientSwitchNotificationId.equals(other.getClientSwitchNotificationId()))) &&
            ((this.ePagoNotificationId==null && other.getEPagoNotificationId()==null) || 
             (this.ePagoNotificationId!=null &&
              this.ePagoNotificationId.equals(other.getEPagoNotificationId()))) &&
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
        if (getClientSwitchNotificationId() != null) {
            _hashCode += getClientSwitchNotificationId().hashCode();
        }
        if (getEPagoNotificationId() != null) {
            _hashCode += getEPagoNotificationId().hashCode();
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
        new org.apache.axis.description.TypeDesc(NotifyDepositResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoNotificationId"));
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
