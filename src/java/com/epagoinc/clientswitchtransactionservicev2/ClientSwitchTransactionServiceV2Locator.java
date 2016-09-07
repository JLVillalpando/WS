/**
 * ClientSwitchTransactionServiceV2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

import com.epagoinc.client.Globals;

public class ClientSwitchTransactionServiceV2Locator extends org.apache.axis.client.Service implements com.epagoinc.clientswitchtransactionservicev2.ClientSwitchTransactionServiceV2 {

    public ClientSwitchTransactionServiceV2Locator() {
    }


    public ClientSwitchTransactionServiceV2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientSwitchTransactionServiceV2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IClientSwitchTransactionServiceV2
    private java.lang.String BasicHttpBinding_IClientSwitchTransactionServiceV2_address = Globals.ClientSwitchTransactionServiceAddress;

    public java.lang.String getBasicHttpBinding_IClientSwitchTransactionServiceV2Address() {
        return BasicHttpBinding_IClientSwitchTransactionServiceV2_address;
    }

// OJO EIVAR 3
    public void setBasicHttpBinding_IClientSwitchTransactionServiceV2Address(String newEndPoint)
    {
        BasicHttpBinding_IClientSwitchTransactionServiceV2_address = newEndPoint;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName = "BasicHttpBinding_IClientSwitchTransactionServiceV2";

    public java.lang.String getBasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName() {
        return BasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName;
    }

    public void setBasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName = name;
    }

    public com.epagoinc.clientswitchtransactionservicev2.IClientSwitchTransactionServiceV2 getBasicHttpBinding_IClientSwitchTransactionServiceV2() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IClientSwitchTransactionServiceV2_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IClientSwitchTransactionServiceV2(endpoint);
    }

    public com.epagoinc.clientswitchtransactionservicev2.IClientSwitchTransactionServiceV2 getBasicHttpBinding_IClientSwitchTransactionServiceV2(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.epagoinc.clientswitchtransactionservicev2.BasicHttpBinding_IClientSwitchTransactionServiceV2Stub _stub = new com.epagoinc.clientswitchtransactionservicev2.BasicHttpBinding_IClientSwitchTransactionServiceV2Stub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IClientSwitchTransactionServiceV2EndpointAddress(java.lang.String address) {
        BasicHttpBinding_IClientSwitchTransactionServiceV2_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.epagoinc.clientswitchtransactionservicev2.IClientSwitchTransactionServiceV2.class.isAssignableFrom(serviceEndpointInterface)) {
                com.epagoinc.clientswitchtransactionservicev2.BasicHttpBinding_IClientSwitchTransactionServiceV2Stub _stub = new com.epagoinc.clientswitchtransactionservicev2.BasicHttpBinding_IClientSwitchTransactionServiceV2Stub(new java.net.URL(BasicHttpBinding_IClientSwitchTransactionServiceV2_address), this);
                _stub.setPortName(getBasicHttpBinding_IClientSwitchTransactionServiceV2WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IClientSwitchTransactionServiceV2".equals(inputPortName)) {
            return getBasicHttpBinding_IClientSwitchTransactionServiceV2();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ClientSwitchTransactionServiceV2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BasicHttpBinding_IClientSwitchTransactionServiceV2"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IClientSwitchTransactionServiceV2".equals(portName)) {
            setBasicHttpBinding_IClientSwitchTransactionServiceV2EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
