/**
 * TransactionPaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class TransactionPaymentMethod  implements java.io.Serializable {
    private com.epagoinc.clientswitchtransactionservicev2.PaymentMethod paymentMethod;

    private java.math.BigDecimal amount;

    private java.lang.String documentNumber;

    private java.lang.String authorizationCode;

    private java.lang.String bankRoutingNumber;

    private java.util.Date documentDate;

    public TransactionPaymentMethod() {
    }

    public TransactionPaymentMethod(
           com.epagoinc.clientswitchtransactionservicev2.PaymentMethod paymentMethod,
           java.math.BigDecimal amount,
           java.lang.String documentNumber,
           java.lang.String authorizationCode,
           java.lang.String bankRoutingNumber,
           java.util.Date documentDate) {
           this.paymentMethod = paymentMethod;
           this.amount = amount;
           this.documentNumber = documentNumber;
           this.authorizationCode = authorizationCode;
           this.bankRoutingNumber = bankRoutingNumber;
           this.documentDate = documentDate;
    }


    /**
     * Gets the paymentMethod value for this TransactionPaymentMethod.
     * 
     * @return paymentMethod
     */
    public com.epagoinc.clientswitchtransactionservicev2.PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionPaymentMethod.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(com.epagoinc.clientswitchtransactionservicev2.PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the amount value for this TransactionPaymentMethod.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionPaymentMethod.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the documentNumber value for this TransactionPaymentMethod.
     * 
     * @return documentNumber
     */
    public java.lang.String getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this TransactionPaymentMethod.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.String documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the authorizationCode value for this TransactionPaymentMethod.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this TransactionPaymentMethod.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the bankRoutingNumber value for this TransactionPaymentMethod.
     * 
     * @return bankRoutingNumber
     */
    public java.lang.String getBankRoutingNumber() {
        return bankRoutingNumber;
    }


    /**
     * Sets the bankRoutingNumber value for this TransactionPaymentMethod.
     * 
     * @param bankRoutingNumber
     */
    public void setBankRoutingNumber(java.lang.String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }


    /**
     * Gets the documentDate value for this TransactionPaymentMethod.
     * 
     * @return documentDate
     */
    public java.util.Date getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this TransactionPaymentMethod.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.util.Date documentDate) {
        this.documentDate = documentDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionPaymentMethod)) return false;
        TransactionPaymentMethod other = (TransactionPaymentMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.bankRoutingNumber==null && other.getBankRoutingNumber()==null) || 
             (this.bankRoutingNumber!=null &&
              this.bankRoutingNumber.equals(other.getBankRoutingNumber()))) &&
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate())));
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
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getBankRoutingNumber() != null) {
            _hashCode += getBankRoutingNumber().hashCode();
        }
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionPaymentMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "TransactionPaymentMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "documentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "authorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bankRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "documentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
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
