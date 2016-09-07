package com.epagoinc.client;

import com.epagoinc.clientcatalogqueryservice.AuthorizationHeader;
import com.epagoinc.clientswitchaccountbalanceservice.*;

import javax.xml.rpc.Stub;

/**
 * ClientSwitchAccountBalanceService.java
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class ClientSwitchAccountBalanceService implements IClientSwitchAccountBalanceService {

    private AuthorizationHeader auth;

    public ClientSwitchAccountBalanceService(AuthorizationHeader auth) {
        this.auth = auth;
    }

    public AccountBalanceQueryResponse accountBalanceQuery(AccountBalanceQueryRequest parameters) throws java.rmi.RemoteException {
        try {
            return getClientSwitchAccountBalanceQueryServiceStub().accountBalanceQuery(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    private BasicHttpBinding_IClientSwitchAccountBalanceServiceStub getClientSwitchAccountBalanceQueryServiceStub() throws javax.xml.rpc.ServiceException {
        ClientSwitchAccountBalanceServiceLocator locator = new ClientSwitchAccountBalanceServiceLocator();
        Stub stub = (Stub) locator.getPort(IClientSwitchAccountBalanceService.class);
        BasicHttpBinding_IClientSwitchAccountBalanceServiceStub ePagoStub = (BasicHttpBinding_IClientSwitchAccountBalanceServiceStub) stub;
        ePagoStub.setHeader("urn:epagoinc.com:agentservice:authorization:v2", "clientSwitchAuthorization", auth);
        return ePagoStub;
    }
}
