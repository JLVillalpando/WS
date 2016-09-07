/**
 * IClientSwitchTransactionServiceV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public interface IClientSwitchTransactionServiceV2 extends java.rmi.Remote {
    public PrepareTransactionResponse prepareTransaction(PrepareTransactionRequest parameters) throws java.rmi.RemoteException;
    public ApplyTransactionResponse applyTransaction(ApplyTransactionRequest parameters) throws java.rmi.RemoteException;
    public ApplyVoidTransactionResponse applyVoidTransaction(ApplyVoidTransactionRequest parameters) throws java.rmi.RemoteException;
}
