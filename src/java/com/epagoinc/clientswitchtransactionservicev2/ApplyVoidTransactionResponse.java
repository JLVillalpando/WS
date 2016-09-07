/**
 * ApplyVoidTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class ApplyVoidTransactionResponse  implements java.io.Serializable {
    private java.lang.String clientSwitchVoidTransactionId;

    private java.lang.String ePagoVoidTransactionId;

    private java.util.Calendar ePagoVoidTransactionDate;

    private int statusCode;

    private java.lang.String statusMessage;

    public ApplyVoidTransactionResponse() {
    }

    public ApplyVoidTransactionResponse(
           java.lang.String clientSwitchVoidTransactionId,
           java.lang.String ePagoVoidTransactionId,
           java.util.Calendar ePagoVoidTransactionDate,
           int statusCode,
           java.lang.String statusMessage) {
           this.clientSwitchVoidTransactionId = clientSwitchVoidTransactionId;
           this.ePagoVoidTransactionId = ePagoVoidTransactionId;
           this.ePagoVoidTransactionDate = ePagoVoidTransactionDate;
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
    }


    /**
     * Gets the clientSwitchVoidTransactionId value for this ApplyVoidTransactionResponse.
     * 
     * @return clientSwitchVoidTransactionId
     */
    public java.lang.String getClientSwitchVoidTransactionId() {
        return clientSwitchVoidTransactionId;
    }


    /**
     * Sets the clientSwitchVoidTransactionId value for this ApplyVoidTransactionResponse.
     * 
     * @param clientSwitchVoidTransactionId
     */
    public void setClientSwitchVoidTransactionId(java.lang.String clientSwitchVoidTransactionId) {
        this.clientSwitchVoidTransactionId = clientSwitchVoidTransactionId;
    }


    /**
     * Gets the ePagoVoidTransactionId value for this ApplyVoidTransactionResponse.
     * 
     * @return ePagoVoidTransactionId
     */
    public java.lang.String getEPagoVoidTransactionId() {
        return ePagoVoidTransactionId;
    }


    /**
     * Sets the ePagoVoidTransactionId value for this ApplyVoidTransactionResponse.
     * 
     * @param ePagoVoidTransactionId
     */
    public void setEPagoVoidTransactionId(java.lang.String ePagoVoidTransactionId) {
        this.ePagoVoidTransactionId = ePagoVoidTransactionId;
    }


    /**
     * Gets the ePagoVoidTransactionDate value for this ApplyVoidTransactionResponse.
     * 
     * @return ePagoVoidTransactionDate
     */
    public java.util.Calendar getEPagoVoidTransactionDate() {
        return ePagoVoidTransactionDate;
    }


    /**
     * Sets the ePagoVoidTransactionDate value for this ApplyVoidTransactionResponse.
     * 
     * @param ePagoVoidTransactionDate
     */
    public void setEPagoVoidTransactionDate(java.util.Calendar ePagoVoidTransactionDate) {
        this.ePagoVoidTransactionDate = ePagoVoidTransactionDate;
    }


    /**
     * Gets the statusCode value for this ApplyVoidTransactionResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ApplyVoidTransactionResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this ApplyVoidTransactionResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this ApplyVoidTransactionResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyVoidTransactionResponse)) return false;
        ApplyVoidTransactionResponse other = (ApplyVoidTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSwitchVoidTransactionId==null && other.getClientSwitchVoidTransactionId()==null) || 
             (this.clientSwitchVoidTransactionId!=null &&
              this.clientSwitchVoidTransactionId.equals(other.getClientSwitchVoidTransactionId()))) &&
            ((this.ePagoVoidTransactionId==null && other.getEPagoVoidTransactionId()==null) || 
             (this.ePagoVoidTransactionId!=null &&
              this.ePagoVoidTransactionId.equals(other.getEPagoVoidTransactionId()))) &&
            ((this.ePagoVoidTransactionDate==null && other.getEPagoVoidTransactionDate()==null) || 
             (this.ePagoVoidTransactionDate!=null &&
              this.ePagoVoidTransactionDate.equals(other.getEPagoVoidTransactionDate()))) &&
            this.statusCode == other.getStatusCode() &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage())));
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
        if (getClientSwitchVoidTransactionId() != null) {
            _hashCode += getClientSwitchVoidTransactionId().hashCode();
        }
        if (getEPagoVoidTransactionId() != null) {
            _hashCode += getEPagoVoidTransactionId().hashCode();
        }
        if (getEPagoVoidTransactionDate() != null) {
            _hashCode += getEPagoVoidTransactionDate().hashCode();
        }
        _hashCode += getStatusCode();
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyVoidTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoVoidTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoVoidTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoVoidTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoVoidTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
