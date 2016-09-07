/**
 * ApplyTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class ApplyTransactionRequest  implements java.io.Serializable {
    private java.lang.String clientSwitchTransactionId;

    private java.util.Calendar clientSwitchTransactionDate;

    private java.lang.String ePagoTransactionId;

    private java.lang.String conceptCode;

    private java.math.BigDecimal totalAmount;

    private com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod[] paymentBreakdown;

    private com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] capturedReferences;

    public ApplyTransactionRequest() {
    }

    public ApplyTransactionRequest(
           java.lang.String clientSwitchTransactionId,
           java.util.Calendar clientSwitchTransactionDate,
           java.lang.String ePagoTransactionId,
           java.lang.String conceptCode,
           java.math.BigDecimal totalAmount,
           com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod[] paymentBreakdown,
           com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] capturedReferences) {
           this.clientSwitchTransactionId = clientSwitchTransactionId;
           this.clientSwitchTransactionDate = clientSwitchTransactionDate;
           this.ePagoTransactionId = ePagoTransactionId;
           this.conceptCode = conceptCode;
           this.totalAmount = totalAmount;
           this.paymentBreakdown = paymentBreakdown;
           this.capturedReferences = capturedReferences;
    }


    /**
     * Gets the clientSwitchTransactionId value for this ApplyTransactionRequest.
     * 
     * @return clientSwitchTransactionId
     */
    public java.lang.String getClientSwitchTransactionId() {
        return clientSwitchTransactionId;
    }


    /**
     * Sets the clientSwitchTransactionId value for this ApplyTransactionRequest.
     * 
     * @param clientSwitchTransactionId
     */
    public void setClientSwitchTransactionId(java.lang.String clientSwitchTransactionId) {
        this.clientSwitchTransactionId = clientSwitchTransactionId;
    }


    /**
     * Gets the clientSwitchTransactionDate value for this ApplyTransactionRequest.
     * 
     * @return clientSwitchTransactionDate
     */
    public java.util.Calendar getClientSwitchTransactionDate() {
        return clientSwitchTransactionDate;
    }


    /**
     * Sets the clientSwitchTransactionDate value for this ApplyTransactionRequest.
     * 
     * @param clientSwitchTransactionDate
     */
    public void setClientSwitchTransactionDate(java.util.Calendar clientSwitchTransactionDate) {
        this.clientSwitchTransactionDate = clientSwitchTransactionDate;
    }


    /**
     * Gets the ePagoTransactionId value for this ApplyTransactionRequest.
     * 
     * @return ePagoTransactionId
     */
    public java.lang.String getEPagoTransactionId() {
        return ePagoTransactionId;
    }


    /**
     * Sets the ePagoTransactionId value for this ApplyTransactionRequest.
     * 
     * @param ePagoTransactionId
     */
    public void setEPagoTransactionId(java.lang.String ePagoTransactionId) {
        this.ePagoTransactionId = ePagoTransactionId;
    }


    /**
     * Gets the conceptCode value for this ApplyTransactionRequest.
     * 
     * @return conceptCode
     */
    public java.lang.String getConceptCode() {
        return conceptCode;
    }


    /**
     * Sets the conceptCode value for this ApplyTransactionRequest.
     * 
     * @param conceptCode
     */
    public void setConceptCode(java.lang.String conceptCode) {
        this.conceptCode = conceptCode;
    }


    /**
     * Gets the totalAmount value for this ApplyTransactionRequest.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this ApplyTransactionRequest.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the paymentBreakdown value for this ApplyTransactionRequest.
     * 
     * @return paymentBreakdown
     */
    public com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod[] getPaymentBreakdown() {
        return paymentBreakdown;
    }


    /**
     * Sets the paymentBreakdown value for this ApplyTransactionRequest.
     * 
     * @param paymentBreakdown
     */
    public void setPaymentBreakdown(com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod[] paymentBreakdown) {
        this.paymentBreakdown = paymentBreakdown;
    }


    /**
     * Gets the capturedReferences value for this ApplyTransactionRequest.
     * 
     * @return capturedReferences
     */
    public com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] getCapturedReferences() {
        return capturedReferences;
    }


    /**
     * Sets the capturedReferences value for this ApplyTransactionRequest.
     * 
     * @param capturedReferences
     */
    public void setCapturedReferences(com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] capturedReferences) {
        this.capturedReferences = capturedReferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyTransactionRequest)) return false;
        ApplyTransactionRequest other = (ApplyTransactionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSwitchTransactionId==null && other.getClientSwitchTransactionId()==null) || 
             (this.clientSwitchTransactionId!=null &&
              this.clientSwitchTransactionId.equals(other.getClientSwitchTransactionId()))) &&
            ((this.clientSwitchTransactionDate==null && other.getClientSwitchTransactionDate()==null) || 
             (this.clientSwitchTransactionDate!=null &&
              this.clientSwitchTransactionDate.equals(other.getClientSwitchTransactionDate()))) &&
            ((this.ePagoTransactionId==null && other.getEPagoTransactionId()==null) || 
             (this.ePagoTransactionId!=null &&
              this.ePagoTransactionId.equals(other.getEPagoTransactionId()))) &&
            ((this.conceptCode==null && other.getConceptCode()==null) || 
             (this.conceptCode!=null &&
              this.conceptCode.equals(other.getConceptCode()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.paymentBreakdown==null && other.getPaymentBreakdown()==null) || 
             (this.paymentBreakdown!=null &&
              java.util.Arrays.equals(this.paymentBreakdown, other.getPaymentBreakdown()))) &&
            ((this.capturedReferences==null && other.getCapturedReferences()==null) || 
             (this.capturedReferences!=null &&
              java.util.Arrays.equals(this.capturedReferences, other.getCapturedReferences())));
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
        if (getClientSwitchTransactionId() != null) {
            _hashCode += getClientSwitchTransactionId().hashCode();
        }
        if (getClientSwitchTransactionDate() != null) {
            _hashCode += getClientSwitchTransactionDate().hashCode();
        }
        if (getEPagoTransactionId() != null) {
            _hashCode += getEPagoTransactionId().hashCode();
        }
        if (getConceptCode() != null) {
            _hashCode += getConceptCode().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getPaymentBreakdown() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentBreakdown());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentBreakdown(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapturedReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCapturedReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCapturedReferences(), i);
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
        new org.apache.axis.description.TypeDesc(ApplyTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "conceptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentBreakdown");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentBreakdown"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "TransactionPaymentMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "payment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturedReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "capturedReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "CapturedReference"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference"));
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
