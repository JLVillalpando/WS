/**
 * PaymentMethodCreditCardType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class PaymentMethodCreditCardType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentMethodCreditCardType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Visa = "Visa";
    public static final java.lang.String _MasterCard = "MasterCard";
    public static final java.lang.String _DinersClub = "DinersClub";
    public static final java.lang.String _Discover = "Discover";
    public static final java.lang.String _AmericanExpress = "AmericanExpress";
    public static final java.lang.String _JCB = "JCB";
    public static final PaymentMethodCreditCardType Visa = new PaymentMethodCreditCardType(_Visa);
    public static final PaymentMethodCreditCardType MasterCard = new PaymentMethodCreditCardType(_MasterCard);
    public static final PaymentMethodCreditCardType DinersClub = new PaymentMethodCreditCardType(_DinersClub);
    public static final PaymentMethodCreditCardType Discover = new PaymentMethodCreditCardType(_Discover);
    public static final PaymentMethodCreditCardType AmericanExpress = new PaymentMethodCreditCardType(_AmericanExpress);
    public static final PaymentMethodCreditCardType JCB = new PaymentMethodCreditCardType(_JCB);
    public java.lang.String getValue() { return _value_;}
    public static PaymentMethodCreditCardType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentMethodCreditCardType enumeration = (PaymentMethodCreditCardType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentMethodCreditCardType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentMethodCreditCardType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">PaymentMethod>creditCardType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
