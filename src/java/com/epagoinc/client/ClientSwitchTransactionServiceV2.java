package com.epagoinc.client;

import com.epagoinc.clientcatalogqueryservice.AuthorizationHeader;
import com.epagoinc.clientswitchtransactionservicev2.*;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ClientSwitchTransactionServiceV2.java
 * <p/>
 * Parts of this file were auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */

public class ClientSwitchTransactionServiceV2 implements IClientSwitchTransactionServiceV2 {
    private final ClientSwitchTransactionServiceV2Locator locator;
    private final AuthorizationHeader auth;


    public ClientSwitchTransactionServiceV2(AuthorizationHeader auth) {
        this.locator = new ClientSwitchTransactionServiceV2Locator();
        this.auth = auth;
    }

    @Override
    public PrepareTransactionResponse prepareTransaction(PrepareTransactionRequest parameters) throws RemoteException {
        try {
            return getClientSwitchTransactionServiceV2Stub().prepareTransaction(parameters);
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    @Override
    public ApplyTransactionResponse applyTransaction(ApplyTransactionRequest parameters) throws RemoteException {
        ApplyTransactionResponse response;
        try {
            
            long start = System.currentTimeMillis();
            long end = start + 20 * 1000; // 20 segundos * 1000 ms/seg
            while (System.currentTimeMillis() < end) {
                System.out.println("end=" +end+ "\nactual="+ System.currentTimeMillis());
                response = getClientSwitchTransactionServiceV2Stub().applyTransaction(parameters);
                if(response.getStatusCode() == 0 || response.getStatusCode() == 4){
                    System.out.println("\nSTATUS" + response.getStatusMessage() + " / " + response.getStatusCode());
                    return response;
                }
            }

            long elapsedT = System.currentTimeMillis() - Globals.startTime;
            if (elapsedT > 60 * 1000) {
                response = new ApplyTransactionResponse();
                response.setStatusMessage("PENDING CONFIRMATION FOR FURTHER INVESTIGATION AND POSSIBLE REFUND");
                response.setStatusCode(11);
                System.out.println("Elapsed Time > 60");
            } else {
                Thread.sleep(2000);
                System.out.println("Recursive...");
                response = this.applyTransaction(parameters);
                
            }
            return response;            
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientSwitchTransactionServiceV2.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ApplyVoidTransactionResponse applyVoidTransaction(ApplyVoidTransactionRequest parameters) throws RemoteException {
        try {
            return getClientSwitchTransactionServiceV2Stub().applyVoidTransaction(parameters);
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }

    private BasicHttpBinding_IClientSwitchTransactionServiceV2Stub getClientSwitchTransactionServiceV2Stub() throws ServiceException {
        Stub stub = (Stub) locator.getPort(IClientSwitchTransactionServiceV2.class);
        BasicHttpBinding_IClientSwitchTransactionServiceV2Stub ePagoStub = (BasicHttpBinding_IClientSwitchTransactionServiceV2Stub) stub;
        ePagoStub.setHeader("urn:epagoinc.com:agentservice:authorization:v2", "clientSwitchAuthorization", auth);
        return ePagoStub;
    }
}
