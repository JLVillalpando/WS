/**
 * AuthorizationHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientcatalogqueryservice;

public class AuthorizationHeader  implements java.io.Serializable {
    private java.lang.String clientSwitchUser;

    private java.lang.String clientSwitchPassword;

    private java.lang.String clientSwitchChannel;

    private java.lang.String terminalId;

    private java.lang.String terminalDescription;

    private java.lang.String cashierName;

    public AuthorizationHeader() {
    }

    public AuthorizationHeader(
           java.lang.String clientSwitchUser,
           java.lang.String clientSwitchPassword,
           java.lang.String clientSwitchChannel,
           java.lang.String terminalId,
           java.lang.String terminalDescription,
           java.lang.String cashierName) {
           this.clientSwitchUser = clientSwitchUser;
           this.clientSwitchPassword = clientSwitchPassword;
           this.clientSwitchChannel = clientSwitchChannel;
           this.terminalId = terminalId;
           this.terminalDescription = terminalDescription;
           this.cashierName = cashierName;
    }


    /**
     * Gets the clientSwitchUser value for this AuthorizationHeader.
     * 
     * @return clientSwitchUser
     */
    public java.lang.String getClientSwitchUser() {
        return clientSwitchUser;
    }


    /**
     * Sets the clientSwitchUser value for this AuthorizationHeader.
     * 
     * @param clientSwitchUser
     */
    public void setClientSwitchUser(java.lang.String clientSwitchUser) {
        this.clientSwitchUser = clientSwitchUser;
    }


    /**
     * Gets the clientSwitchPassword value for this AuthorizationHeader.
     * 
     * @return clientSwitchPassword
     */
    public java.lang.String getClientSwitchPassword() {
        return clientSwitchPassword;
    }


    /**
     * Sets the clientSwitchPassword value for this AuthorizationHeader.
     * 
     * @param clientSwitchPassword
     */
    public void setClientSwitchPassword(java.lang.String clientSwitchPassword) {
        this.clientSwitchPassword = clientSwitchPassword;
    }


    /**
     * Gets the clientSwitchChannel value for this AuthorizationHeader.
     * 
     * @return clientSwitchChannel
     */
    public java.lang.String getClientSwitchChannel() {
        return clientSwitchChannel;
    }


    /**
     * Sets the clientSwitchChannel value for this AuthorizationHeader.
     * 
     * @param clientSwitchChannel
     */
    public void setClientSwitchChannel(java.lang.String clientSwitchChannel) {
        this.clientSwitchChannel = clientSwitchChannel;
    }


    /**
     * Gets the terminalId value for this AuthorizationHeader.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this AuthorizationHeader.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the terminalDescription value for this AuthorizationHeader.
     * 
     * @return terminalDescription
     */
    public java.lang.String getTerminalDescription() {
        return terminalDescription;
    }


    /**
     * Sets the terminalDescription value for this AuthorizationHeader.
     * 
     * @param terminalDescription
     */
    public void setTerminalDescription(java.lang.String terminalDescription) {
        this.terminalDescription = terminalDescription;
    }


    /**
     * Gets the cashierName value for this AuthorizationHeader.
     * 
     * @return cashierName
     */
    public java.lang.String getCashierName() {
        return cashierName;
    }


    /**
     * Sets the cashierName value for this AuthorizationHeader.
     * 
     * @param cashierName
     */
    public void setCashierName(java.lang.String cashierName) {
        this.cashierName = cashierName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizationHeader)) return false;
        AuthorizationHeader other = (AuthorizationHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSwitchUser==null && other.getClientSwitchUser()==null) || 
             (this.clientSwitchUser!=null &&
              this.clientSwitchUser.equals(other.getClientSwitchUser()))) &&
            ((this.clientSwitchPassword==null && other.getClientSwitchPassword()==null) || 
             (this.clientSwitchPassword!=null &&
              this.clientSwitchPassword.equals(other.getClientSwitchPassword()))) &&
            ((this.clientSwitchChannel==null && other.getClientSwitchChannel()==null) || 
             (this.clientSwitchChannel!=null &&
              this.clientSwitchChannel.equals(other.getClientSwitchChannel()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.terminalDescription==null && other.getTerminalDescription()==null) || 
             (this.terminalDescription!=null &&
              this.terminalDescription.equals(other.getTerminalDescription()))) &&
            ((this.cashierName==null && other.getCashierName()==null) || 
             (this.cashierName!=null &&
              this.cashierName.equals(other.getCashierName())));
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
        if (getClientSwitchUser() != null) {
            _hashCode += getClientSwitchUser().hashCode();
        }
        if (getClientSwitchPassword() != null) {
            _hashCode += getClientSwitchPassword().hashCode();
        }
        if (getClientSwitchChannel() != null) {
            _hashCode += getClientSwitchChannel().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getTerminalDescription() != null) {
            _hashCode += getTerminalDescription().hashCode();
        }
        if (getCashierName() != null) {
            _hashCode += getCashierName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizationHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "AuthorizationHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "ClientSwitchUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "ClientSwitchPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSwitchChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "ClientSwitchChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "TerminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "TerminalDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashierName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "CashierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
