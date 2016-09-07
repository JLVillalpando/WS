/**
 * ApplyVoidTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class ApplyVoidTransactionRequest  implements java.io.Serializable {
    private java.lang.String clientSwitchVoidTransactionId;

    private java.lang.String originalClientSwitchTransactionId;

    private java.lang.String originalEPagoTransactionId;

    private java.util.Calendar clientSwitchVoidTransactionDate;

    private java.lang.String remarks;

    public ApplyVoidTransactionRequest() {
    }

    public ApplyVoidTransactionRequest(
           java.lang.String clientSwitchVoidTransactionId,
           java.lang.String originalClientSwitchTransactionId,
           java.lang.String originalEPagoTransactionId,
           java.util.Calendar clientSwitchVoidTransactionDate,
           java.lang.String remarks) {
           this.clientSwitchVoidTransactionId = clientSwitchVoidTransactionId;
           this.originalClientSwitchTransactionId = originalClientSwitchTransactionId;
           this.originalEPagoTransactionId = originalEPagoTransactionId;
           this.clientSwitchVoidTransactionDate = clientSwitchVoidTransactionDate;
           this.remarks = remarks;
    }


    /**
     * Gets the clientSwitchVoidTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @return clientSwitchVoidTransactionId
     */
    public java.lang.String getClientSwitchVoidTransactionId() {
        return clientSwitchVoidTransactionId;
    }


    /**
     * Sets the clientSwitchVoidTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @param clientSwitchVoidTransactionId
     */
    public void setClientSwitchVoidTransactionId(java.lang.String clientSwitchVoidTransactionId) {
        this.clientSwitchVoidTransactionId = clientSwitchVoidTransactionId;
    }


    /**
     * Gets the originalClientSwitchTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @return originalClientSwitchTransactionId
     */
    public java.lang.String getOriginalClientSwitchTransactionId() {
        return originalClientSwitchTransactionId;
    }


    /**
     * Sets the originalClientSwitchTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @param originalClientSwitchTransactionId
     */
    public void setOriginalClientSwitchTransactionId(java.lang.String originalClientSwitchTransactionId) {
        this.originalClientSwitchTransactionId = originalClientSwitchTransactionId;
    }


    /**
     * Gets the originalEPagoTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @return originalEPagoTransactionId
     */
    public java.lang.String getOriginalEPagoTransactionId() {
        return originalEPagoTransactionId;
    }


    /**
     * Sets the originalEPagoTransactionId value for this ApplyVoidTransactionRequest.
     * 
     * @param originalEPagoTransactionId
     */
    public void setOriginalEPagoTransactionId(java.lang.String originalEPagoTransactionId) {
        this.originalEPagoTransactionId = originalEPagoTransactionId;
    }


    /**
     * Gets the clientSwitchVoidTransactionDate value for this ApplyVoidTransactionRequest.
     * 
     * @return clientSwitchVoidTransactionDate
     */
    public java.util.Calendar getClientSwitchVoidTransactionDate() {
        return clientSwitchVoidTransactionDate;
    }


    /**
     * Sets the clientSwitchVoidTransactionDate value for this ApplyVoidTransactionRequest.
     * 
     * @param clientSwitchVoidTransactionDate
     */
    public void setClientSwitchVoidTransactionDate(java.util.Calendar clientSwitchVoidTransactionDate) {
        this.clientSwitchVoidTransactionDate = clientSwitchVoidTransactionDate;
    }


    /**
     * Gets the remarks value for this ApplyVoidTransactionRequest.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ApplyVoidTransactionRequest.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyVoidTransactionRequest)) return false;
        ApplyVoidTransactionRequest other = (ApplyVoidTransactionRequest) obj;
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
            ((this.originalClientSwitchTransactionId==null && other.getOriginalClientSwitchTransactionId()==null) || 
             (this.originalClientSwitchTransactionId!=null &&
              this.originalClientSwitchTransactionId.equals(other.getOriginalClientSwitchTransactionId()))) &&
            ((this.originalEPagoTransactionId==null && other.getOriginalEPagoTransactionId()==null) || 
             (this.originalEPagoTransactionId!=null &&
              this.originalEPagoTransactionId.equals(other.getOriginalEPagoTransactionId()))) &&
            ((this.clientSwitchVoidTransactionDate==null && other.getClientSwitchVoidTransactionDate()==null) || 
             (this.clientSwitchVoidTransactionDate!=null &&
              this.clientSwitchVoidTransactionDate.equals(other.getClientSwitchVoidTransactionDate()))) &&
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
        if (getClientSwitchVoidTransactionId() != null) {
            _hashCode += getClientSwitchVoidTransactionId().hashCode();
        }
        if (getOriginalClientSwitchTransactionId() != null) {
            _hashCode += getOriginalClientSwitchTransactionId().hashCode();
        }
        if (getOriginalEPagoTransactionId() != null) {
            _hashCode += getOriginalEPagoTransactionId().hashCode();
        }
        if (getClientSwitchVoidTransactionDate() != null) {
            _hashCode += getClientSwitchVoidTransactionDate().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyVoidTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalClientSwitchTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "originalClientSwitchTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalEPagoTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "originalEPagoTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchVoidTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchVoidTransactionDate"));
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
