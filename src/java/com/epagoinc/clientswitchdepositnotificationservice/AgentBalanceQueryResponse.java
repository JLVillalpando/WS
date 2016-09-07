/**
 * AgentBalanceQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


package com.epagoinc.clientswitchdepositnotificationservice;

public class AgentBalanceQueryResponse  implements java.io.Serializable {
    private int statusCode;

    private java.lang.String statusMessage;

    private java.math.BigDecimal currentBalance;

    private java.math.BigDecimal minPayment;

    private java.math.BigDecimal dueBalance;

    private java.math.BigDecimal pendingDepositsAmount;

    public AgentBalanceQueryResponse() {
    }

    public AgentBalanceQueryResponse(
           int statusCode,
           java.lang.String statusMessage,
           java.math.BigDecimal currentBalance,
           java.math.BigDecimal minPayment,
           java.math.BigDecimal dueBalance,
           java.math.BigDecimal pendingDepositsAmount) {
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.currentBalance = currentBalance;
           this.minPayment = minPayment;
           this.dueBalance = dueBalance;
           this.pendingDepositsAmount = pendingDepositsAmount;
    }


    /**
     * Gets the statusCode value for this AgentBalanceQueryResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AgentBalanceQueryResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this AgentBalanceQueryResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this AgentBalanceQueryResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the currentBalance value for this AgentBalanceQueryResponse.
     * 
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this AgentBalanceQueryResponse.
     * 
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the minPayment value for this AgentBalanceQueryResponse.
     * 
     * @return minPayment
     */
    public java.math.BigDecimal getMinPayment() {
        return minPayment;
    }


    /**
     * Sets the minPayment value for this AgentBalanceQueryResponse.
     * 
     * @param minPayment
     */
    public void setMinPayment(java.math.BigDecimal minPayment) {
        this.minPayment = minPayment;
    }


    /**
     * Gets the dueBalance value for this AgentBalanceQueryResponse.
     * 
     * @return dueBalance
     */
    public java.math.BigDecimal getDueBalance() {
        return dueBalance;
    }


    /**
     * Sets the dueBalance value for this AgentBalanceQueryResponse.
     * 
     * @param dueBalance
     */
    public void setDueBalance(java.math.BigDecimal dueBalance) {
        this.dueBalance = dueBalance;
    }


    /**
     * Gets the pendingDepositsAmount value for this AgentBalanceQueryResponse.
     * 
     * @return pendingDepositsAmount
     */
    public java.math.BigDecimal getPendingDepositsAmount() {
        return pendingDepositsAmount;
    }


    /**
     * Sets the pendingDepositsAmount value for this AgentBalanceQueryResponse.
     * 
     * @param pendingDepositsAmount
     */
    public void setPendingDepositsAmount(java.math.BigDecimal pendingDepositsAmount) {
        this.pendingDepositsAmount = pendingDepositsAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgentBalanceQueryResponse)) return false;
        AgentBalanceQueryResponse other = (AgentBalanceQueryResponse) obj;
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
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.minPayment==null && other.getMinPayment()==null) || 
             (this.minPayment!=null &&
              this.minPayment.equals(other.getMinPayment()))) &&
            ((this.dueBalance==null && other.getDueBalance()==null) || 
             (this.dueBalance!=null &&
              this.dueBalance.equals(other.getDueBalance()))) &&
            ((this.pendingDepositsAmount==null && other.getPendingDepositsAmount()==null) || 
             (this.pendingDepositsAmount!=null &&
              this.pendingDepositsAmount.equals(other.getPendingDepositsAmount())));
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
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getMinPayment() != null) {
            _hashCode += getMinPayment().hashCode();
        }
        if (getDueBalance() != null) {
            _hashCode += getDueBalance().hashCode();
        }
        if (getPendingDepositsAmount() != null) {
            _hashCode += getPendingDepositsAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgentBalanceQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentBalanceQueryResponse"));
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
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "minPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "dueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingDepositsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "pendingDepositsAmount"));
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
