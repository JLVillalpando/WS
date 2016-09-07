/**
 * VoidNotificationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class VoidNotificationRequest  implements java.io.Serializable {
    private java.lang.String originalClientSwitchNotificationId;

    private java.lang.String originalEPagoNotificationId;

    private java.lang.String clientSwitchVoidNotificationId;

    private java.util.Calendar clientSwitchVoidNotificationDate;

    private java.lang.String remarks;

    public VoidNotificationRequest() {
    }

    public VoidNotificationRequest(
           java.lang.String originalClientSwitchNotificationId,
           java.lang.String originalEPagoNotificationId,
           java.lang.String clientSwitchVoidNotificationId,
           java.util.Calendar clientSwitchVoidNotificationDate,
           java.lang.String remarks) {
           this.originalClientSwitchNotificationId = originalClientSwitchNotificationId;
           this.originalEPagoNotificationId = originalEPagoNotificationId;
           this.clientSwitchVoidNotificationId = clientSwitchVoidNotificationId;
           this.clientSwitchVoidNotificationDate = clientSwitchVoidNotificationDate;
           this.remarks = remarks;
    }


    /**
     * Gets the originalClientSwitchNotificationId value for this VoidNotificationRequest.
     * 
     * @return originalClientSwitchNotificationId
     */
    public java.lang.String getOriginalClientSwitchNotificationId() {
        return originalClientSwitchNotificationId;
    }


    /**
     * Sets the originalClientSwitchNotificationId value for this VoidNotificationRequest.
     * 
     * @param originalClientSwitchNotificationId
     */
    public void setOriginalClientSwitchNotificationId(java.lang.String originalClientSwitchNotificationId) {
        this.originalClientSwitchNotificationId = originalClientSwitchNotificationId;
    }


    /**
     * Gets the originalEPagoNotificationId value for this VoidNotificationRequest.
     * 
     * @return originalEPagoNotificationId
     */
    public java.lang.String getOriginalEPagoNotificationId() {
        return originalEPagoNotificationId;
    }


    /**
     * Sets the originalEPagoNotificationId value for this VoidNotificationRequest.
     * 
     * @param originalEPagoNotificationId
     */
    public void setOriginalEPagoNotificationId(java.lang.String originalEPagoNotificationId) {
        this.originalEPagoNotificationId = originalEPagoNotificationId;
    }


    /**
     * Gets the clientSwitchVoidNotificationId value for this VoidNotificationRequest.
     * 
     * @return clientSwitchVoidNotificationId
     */
    public java.lang.String getClientSwitchVoidNotificationId() {
        return clientSwitchVoidNotificationId;
    }


    /**
     * Sets the clientSwitchVoidNotificationId value for this VoidNotificationRequest.
     * 
     * @param clientSwitchVoidNotificationId
     */
    public void setClientSwitchVoidNotificationId(java.lang.String clientSwitchVoidNotificationId) {
        this.clientSwitchVoidNotificationId = clientSwitchVoidNotificationId;
    }


    /**
     * Gets the clientSwitchVoidNotificationDate value for this VoidNotificationRequest.
     * 
     * @return clientSwitchVoidNotificationDate
     */
    public java.util.Calendar getClientSwitchVoidNotificationDate() {
        return clientSwitchVoidNotificationDate;
    }


    /**
     * Sets the clientSwitchVoidNotificationDate value for this VoidNotificationRequest.
     * 
     * @param clientSwitchVoidNotificationDate
     */
    public void setClientSwitchVoidNotificationDate(java.util.Calendar clientSwitchVoidNotificationDate) {
        this.clientSwitchVoidNotificationDate = clientSwitchVoidNotificationDate;
    }


    /**
     * Gets the remarks value for this VoidNotificationRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this VoidNotificationRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoidNotificationRequest)) return false;
        VoidNotificationRequest other = (VoidNotificationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalClientSwitchNotificationId==null && other.getOriginalClientSwitchNotificationId()==null) || 
             (this.originalClientSwitchNotificationId!=null &&
              this.originalClientSwitchNotificationId.equals(other.getOriginalClientSwitchNotificationId()))) &&
            ((this.originalEPagoNotificationId==null && other.getOriginalEPagoNotificationId()==null) || 
             (this.originalEPagoNotificationId!=null &&
              this.originalEPagoNotificationId.equals(other.getOriginalEPagoNotificationId()))) &&
            ((this.clientSwitchVoidNotificationId==null && other.getClientSwitchVoidNotificationId()==null) || 
             (this.clientSwitchVoidNotificationId!=null &&
              this.clientSwitchVoidNotificationId.equals(other.getClientSwitchVoidNotificationId()))) &&
            ((this.clientSwitchVoidNotificationDate==null && other.getClientSwitchVoidNotificationDate()==null) || 
             (this.clientSwitchVoidNotificationDate!=null &&
              this.clientSwitchVoidNotificationDate.equals(other.getClientSwitchVoidNotificationDate()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks())));
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
        if (getOriginalClientSwitchNotificationId() != null) {
            _hashCode += getOriginalClientSwitchNotificationId().hashCode();
        }
        if (getOriginalEPagoNotificationId() != null) {
            _hashCode += getOriginalEPagoNotificationId().hashCode();
        }
        if (getClientSwitchVoidNotificationId() != null) {
            _hashCode += getClientSwitchVoidNotificationId().hashCode();
        }
        if (getClientSwitchVoidNotificationDate() != null) {
            _hashCode += getClientSwitchVoidNotificationDate().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoidNotificationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalClientSwitchNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "originalClientSwitchNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalEPagoNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "originalEPagoNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidNotificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidNotificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "remarks"));
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
