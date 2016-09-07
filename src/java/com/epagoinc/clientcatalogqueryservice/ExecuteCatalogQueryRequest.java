/**
 * ExecuteCatalogQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientcatalogqueryservice;

public class ExecuteCatalogQueryRequest  implements java.io.Serializable {
    private java.lang.Object catalogQueryRequest;

    public ExecuteCatalogQueryRequest() {
    }

    public ExecuteCatalogQueryRequest(
           java.lang.Object catalogQueryRequest) {
           this.catalogQueryRequest = catalogQueryRequest;
    }


    /**
     * Gets the catalogQueryRequest value for this ExecuteCatalogQueryRequest.
     * 
     * @return catalogQueryRequest
     */
    public java.lang.Object getCatalogQueryRequest() {
        return catalogQueryRequest;
    }


    /**
     * Sets the catalogQueryRequest value for this ExecuteCatalogQueryRequest.
     * 
     * @param catalogQueryRequest
     */
    public void setCatalogQueryRequest(java.lang.Object catalogQueryRequest) {
        this.catalogQueryRequest = catalogQueryRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCatalogQueryRequest)) return false;
        ExecuteCatalogQueryRequest other = (ExecuteCatalogQueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catalogQueryRequest==null && other.getCatalogQueryRequest()==null) || 
             (this.catalogQueryRequest!=null &&
              this.catalogQueryRequest.equals(other.getCatalogQueryRequest())));
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
        if (getCatalogQueryRequest() != null) {
            _hashCode += getCatalogQueryRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteCatalogQueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">executeCatalogQueryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catalogQueryRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "catalogQueryRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
