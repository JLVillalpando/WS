/**
 * IClientSwitchDepositNotificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice;

public interface IClientSwitchDepositNotificationService extends java.rmi.Remote {
    public NotifyDepositResponse notifyDeposit(NotifyDepositRequest parameters) throws java.rmi.RemoteException;
    public VoidNotificationResponse voidNotification(VoidNotificationRequest parameters) throws java.rmi.RemoteException;
    public AgentBalanceQueryResponse agentBalanceQuery(AgentBalanceQueryRequest parameters) throws java.rmi.RemoteException;
    public AgentPendingDepositsResponse agentPendingDeposits(AgentPendingDepositsRequest parameters) throws java.rmi.RemoteException;
}
