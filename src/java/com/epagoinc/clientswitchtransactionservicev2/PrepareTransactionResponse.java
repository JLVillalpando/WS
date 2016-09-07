/**
 * PrepareTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class PrepareTransactionResponse  implements java.io.Serializable {
    private int statusCode;

    private java.lang.String statusMessage;

    private java.lang.String clientSwitchTransactionId;

    private java.lang.String ePagoTransactionId;

    private java.math.BigDecimal subTotalAmount;

    private java.math.BigDecimal totalAmount;

    private com.epagoinc.clientswitchtransactionservicev2.Tax[] taxes;

    private com.epagoinc.clientswitchtransactionservicev2.PaymentMethod[] paymentMethods;

    private com.epagoinc.clientswitchtransactionservicev2.Charge[] otherCharges;

    private com.epagoinc.clientswitchtransactionservicev2.Reference[] otherReferences;

    private com.epagoinc.clientswitchtransactionservicev2.Reference[] dynamicReferences;

    public PrepareTransactionResponse() {
    }

    public PrepareTransactionResponse(
           int statusCode,
           java.lang.String statusMessage,
           java.lang.String clientSwitchTransactionId,
           java.lang.String ePagoTransactionId,
           java.math.BigDecimal subTotalAmount,
           java.math.BigDecimal totalAmount,
           com.epagoinc.clientswitchtransactionservicev2.Tax[] taxes,
           com.epagoinc.clientswitchtransactionservicev2.PaymentMethod[] paymentMethods,
           com.epagoinc.clientswitchtransactionservicev2.Charge[] otherCharges,
           com.epagoinc.clientswitchtransactionservicev2.Reference[] otherReferences,
           com.epagoinc.clientswitchtransactionservicev2.Reference[] dynamicReferences) {
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.clientSwitchTransactionId = clientSwitchTransactionId;
           this.ePagoTransactionId = ePagoTransactionId;
           this.subTotalAmount = subTotalAmount;
           this.totalAmount = totalAmount;
           this.taxes = taxes;
           this.paymentMethods = paymentMethods;
           this.otherCharges = otherCharges;
           this.otherReferences = otherReferences;
           this.dynamicReferences = dynamicReferences;
    }


    /**
     * Gets the statusCode value for this PrepareTransactionResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this PrepareTransactionResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this PrepareTransactionResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this PrepareTransactionResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the clientSwitchTransactionId value for this PrepareTransactionResponse.
     * 
     * @return clientSwitchTransactionId
     */
    public java.lang.String getClientSwitchTransactionId() {
        return clientSwitchTransactionId;
    }


    /**
     * Sets the clientSwitchTransactionId value for this PrepareTransactionResponse.
     * 
     * @param clientSwitchTransactionId
     */
    public void setClientSwitchTransactionId(java.lang.String clientSwitchTransactionId) {
        this.clientSwitchTransactionId = clientSwitchTransactionId;
    }


    /**
     * Gets the ePagoTransactionId value for this PrepareTransactionResponse.
     * 
     * @return ePagoTransactionId
     */
    public java.lang.String getEPagoTransactionId() {
        return ePagoTransactionId;
    }


    /**
     * Sets the ePagoTransactionId value for this PrepareTransactionResponse.
     * 
     * @param ePagoTransactionId
     */
    public void setEPagoTransactionId(java.lang.String ePagoTransactionId) {
        this.ePagoTransactionId = ePagoTransactionId;
    }


    /**
     * Gets the subTotalAmount value for this PrepareTransactionResponse.
     * 
     * @return subTotalAmount
     */
    public java.math.BigDecimal getSubTotalAmount() {
        return subTotalAmount;
    }


    /**
     * Sets the subTotalAmount value for this PrepareTransactionResponse.
     * 
     * @param subTotalAmount
     */
    public void setSubTotalAmount(java.math.BigDecimal subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }


    /**
     * Gets the totalAmount value for this PrepareTransactionResponse.
     * 
     * @return totalAmount
     */
    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this PrepareTransactionResponse.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.math.BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the taxes value for this PrepareTransactionResponse.
     * 
     * @return taxes
     */
    public com.epagoinc.clientswitchtransactionservicev2.Tax[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this PrepareTransactionResponse.
     * 
     * @param taxes
     */
    public void setTaxes(com.epagoinc.clientswitchtransactionservicev2.Tax[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the paymentMethods value for this PrepareTransactionResponse.
     * 
     * @return paymentMethods
     */
    public com.epagoinc.clientswitchtransactionservicev2.PaymentMethod[] getPaymentMethods() {
        return paymentMethods;
    }


    /**
     * Sets the paymentMethods value for this PrepareTransactionResponse.
     * 
     * @param paymentMethods
     */
    public void setPaymentMethods(com.epagoinc.clientswitchtransactionservicev2.PaymentMethod[] paymentMethods) {
        this.paymentMethods = paymentMethods;
    }


    /**
     * Gets the otherCharges value for this PrepareTransactionResponse.
     * 
     * @return otherCharges
     */
    public com.epagoinc.clientswitchtransactionservicev2.Charge[] getOtherCharges() {
        return otherCharges;
    }


    /**
     * Sets the otherCharges value for this PrepareTransactionResponse.
     * 
     * @param otherCharges
     */
    public void setOtherCharges(com.epagoinc.clientswitchtransactionservicev2.Charge[] otherCharges) {
        this.otherCharges = otherCharges;
    }


    /**
     * Gets the otherReferences value for this PrepareTransactionResponse.
     * 
     * @return otherReferences
     */
    public com.epagoinc.clientswitchtransactionservicev2.Reference[] getOtherReferences() {
        return otherReferences;
    }


    /**
     * Sets the otherReferences value for this PrepareTransactionResponse.
     * 
     * @param otherReferences
     */
    public void setOtherReferences(com.epagoinc.clientswitchtransactionservicev2.Reference[] otherReferences) {
        this.otherReferences = otherReferences;
    }


    /**
     * Gets the dynamicReferences value for this PrepareTransactionResponse.
     * 
     * @return dynamicReferences
     */
    public com.epagoinc.clientswitchtransactionservicev2.Reference[] getDynamicReferences() {
        return dynamicReferences;
    }


    /**
     * Sets the dynamicReferences value for this PrepareTransactionResponse.
     * 
     * @param dynamicReferences
     */
    public void setDynamicReferences(com.epagoinc.clientswitchtransactionservicev2.Reference[] dynamicReferences) {
        this.dynamicReferences = dynamicReferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepareTransactionResponse)) return false;
        PrepareTransactionResponse other = (PrepareTransactionResponse) obj;
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
            ((this.clientSwitchTransactionId==null && other.getClientSwitchTransactionId()==null) || 
             (this.clientSwitchTransactionId!=null &&
              this.clientSwitchTransactionId.equals(other.getClientSwitchTransactionId()))) &&
            ((this.ePagoTransactionId==null && other.getEPagoTransactionId()==null) || 
             (this.ePagoTransactionId!=null &&
              this.ePagoTransactionId.equals(other.getEPagoTransactionId()))) &&
            ((this.subTotalAmount==null && other.getSubTotalAmount()==null) || 
             (this.subTotalAmount!=null &&
              this.subTotalAmount.equals(other.getSubTotalAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.paymentMethods==null && other.getPaymentMethods()==null) || 
             (this.paymentMethods!=null &&
              java.util.Arrays.equals(this.paymentMethods, other.getPaymentMethods()))) &&
            ((this.otherCharges==null && other.getOtherCharges()==null) || 
             (this.otherCharges!=null &&
              java.util.Arrays.equals(this.otherCharges, other.getOtherCharges()))) &&
            ((this.otherReferences==null && other.getOtherReferences()==null) || 
             (this.otherReferences!=null &&
              java.util.Arrays.equals(this.otherReferences, other.getOtherReferences()))) &&
            ((this.dynamicReferences==null && other.getDynamicReferences()==null) || 
             (this.dynamicReferences!=null &&
              java.util.Arrays.equals(this.dynamicReferences, other.getDynamicReferences())));
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
        if (getClientSwitchTransactionId() != null) {
            _hashCode += getClientSwitchTransactionId().hashCode();
        }
        if (getEPagoTransactionId() != null) {
            _hashCode += getEPagoTransactionId().hashCode();
        }
        if (getSubTotalAmount() != null) {
            _hashCode += getSubTotalAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicReferences(), i);
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
        new org.apache.axis.description.TypeDesc(PrepareTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionResponse"));
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
        elemField.setFieldName("clientSwitchTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("subTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "subTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "tax"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentMethod"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "otherCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Charge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Charge"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "otherReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "dynamicReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
