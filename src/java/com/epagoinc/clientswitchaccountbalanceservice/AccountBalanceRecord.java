/**
 * AccountBalanceRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchaccountbalanceservice;

public class AccountBalanceRecord  implements java.io.Serializable {
    private java.lang.String account;

    private java.math.BigDecimal amount;

    private int statusCode;

    private java.lang.String statusMessage;

    private com.epagoinc.clientswitchaccountbalanceservice.ArrayOfReferenceCollectionReferenceReference[] conceptReferences;

    private com.epagoinc.clientswitchaccountbalanceservice.AccountBalancePaymentRule paymentRule;

    public AccountBalanceRecord() {
    }

    public AccountBalanceRecord(
           java.lang.String account,
           java.math.BigDecimal amount,
           int statusCode,
           java.lang.String statusMessage,
           com.epagoinc.clientswitchaccountbalanceservice.ArrayOfReferenceCollectionReferenceReference[] conceptReferences,
           com.epagoinc.clientswitchaccountbalanceservice.AccountBalancePaymentRule paymentRule) {
           this.account = account;
           this.amount = amount;
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.conceptReferences = conceptReferences;
           this.paymentRule = paymentRule;
    }


    /**
     * Gets the account value for this AccountBalanceRecord.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountBalanceRecord.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the amount value for this AccountBalanceRecord.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AccountBalanceRecord.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the statusCode value for this AccountBalanceRecord.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AccountBalanceRecord.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this AccountBalanceRecord.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this AccountBalanceRecord.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the conceptReferences value for this AccountBalanceRecord.
     * 
     * @return conceptReferences
     */
    public com.epagoinc.clientswitchaccountbalanceservice.ArrayOfReferenceCollectionReferenceReference[] getConceptReferences() {
        return conceptReferences;
    }


    /**
     * Sets the conceptReferences value for this AccountBalanceRecord.
     * 
     * @param conceptReferences
     */
    public void setConceptReferences(com.epagoinc.clientswitchaccountbalanceservice.ArrayOfReferenceCollectionReferenceReference[] conceptReferences) {
        this.conceptReferences = conceptReferences;
    }


    /**
     * Gets the paymentRule value for this AccountBalanceRecord.
     * 
     * @return paymentRule
     */
    public com.epagoinc.clientswitchaccountbalanceservice.AccountBalancePaymentRule getPaymentRule() {
        return paymentRule;
    }


    /**
     * Sets the paymentRule value for this AccountBalanceRecord.
     * 
     * @param paymentRule
     */
    public void setPaymentRule(com.epagoinc.clientswitchaccountbalanceservice.AccountBalancePaymentRule paymentRule) {
        this.paymentRule = paymentRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountBalanceRecord)) return false;
        AccountBalanceRecord other = (AccountBalanceRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            this.statusCode == other.getStatusCode() &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.conceptReferences==null && other.getConceptReferences()==null) || 
             (this.conceptReferences!=null &&
              java.util.Arrays.equals(this.conceptReferences, other.getConceptReferences()))) &&
            ((this.paymentRule==null && other.getPaymentRule()==null) || 
             (this.paymentRule!=null &&
              this.paymentRule.equals(other.getPaymentRule())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        _hashCode += getStatusCode();
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getConceptReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConceptReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConceptReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentRule() != null) {
            _hashCode += getPaymentRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountBalanceRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AccountBalanceRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("conceptReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "conceptReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">ArrayOfReferenceCollectionReference>Reference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Reference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AccountBalancePaymentRule"));
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
