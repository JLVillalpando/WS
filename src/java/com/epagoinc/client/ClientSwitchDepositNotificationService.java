package com.epagoinc.client;

import com.epagoinc.clientcatalogqueryservice.AuthorizationHeader;
import com.epagoinc.clientswitchdepositnotificationservice.*;

import javax.xml.rpc.Stub;

/**
 * ClientSwitchDepositNotificationService.java
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class ClientSwitchDepositNotificationService implements IClientSwitchDepositNotificationService {

    private AuthorizationHeader auth;

    public ClientSwitchDepositNotificationService(AuthorizationHeader auth) {
        this.auth = auth;
    }

    public NotifyDepositResponse notifyDeposit(NotifyDepositRequest parameters) throws java.rmi.RemoteException {
        try {
            return getClientSwitchDepositNotificationServiceStub().notifyDeposit(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    public VoidNotificationResponse voidNotification(VoidNotificationRequest parameters) throws java.rmi.RemoteException {
        try {
            return getClientSwitchDepositNotificationServiceStub().voidNotification(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    public AgentBalanceQueryResponse agentBalanceQuery(AgentBalanceQueryRequest parameters) throws java.rmi.RemoteException {
        try {
            return getClientSwitchDepositNotificationServiceStub().agentBalanceQuery(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    public AgentPendingDepositsResponse agentPendingDeposits(AgentPendingDepositsRequest parameters) throws java.rmi.RemoteException {
        try {
            return getClientSwitchDepositNotificationServiceStub().agentPendingDeposits(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    private BasicHttpBinding_IClientSwitchDepositNotificationServiceStub getClientSwitchDepositNotificationServiceStub() throws javax.xml.rpc.ServiceException {
        ClientSwitchDepositNotificationServiceLocator locator = new ClientSwitchDepositNotificationServiceLocator();
        Stub stub = (Stub) locator.getPort(IClientSwitchDepositNotificationService.class);
        BasicHttpBinding_IClientSwitchDepositNotificationServiceStub ePagoStub = (BasicHttpBinding_IClientSwitchDepositNotificationServiceStub) stub;
        ePagoStub.setHeader("urn:epagoinc.com:agentservice:authorization:v2", "clientSwitchAuthorization", auth);
        return ePagoStub;
    }
}
