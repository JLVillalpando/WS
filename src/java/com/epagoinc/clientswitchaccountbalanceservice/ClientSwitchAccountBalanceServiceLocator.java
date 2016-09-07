/**
 * ClientSwitchAccountBalanceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchaccountbalanceservice;

import com.epagoinc.client.Globals;

public class ClientSwitchAccountBalanceServiceLocator extends org.apache.axis.client.Service implements ClientSwitchAccountBalanceService {

    public ClientSwitchAccountBalanceServiceLocator() {
    }


    public ClientSwitchAccountBalanceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientSwitchAccountBalanceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IClientSwitchAccountBalanceService
    private java.lang.String BasicHttpBinding_IClientSwitchAccountBalanceService_address = Globals.ClientSwitchAccountBalanceServiceAddress;

    public java.lang.String getBasicHttpBinding_IClientSwitchAccountBalanceServiceAddress() {
        return BasicHttpBinding_IClientSwitchAccountBalanceService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName = "BasicHttpBinding_IClientSwitchAccountBalanceService";

    public java.lang.String getBasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName() {
        return BasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName = name;
    }

    public IClientSwitchAccountBalanceService getBasicHttpBinding_IClientSwitchAccountBalanceService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IClientSwitchAccountBalanceService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IClientSwitchAccountBalanceService(endpoint);
    }

    public IClientSwitchAccountBalanceService getBasicHttpBinding_IClientSwitchAccountBalanceService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            BasicHttpBinding_IClientSwitchAccountBalanceServiceStub _stub = new BasicHttpBinding_IClientSwitchAccountBalanceServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IClientSwitchAccountBalanceServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IClientSwitchAccountBalanceService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IClientSwitchAccountBalanceService.class.isAssignableFrom(serviceEndpointInterface)) {
                BasicHttpBinding_IClientSwitchAccountBalanceServiceStub _stub = new BasicHttpBinding_IClientSwitchAccountBalanceServiceStub(new java.net.URL(BasicHttpBinding_IClientSwitchAccountBalanceService_address), this);
                _stub.setPortName(getBasicHttpBinding_IClientSwitchAccountBalanceServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IClientSwitchAccountBalanceService".equals(inputPortName)) {
            return getBasicHttpBinding_IClientSwitchAccountBalanceService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ClientSwitchAccountBalanceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BasicHttpBinding_IClientSwitchAccountBalanceService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IClientSwitchAccountBalanceService".equals(portName)) {
            setBasicHttpBinding_IClientSwitchAccountBalanceServiceEndpointAddress(address);
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
