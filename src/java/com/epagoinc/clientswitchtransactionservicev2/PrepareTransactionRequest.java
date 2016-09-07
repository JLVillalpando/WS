/**
 * PrepareTransactionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class PrepareTransactionRequest  implements java.io.Serializable {
    private java.lang.String clientSwitchTransactionId;

    private com.epagoinc.clientswitchtransactionservicev2.PaymentConcept concept;

    private java.math.BigDecimal subTotalAmount;

    public PrepareTransactionRequest() {
    }

    public PrepareTransactionRequest(
           java.lang.String clientSwitchTransactionId,
           com.epagoinc.clientswitchtransactionservicev2.PaymentConcept concept,
           java.math.BigDecimal subTotalAmount) {
           this.clientSwitchTransactionId = clientSwitchTransactionId;
           this.concept = concept;
           this.subTotalAmount = subTotalAmount;
    }


    /**
     * Gets the clientSwitchTransactionId value for this PrepareTransactionRequest.
     * 
     * @return clientSwitchTransactionId
     */
    public java.lang.String getClientSwitchTransactionId() {
        return clientSwitchTransactionId;
    }


    /**
     * Sets the clientSwitchTransactionId value for this PrepareTransactionRequest.
     * 
     * @param clientSwitchTransactionId
     */
    public void setClientSwitchTransactionId(java.lang.String clientSwitchTransactionId) {
        this.clientSwitchTransactionId = clientSwitchTransactionId;
    }


    /**
     * Gets the concept value for this PrepareTransactionRequest.
     * 
     * @return concept
     */
    public com.epagoinc.clientswitchtransactionservicev2.PaymentConcept getConcept() {
        return concept;
    }


    /**
     * Sets the concept value for this PrepareTransactionRequest.
     * 
     * @param concept
     */
    public void setConcept(com.epagoinc.clientswitchtransactionservicev2.PaymentConcept concept) {
        this.concept = concept;
    }


    /**
     * Gets the subTotalAmount value for this PrepareTransactionRequest.
     * 
     * @return subTotalAmount
     */
    public java.math.BigDecimal getSubTotalAmount() {
        return subTotalAmount;
    }


    /**
     * Sets the subTotalAmount value for this PrepareTransactionRequest.
     * 
     * @param subTotalAmount
     */
    public void setSubTotalAmount(java.math.BigDecimal subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepareTransactionRequest)) return false;
        PrepareTransactionRequest other = (PrepareTransactionRequest) obj;
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
            ((this.concept==null && other.getConcept()==null) || 
             (this.concept!=null &&
              this.concept.equals(other.getConcept()))) &&
            ((this.subTotalAmount==null && other.getSubTotalAmount()==null) || 
             (this.subTotalAmount!=null &&
              this.subTotalAmount.equals(other.getSubTotalAmount())));
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
        if (getConcept() != null) {
            _hashCode += getConcept().hashCode();
        }
        if (getSubTotalAmount() != null) {
            _hashCode += getSubTotalAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepareTransactionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "clientSwitchTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concept");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "concept"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentConcept"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "subTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
