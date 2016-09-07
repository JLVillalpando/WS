/**
 * PaymentMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class PaymentMethod  implements java.io.Serializable {
    private com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType paymentType;

    private com.epagoinc.clientswitchtransactionservicev2.PaymentMethodCreditCardType creditCardType;

    public PaymentMethod() {
    }

    public PaymentMethod(
           com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType paymentType,
           com.epagoinc.clientswitchtransactionservicev2.PaymentMethodCreditCardType creditCardType) {
           this.paymentType = paymentType;
           this.creditCardType = creditCardType;
    }


    /**
     * Gets the paymentType value for this PaymentMethod.
     * 
     * @return paymentType
     */
    public com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this PaymentMethod.
     * 
     * @param paymentType
     */
    public void setPaymentType(com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the creditCardType value for this PaymentMethod.
     * 
     * @return creditCardType
     */
    public com.epagoinc.clientswitchtransactionservicev2.PaymentMethodCreditCardType getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this PaymentMethod.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(com.epagoinc.clientswitchtransactionservicev2.PaymentMethodCreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentMethod)) return false;
        PaymentMethod other = (PaymentMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType())));
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
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">PaymentMethod>paymentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "creditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">PaymentMethod>creditCardType"));
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
