/**
 * ClientSwitchDepositNotificationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice;

import com.epagoinc.client.Globals;

public class ClientSwitchDepositNotificationServiceLocator extends org.apache.axis.client.Service implements ClientSwitchDepositNotificationService {

    public ClientSwitchDepositNotificationServiceLocator() {
    }


    public ClientSwitchDepositNotificationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientSwitchDepositNotificationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IClientSwitchDepositNotificationService
    private java.lang.String BasicHttpBinding_IClientSwitchDepositNotificationService_address = Globals.ClientSwitchDepositNotificationServiceAddress;

    public java.lang.String getBasicHttpBinding_IClientSwitchDepositNotificationServiceAddress() {
        return BasicHttpBinding_IClientSwitchDepositNotificationService_address;
    }

    // OJO EIVAR 2
    public void setBasicHttpBinding_IClientSwitchDepositNotificationService_address(String newEndPoint) {
        BasicHttpBinding_IClientSwitchDepositNotificationService_address = newEndPoint;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName = "BasicHttpBinding_IClientSwitchDepositNotificationService";

    public java.lang.String getBasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName() {
        return BasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName = name;
    }

    public com.epagoinc.clientswitchdepositnotificationservice.IClientSwitchDepositNotificationService getBasicHttpBinding_IClientSwitchDepositNotificationService() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IClientSwitchDepositNotificationService_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IClientSwitchDepositNotificationService(endpoint);
    }

    public com.epagoinc.clientswitchdepositnotificationservice.IClientSwitchDepositNotificationService getBasicHttpBinding_IClientSwitchDepositNotificationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.epagoinc.clientswitchdepositnotificationservice.BasicHttpBinding_IClientSwitchDepositNotificationServiceStub _stub = new com.epagoinc.clientswitchdepositnotificationservice.BasicHttpBinding_IClientSwitchDepositNotificationServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IClientSwitchDepositNotificationServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IClientSwitchDepositNotificationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.epagoinc.clientswitchdepositnotificationservice.IClientSwitchDepositNotificationService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.epagoinc.clientswitchdepositnotificationservice.BasicHttpBinding_IClientSwitchDepositNotificationServiceStub _stub = new com.epagoinc.clientswitchdepositnotificationservice.BasicHttpBinding_IClientSwitchDepositNotificationServiceStub(new java.net.URL(BasicHttpBinding_IClientSwitchDepositNotificationService_address), this);
                _stub.setPortName(getBasicHttpBinding_IClientSwitchDepositNotificationServiceWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
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
        if ("BasicHttpBinding_IClientSwitchDepositNotificationService".equals(inputPortName)) {
            return getBasicHttpBinding_IClientSwitchDepositNotificationService();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ClientSwitchDepositNotificationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BasicHttpBinding_IClientSwitchDepositNotificationService"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("BasicHttpBinding_IClientSwitchDepositNotificationService".equals(portName)) {
            setBasicHttpBinding_IClientSwitchDepositNotificationServiceEndpointAddress(address);
        } else { // Unknown Port Name
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
