/**
 * ClientCatalogQueryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientcatalogqueryservice;

import com.epagoinc.client.Globals;

public class ClientCatalogQueryServiceLocator extends org.apache.axis.client.Service implements com.epagoinc.clientcatalogqueryservice.ClientCatalogQueryService {

    public ClientCatalogQueryServiceLocator() {
    }


    public ClientCatalogQueryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientCatalogQueryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IClientCatalogQueryService
    private java.lang.String BasicHttpBinding_IClientCatalogQueryService_address = Globals.ClientCatalogQueryAddress;

    public java.lang.String getBasicHttpBinding_IClientCatalogQueryServiceAddress() {
        return BasicHttpBinding_IClientCatalogQueryService_address;
    }
//OJO EIVAR
//    public void setBasicHttpBinding_IClientCatalogQueryService_address(String newEndPoint)
//    {
//        BasicHttpBinding_IClientCatalogQueryService_address = newEndPoint;
//    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName = "BasicHttpBinding_IClientCatalogQueryService";

    public java.lang.String getBasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName() {
        return BasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName = name;
    }

    public com.epagoinc.clientcatalogqueryservice.IClientCatalogQueryService getBasicHttpBinding_IClientCatalogQueryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IClientCatalogQueryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IClientCatalogQueryService(endpoint);
    }

    public com.epagoinc.clientcatalogqueryservice.IClientCatalogQueryService getBasicHttpBinding_IClientCatalogQueryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.epagoinc.clientcatalogqueryservice.BasicHttpBinding_IClientCatalogQueryServiceStub _stub = new com.epagoinc.clientcatalogqueryservice.BasicHttpBinding_IClientCatalogQueryServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IClientCatalogQueryServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IClientCatalogQueryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.epagoinc.clientcatalogqueryservice.IClientCatalogQueryService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.epagoinc.clientcatalogqueryservice.BasicHttpBinding_IClientCatalogQueryServiceStub _stub = new com.epagoinc.clientcatalogqueryservice.BasicHttpBinding_IClientCatalogQueryServiceStub(new java.net.URL(BasicHttpBinding_IClientCatalogQueryService_address), this);
                _stub.setPortName(getBasicHttpBinding_IClientCatalogQueryServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IClientCatalogQueryService".equals(inputPortName)) {
            return getBasicHttpBinding_IClientCatalogQueryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ClientCatalogQueryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BasicHttpBinding_IClientCatalogQueryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IClientCatalogQueryService".equals(portName)) {
            setBasicHttpBinding_IClientCatalogQueryServiceEndpointAddress(address);
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
