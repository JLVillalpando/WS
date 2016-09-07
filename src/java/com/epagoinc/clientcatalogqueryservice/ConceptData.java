/**
 * ConceptData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientcatalogqueryservice;

public class ConceptData  implements java.io.Serializable {
    private java.lang.String conceptCategory;  // attribute

    private java.lang.String conceptName;  // attribute

    private java.lang.String conceptShortName;  // attribute

    private java.lang.String conceptCode;  // attribute

    private boolean readOnlyAmount;  // attribute

    private boolean hasQuery;  // attribute

    private boolean hasBarCode;  // attribute

    private java.lang.String providerMessage;  // attribute

    private java.math.BigDecimal defaultAmount;  // attribute

    private boolean requireQuantity;  // attribute

    public ConceptData() {
    }

    public ConceptData(
           java.lang.String conceptCategory,
           java.lang.String conceptName,
           java.lang.String conceptShortName,
           java.lang.String conceptCode,
           boolean readOnlyAmount,
           boolean hasQuery,
           boolean hasBarCode,
           java.lang.String providerMessage,
           java.math.BigDecimal defaultAmount,
           boolean requireQuantity) {
           this.conceptCategory = conceptCategory;
           this.conceptName = conceptName;
           this.conceptShortName = conceptShortName;
           this.conceptCode = conceptCode;
           this.readOnlyAmount = readOnlyAmount;
           this.hasQuery = hasQuery;
           this.hasBarCode = hasBarCode;
           this.providerMessage = providerMessage;
           this.defaultAmount = defaultAmount;
           this.requireQuantity = requireQuantity;
    }


    /**
     * Gets the conceptCategory value for this ConceptData.
     * 
     * @return conceptCategory
     */
    public java.lang.String getConceptCategory() {
        return conceptCategory;
    }


    /**
     * Sets the conceptCategory value for this ConceptData.
     * 
     * @param conceptCategory
     */
    public void setConceptCategory(java.lang.String conceptCategory) {
        this.conceptCategory = conceptCategory;
    }


    /**
     * Gets the conceptName value for this ConceptData.
     * 
     * @return conceptName
     */
    public java.lang.String getConceptName() {
        return conceptName;
    }


    /**
     * Sets the conceptName value for this ConceptData.
     * 
     * @param conceptName
     */
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }


    /**
     * Gets the conceptShortName value for this ConceptData.
     * 
     * @return conceptShortName
     */
    public java.lang.String getConceptShortName() {
        return conceptShortName;
    }


    /**
     * Sets the conceptShortName value for this ConceptData.
     * 
     * @param conceptShortName
     */
    public void setConceptShortName(java.lang.String conceptShortName) {
        this.conceptShortName = conceptShortName;
    }


    /**
     * Gets the conceptCode value for this ConceptData.
     * 
     * @return conceptCode
     */
    public java.lang.String getConceptCode() {
        return conceptCode;
    }


    /**
     * Sets the conceptCode value for this ConceptData.
     * 
     * @param conceptCode
     */
    public void setConceptCode(java.lang.String conceptCode) {
        this.conceptCode = conceptCode;
    }


    /**
     * Gets the readOnlyAmount value for this ConceptData.
     * 
     * @return readOnlyAmount
     */
    public boolean isReadOnlyAmount() {
        return readOnlyAmount;
    }


    /**
     * Sets the readOnlyAmount value for this ConceptData.
     * 
     * @param readOnlyAmount
     */
    public void setReadOnlyAmount(boolean readOnlyAmount) {
        this.readOnlyAmount = readOnlyAmount;
    }


    /**
     * Gets the hasQuery value for this ConceptData.
     * 
     * @return hasQuery
     */
    public Boolean isHasQuery() {
        return hasQuery;
    }


    /**
     * Sets the hasQuery value for this ConceptData.
     * 
     * @param hasQuery
     */
    public void setHasQuery(boolean hasQuery) {
        this.hasQuery = hasQuery;
    }


    /**
     * Gets the hasBarCode value for this ConceptData.
     * 
     * @return hasBarCode
     */
    public boolean isHasBarCode() {
        return hasBarCode;
    }


    /**
     * Sets the hasBarCode value for this ConceptData.
     * 
     * @param hasBarCode
     */
    public void setHasBarCode(boolean hasBarCode) {
        this.hasBarCode = hasBarCode;
    }


    /**
     * Gets the providerMessage value for this ConceptData.
     * 
     * @return providerMessage
     */
    public java.lang.String getProviderMessage() {
        return providerMessage;
    }


    /**
     * Sets the providerMessage value for this ConceptData.
     * 
     * @param providerMessage
     */
    public void setProviderMessage(java.lang.String providerMessage) {
        this.providerMessage = providerMessage;
    }


    /**
     * Gets the defaultAmount value for this ConceptData.
     * 
     * @return defaultAmount
     */
    public java.math.BigDecimal getDefaultAmount() {
        return defaultAmount;
    }


    /**
     * Sets the defaultAmount value for this ConceptData.
     * 
     * @param defaultAmount
     */
    public void setDefaultAmount(java.math.BigDecimal defaultAmount) {
        this.defaultAmount = defaultAmount;
    }


    /**
     * Gets the requireQuantity value for this ConceptData.
     * 
     * @return requireQuantity
     */
    public boolean isRequireQuantity() {
        return requireQuantity;
    }


    /**
     * Sets the requireQuantity value for this ConceptData.
     * 
     * @param requireQuantity
     */
    public void setRequireQuantity(boolean requireQuantity) {
        this.requireQuantity = requireQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConceptData)) return false;
        ConceptData other = (ConceptData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conceptCategory==null && other.getConceptCategory()==null) || 
             (this.conceptCategory!=null &&
              this.conceptCategory.equals(other.getConceptCategory()))) &&
            ((this.conceptName==null && other.getConceptName()==null) || 
             (this.conceptName!=null &&
              this.conceptName.equals(other.getConceptName()))) &&
            ((this.conceptShortName==null && other.getConceptShortName()==null) || 
             (this.conceptShortName!=null &&
              this.conceptShortName.equals(other.getConceptShortName()))) &&
            ((this.conceptCode==null && other.getConceptCode()==null) || 
             (this.conceptCode!=null &&
              this.conceptCode.equals(other.getConceptCode()))) &&
            this.readOnlyAmount == other.isReadOnlyAmount() &&
            this.hasQuery == other.isHasQuery() &&
            this.hasBarCode == other.isHasBarCode() &&
            ((this.providerMessage==null && other.getProviderMessage()==null) || 
             (this.providerMessage!=null &&
              this.providerMessage.equals(other.getProviderMessage()))) &&
            ((this.defaultAmount==null && other.getDefaultAmount()==null) || 
             (this.defaultAmount!=null &&
              this.defaultAmount.equals(other.getDefaultAmount()))) &&
            this.requireQuantity == other.isRequireQuantity();
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
        if (getConceptCategory() != null) {
            _hashCode += getConceptCategory().hashCode();
        }
        if (getConceptName() != null) {
            _hashCode += getConceptName().hashCode();
        }
        if (getConceptShortName() != null) {
            _hashCode += getConceptShortName().hashCode();
        }
        if (getConceptCode() != null) {
            _hashCode += getConceptCode().hashCode();
        }
        _hashCode += (isReadOnlyAmount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasQuery() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasBarCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProviderMessage() != null) {
            _hashCode += getProviderMessage().hashCode();
        }
        if (getDefaultAmount() != null) {
            _hashCode += getDefaultAmount().hashCode();
        }
        _hashCode += (isRequireQuantity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConceptData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ConceptData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conceptCategory");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conceptCategory"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conceptName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conceptName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conceptShortName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conceptShortName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conceptCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "conceptCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("readOnlyAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "readOnlyAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hasQuery");
        attrField.setXmlName(new javax.xml.namespace.QName("", "hasQuery"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hasBarCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "hasBarCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("providerMessage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "providerMessage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("defaultAmount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "defaultAmount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("requireQuantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "requireQuantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
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
