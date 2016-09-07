/**
 * NotifyDepositRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class NotifyDepositRequest  implements java.io.Serializable {
    private java.lang.String clientSwitchNotificationId;

    private java.util.Calendar clientSwitchNotificationDate;

    private java.math.BigDecimal amount;

    private java.lang.String accountNumber;

    private java.lang.String bankCode;

    private java.lang.String reference;

    public NotifyDepositRequest() {
    }

    public NotifyDepositRequest(
           java.lang.String clientSwitchNotificationId,
           java.util.Calendar clientSwitchNotificationDate,
           java.math.BigDecimal amount,
           java.lang.String accountNumber,
           java.lang.String bankCode,
           java.lang.String reference) {
           this.clientSwitchNotificationId = clientSwitchNotificationId;
           this.clientSwitchNotificationDate = clientSwitchNotificationDate;
           this.amount = amount;
           this.accountNumber = accountNumber;
           this.bankCode = bankCode;
           this.reference = reference;
    }


    /**
     * Gets the clientSwitchNotificationId value for this NotifyDepositRequest.
     * 
     * @return clientSwitchNotificationId
     */
    public java.lang.String getClientSwitchNotificationId() {
        return clientSwitchNotificationId;
    }


    /**
     * Sets the clientSwitchNotificationId value for this NotifyDepositRequest.
     * 
     * @param clientSwitchNotificationId
     */
    public void setClientSwitchNotificationId(java.lang.String clientSwitchNotificationId) {
        this.clientSwitchNotificationId = clientSwitchNotificationId;
    }


    /**
     * Gets the clientSwitchNotificationDate value for this NotifyDepositRequest.
     * 
     * @return clientSwitchNotificationDate
     */
    public java.util.Calendar getClientSwitchNotificationDate() {
        return clientSwitchNotificationDate;
    }


    /**
     * Sets the clientSwitchNotificationDate value for this NotifyDepositRequest.
     * 
     * @param clientSwitchNotificationDate
     */
    public void setClientSwitchNotificationDate(java.util.Calendar clientSwitchNotificationDate) {
        this.clientSwitchNotificationDate = clientSwitchNotificationDate;
    }


    /**
     * Gets the amount value for this NotifyDepositRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this NotifyDepositRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the accountNumber value for this NotifyDepositRequest.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this NotifyDepositRequest.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the bankCode value for this NotifyDepositRequest.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this NotifyDepositRequest.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the reference value for this NotifyDepositRequest.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this NotifyDepositRequest.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyDepositRequest)) return false;
        NotifyDepositRequest other = (NotifyDepositRequest) obj;
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
            ((this.clientSwitchNotificationDate==null && other.getClientSwitchNotificationDate()==null) || 
             (this.clientSwitchNotificationDate!=null &&
              this.clientSwitchNotificationDate.equals(other.getClientSwitchNotificationDate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference())));
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
        if (getClientSwitchNotificationDate() != null) {
            _hashCode += getClientSwitchNotificationDate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotifyDepositRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchNotificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchNotificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference"));
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
