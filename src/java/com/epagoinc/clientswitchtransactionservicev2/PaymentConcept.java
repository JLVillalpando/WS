/**
 * PaymentConcept.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class PaymentConcept  implements java.io.Serializable {
    private java.lang.String conceptCode;

    private java.lang.String account;

    private java.lang.String phone;

    private java.lang.String customerName;

    private java.lang.String barCode;

    private com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] otherReferences;

    public PaymentConcept() {
    }

    public PaymentConcept(
           java.lang.String conceptCode,
           java.lang.String account,
           java.lang.String phone,
           java.lang.String customerName,
           java.lang.String barCode,
           com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] otherReferences) {
           this.conceptCode = conceptCode;
           this.account = account;
           this.phone = phone;
           this.customerName = customerName;
           this.barCode = barCode;
           this.otherReferences = otherReferences;
    }


    /**
     * Gets the conceptCode value for this PaymentConcept.
     * 
     * @return conceptCode
     */
    public java.lang.String getConceptCode() {
        return conceptCode;
    }


    /**
     * Sets the conceptCode value for this PaymentConcept.
     * 
     * @param conceptCode
     */
    public void setConceptCode(java.lang.String conceptCode) {
        this.conceptCode = conceptCode;
    }


    /**
     * Gets the account value for this PaymentConcept.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this PaymentConcept.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }


    /**
     * Gets the phone value for this PaymentConcept.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PaymentConcept.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the customerName value for this PaymentConcept.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this PaymentConcept.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the barCode value for this PaymentConcept.
     * 
     * @return barCode
     */
    public java.lang.String getBarCode() {
        return barCode;
    }


    /**
     * Sets the barCode value for this PaymentConcept.
     * 
     * @param barCode
     */
    public void setBarCode(java.lang.String barCode) {
        this.barCode = barCode;
    }


    /**
     * Gets the otherReferences value for this PaymentConcept.
     * 
     * @return otherReferences
     */
    public com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] getOtherReferences() {
        return otherReferences;
    }


    /**
     * Sets the otherReferences value for this PaymentConcept.
     * 
     * @param otherReferences
     */
    public void setOtherReferences(com.epagoinc.clientswitchtransactionservicev2.CapturedReference[] otherReferences) {
        this.otherReferences = otherReferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentConcept)) return false;
        PaymentConcept other = (PaymentConcept) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conceptCode==null && other.getConceptCode()==null) || 
             (this.conceptCode!=null &&
              this.conceptCode.equals(other.getConceptCode()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.barCode==null && other.getBarCode()==null) || 
             (this.barCode!=null &&
              this.barCode.equals(other.getBarCode()))) &&
            ((this.otherReferences==null && other.getOtherReferences()==null) || 
             (this.otherReferences!=null &&
              java.util.Arrays.equals(this.otherReferences, other.getOtherReferences())));
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
        if (getConceptCode() != null) {
            _hashCode += getConceptCode().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getBarCode() != null) {
            _hashCode += getBarCode().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentConcept.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentConcept"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "conceptCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "barCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "otherReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "CapturedReference"));
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
