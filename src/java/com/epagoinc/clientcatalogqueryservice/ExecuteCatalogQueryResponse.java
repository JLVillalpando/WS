/**
 * ExecuteCatalogQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientcatalogqueryservice;

public class ExecuteCatalogQueryResponse  implements java.io.Serializable {
    private int statusCode;

    private java.lang.String statusMessage;

    private com.epagoinc.clientcatalogqueryservice.ConceptData[] concepts;

    private com.epagoinc.clientcatalogqueryservice.AgentCategory[] agentCategories;

    private com.epagoinc.clientcatalogqueryservice.Agent[] agents;

    private com.epagoinc.clientcatalogqueryservice.AgentBranch[] agentBranches;

    private com.epagoinc.clientcatalogqueryservice.Bank[] banks;

    private com.epagoinc.clientcatalogqueryservice.BankAccount[] bankAccounts;

    public ExecuteCatalogQueryResponse() {
    }

    public ExecuteCatalogQueryResponse(
           int statusCode,
           java.lang.String statusMessage,
           com.epagoinc.clientcatalogqueryservice.ConceptData[] concepts,
           com.epagoinc.clientcatalogqueryservice.AgentCategory[] agentCategories,
           com.epagoinc.clientcatalogqueryservice.Agent[] agents,
           com.epagoinc.clientcatalogqueryservice.AgentBranch[] agentBranches,
           com.epagoinc.clientcatalogqueryservice.Bank[] banks,
           com.epagoinc.clientcatalogqueryservice.BankAccount[] bankAccounts) {
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
           this.concepts = concepts;
           this.agentCategories = agentCategories;
           this.agents = agents;
           this.agentBranches = agentBranches;
           this.banks = banks;
           this.bankAccounts = bankAccounts;
    }


    /**
     * Gets the statusCode value for this ExecuteCatalogQueryResponse.
     * 
     * @return statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ExecuteCatalogQueryResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this ExecuteCatalogQueryResponse.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this ExecuteCatalogQueryResponse.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the concepts value for this ExecuteCatalogQueryResponse.
     * 
     * @return concepts
     */
    public com.epagoinc.clientcatalogqueryservice.ConceptData[] getConcepts() {
        return concepts;
    }


    /**
     * Sets the concepts value for this ExecuteCatalogQueryResponse.
     * 
     * @param concepts
     */
    public void setConcepts(com.epagoinc.clientcatalogqueryservice.ConceptData[] concepts) {
        this.concepts = concepts;
    }


    /**
     * Gets the agentCategories value for this ExecuteCatalogQueryResponse.
     * 
     * @return agentCategories
     */
    public com.epagoinc.clientcatalogqueryservice.AgentCategory[] getAgentCategories() {
        return agentCategories;
    }


    /**
     * Sets the agentCategories value for this ExecuteCatalogQueryResponse.
     * 
     * @param agentCategories
     */
    public void setAgentCategories(com.epagoinc.clientcatalogqueryservice.AgentCategory[] agentCategories) {
        this.agentCategories = agentCategories;
    }


    /**
     * Gets the agents value for this ExecuteCatalogQueryResponse.
     * 
     * @return agents
     */
    public com.epagoinc.clientcatalogqueryservice.Agent[] getAgents() {
        return agents;
    }


    /**
     * Sets the agents value for this ExecuteCatalogQueryResponse.
     * 
     * @param agents
     */
    public void setAgents(com.epagoinc.clientcatalogqueryservice.Agent[] agents) {
        this.agents = agents;
    }


    /**
     * Gets the agentBranches value for this ExecuteCatalogQueryResponse.
     * 
     * @return agentBranches
     */
    public com.epagoinc.clientcatalogqueryservice.AgentBranch[] getAgentBranches() {
        return agentBranches;
    }


    /**
     * Sets the agentBranches value for this ExecuteCatalogQueryResponse.
     * 
     * @param agentBranches
     */
    public void setAgentBranches(com.epagoinc.clientcatalogqueryservice.AgentBranch[] agentBranches) {
        this.agentBranches = agentBranches;
    }


    /**
     * Gets the banks value for this ExecuteCatalogQueryResponse.
     * 
     * @return banks
     */
    public com.epagoinc.clientcatalogqueryservice.Bank[] getBanks() {
        return banks;
    }


    /**
     * Sets the banks value for this ExecuteCatalogQueryResponse.
     * 
     * @param banks
     */
    public void setBanks(com.epagoinc.clientcatalogqueryservice.Bank[] banks) {
        this.banks = banks;
    }


    /**
     * Gets the bankAccounts value for this ExecuteCatalogQueryResponse.
     * 
     * @return bankAccounts
     */
    public com.epagoinc.clientcatalogqueryservice.BankAccount[] getBankAccounts() {
        return bankAccounts;
    }


    /**
     * Sets the bankAccounts value for this ExecuteCatalogQueryResponse.
     * 
     * @param bankAccounts
     */
    public void setBankAccounts(com.epagoinc.clientcatalogqueryservice.BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCatalogQueryResponse)) return false;
        ExecuteCatalogQueryResponse other = (ExecuteCatalogQueryResponse) obj;
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
            ((this.concepts==null && other.getConcepts()==null) || 
             (this.concepts!=null &&
              java.util.Arrays.equals(this.concepts, other.getConcepts()))) &&
            ((this.agentCategories==null && other.getAgentCategories()==null) || 
             (this.agentCategories!=null &&
              java.util.Arrays.equals(this.agentCategories, other.getAgentCategories()))) &&
            ((this.agents==null && other.getAgents()==null) || 
             (this.agents!=null &&
              java.util.Arrays.equals(this.agents, other.getAgents()))) &&
            ((this.agentBranches==null && other.getAgentBranches()==null) || 
             (this.agentBranches!=null &&
              java.util.Arrays.equals(this.agentBranches, other.getAgentBranches()))) &&
            ((this.banks==null && other.getBanks()==null) || 
             (this.banks!=null &&
              java.util.Arrays.equals(this.banks, other.getBanks()))) &&
            ((this.bankAccounts==null && other.getBankAccounts()==null) || 
             (this.bankAccounts!=null &&
              java.util.Arrays.equals(this.bankAccounts, other.getBankAccounts())));
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
        if (getConcepts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConcepts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConcepts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgentCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgentCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgentCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgentBranches() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgentBranches());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgentBranches(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBanks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBanks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBanks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBankAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(ExecuteCatalogQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">executeCatalogQueryResponse"));
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
        elemField.setFieldName("concepts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "concepts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ConceptData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "concept"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "category"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Agent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentBranches");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentBranches"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentBranch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentBranch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "banks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Bank"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bank"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BankAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "bankAccount"));
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
