/**
 * ApplyTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class ApplyTransactionResponse  implements java.io.Serializable {
    private java.lang.String clientSwitchTransactionId;

    private java.lang.String ePagoTransactionId;

    private java.util.Calendar ePagoTransactionDate;

    private java.math.BigDecimal commissionAmount;

    private int statusCode;

    private java.lang.String statusMessage;

    private com.epagoinc.clientswitchtransactionservicev2.PrintReference[] printReferences;
    private java.lang.String account;

    public ApplyTransactionResponse() {
    }

    public ApplyTransactionResponse(
           java.lang.String clientSwitchTransactionId,
           java.lang.String ePagoTransactionId,
           java.util.Calendar ePagoTransactionDate,
           java.math.BigDecimal commissionAmount,
           int statusCode,
           java.lang.String statusMessage,
           com.epagoinc.clientswitchtransactionservicev2.PrintReference[] printReferences,
           java.lang.String account) {
           this.clientSwitchTransactionId = clientSwitchTransactionId;
           this.ePagoTransactionId = ePagoTransactionId;
           this.ePagoTransactionDate = ePagoTransactionDate;
           this.commissionAmount = commissionAmount;
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.printReferences = printReferences;
           this.account = account;
    }


    /**
     * Gets the clientSwitchTransactionId value for this ApplyTransactionResponse.
     * 
     * @return clientSwitchTransactionId
     */
    public java.lang.String getClientSwitchTransactionId() {
        return clientSwitchTransactionId;
    }


    /**
     * Sets the clientSwitchTransactionId value for this ApplyTransactionResponse.
     * 
     * @param clientSwitchTransactionId
     */
    public void setClientSwitchTransactionId(java.lang.String clientSwitchTransactionId) {
        this.clientSwitchTransactionId = clientSwitchTransactionId;
    }


    /**
     * Gets the ePagoTransactionId value for this ApplyTransactionResponse.
     * 
     * @return ePagoTransactionId
     */
    public java.lang.String getEPagoTransactionId() {
        return ePagoTransactionId;
    }


    /**
     * Sets the ePagoTransactionId value for this ApplyTransactionResponse.
     * 
     * @param ePagoTransactionId
     */
    public void setEPagoTransactionId(java.lang.String ePagoTransactionId) {
        this.ePagoTransactionId = ePagoTransactionId;
    }


    /**
     * Gets the ePagoTransactionDate value for this ApplyTransactionResponse.
     * 
     * @return ePagoTransactionDate
     */
    public java.util.Calendar getEPagoTransactionDate() {
        return ePagoTransactionDate;
    }


    /**
     * Sets the ePagoTransactionDate value for this ApplyTransactionResponse.
     * 
     * @param ePagoTransactionDate
     */
    public void setEPagoTransactionDate(java.util.Calendar ePagoTransactionDate) {
        this.ePagoTransactionDate = ePagoTransactionDate;
    }


    /**
     * Gets the commissionAmount value for this ApplyTransactionResponse.
     * 
     * @return commissionAmount
     */
    public java.math.BigDecimal getCommissionAmount() {
        return commissionAmount;
    }


    /**
     * Sets the commissionAmount value for this ApplyTransactionResponse.
     * 
     * @param commissionAmount
     */
    public void setCommissionAmount(java.math.BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }


    /**
     * Gets the statusCode value for this ApplyTransactionResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ApplyTransactionResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this ApplyTransactionResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this ApplyTransactionResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the printReferences value for this ApplyTransactionResponse.
     * 
     * @return printReferences
     */
    public com.epagoinc.clientswitchtransactionservicev2.PrintReference[] getPrintReferences() {
        return printReferences;
    }


    /**
     * Sets the printReferences value for this ApplyTransactionResponse.
     * 
     * @param printReferences
     */
    public void setPrintReferences(com.epagoinc.clientswitchtransactionservicev2.PrintReference[] printReferences) {
        this.printReferences = printReferences;
    }


    /**
     * Gets the account value for this ApplyTransactionResponse.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ApplyTransactionResponse.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApplyTransactionResponse)) return false;
        ApplyTransactionResponse other = (ApplyTransactionResponse) obj;
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
            ((this.ePagoTransactionId==null && other.getEPagoTransactionId()==null) || 
             (this.ePagoTransactionId!=null &&
              this.ePagoTransactionId.equals(other.getEPagoTransactionId()))) &&
            ((this.ePagoTransactionDate==null && other.getEPagoTransactionDate()==null) || 
             (this.ePagoTransactionDate!=null &&
              this.ePagoTransactionDate.equals(other.getEPagoTransactionDate()))) &&
            ((this.commissionAmount==null && other.getCommissionAmount()==null) || 
             (this.commissionAmount!=null &&
              this.commissionAmount.equals(other.getCommissionAmount()))) &&
            this.statusCode == other.getStatusCode() &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.printReferences==null && other.getPrintReferences()==null) || 
             (this.printReferences!=null &&
              java.util.Arrays.equals(this.printReferences, other.getPrintReferences()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount())));
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
        if (getEPagoTransactionId() != null) {
            _hashCode += getEPagoTransactionId().hashCode();
        }
        if (getEPagoTransactionDate() != null) {
            _hashCode += getEPagoTransactionDate().hashCode();
        }
        if (getCommissionAmount() != null) {
            _hashCode += getCommissionAmount().hashCode();
        }
        _hashCode += getStatusCode();
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getPrintReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApplyTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("EPagoTransactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ePagoTransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "commissionAmount"));
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
        elemField.setFieldName("printReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "printReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PrintReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "account"));
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
