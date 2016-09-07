/**
 * AgentDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice ;

public class AgentDeposit  implements java.io.Serializable {
    private java.lang.String clientNotificationId;

    private int ePagoNotificationId;

    private java.util.Date depositDate;

    private com.epagoinc.clientswitchdepositnotificationservice .Bank bank;

    private java.math.BigDecimal amount;

    private java.lang.String reference;

    public AgentDeposit() {
    }

    public AgentDeposit(
           java.lang.String clientNotificationId,
           int ePagoNotificationId,
           java.util.Date depositDate,
           com.epagoinc.clientswitchdepositnotificationservice .Bank bank,
           java.math.BigDecimal amount,
           java.lang.String reference) {
           this.clientNotificationId = clientNotificationId;
           this.ePagoNotificationId = ePagoNotificationId;
           this.depositDate = depositDate;
           this.bank = bank;
           this.amount = amount;
           this.reference = reference;
    }


    /**
     * Gets the clientNotificationId value for this AgentDeposit.
     * 
     * @return clientNotificationId
     */
    public java.lang.String getClientNotificationId() {
        return clientNotificationId;
    }


    /**
     * Sets the clientNotificationId value for this AgentDeposit.
     * 
     * @param clientNotificationId
     */
    public void setClientNotificationId(java.lang.String clientNotificationId) {
        this.clientNotificationId = clientNotificationId;
    }


    /**
     * Gets the ePagoNotificationId value for this AgentDeposit.
     * 
     * @return ePagoNotificationId
     */
    public int getEPagoNotificationId() {
        return ePagoNotificationId;
    }


    /**
     * Sets the ePagoNotificationId value for this AgentDeposit.
     * 
     * @param ePagoNotificationId
     */
    public void setEPagoNotificationId(int ePagoNotificationId) {
        this.ePagoNotificationId = ePagoNotificationId;
    }


    /**
     * Gets the depositDate value for this AgentDeposit.
     * 
     * @return depositDate
     */
    public java.util.Date getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this AgentDeposit.
     * 
     * @param depositDate
     */
    public void setDepositDate(java.util.Date depositDate) {
        this.depositDate = depositDate;
    }


    /**
     * Gets the bank value for this AgentDeposit.
     * 
     * @return bank
     */
    public com.epagoinc.clientswitchdepositnotificationservice .Bank getBank() {
        return bank;
    }


    /**
     * Sets the bank value for this AgentDeposit.
     * 
     * @param bank
     */
    public void setBank(com.epagoinc.clientswitchdepositnotificationservice .Bank bank) {
        this.bank = bank;
    }


    /**
     * Gets the amount value for this AgentDeposit.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AgentDeposit.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the reference value for this AgentDeposit.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this AgentDeposit.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentDeposit)) return false;
        AgentDeposit other = (AgentDeposit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientNotificationId==null && other.getClientNotificationId()==null) || 
             (this.clientNotificationId!=null &&
              this.clientNotificationId.equals(other.getClientNotificationId()))) &&
            this.ePagoNotificationId == other.getEPagoNotificationId() &&
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              this.depositDate.equals(other.getDepositDate()))) &&
            ((this.bank==null && other.getBank()==null) || 
             (this.bank!=null &&
              this.bank.equals(other.getBank()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
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
        if (getClientNotificationId() != null) {
            _hashCode += getClientNotificationId().hashCode();
        }
        _hashCode += getEPagoNotificationId();
        if (getDepositDate() != null) {
            _hashCode += getDepositDate().hashCode();
        }
        if (getBank() != null) {
            _hashCode += getBank().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgentDeposit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentDeposit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPagoNotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoNotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bank"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Bank"));
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
