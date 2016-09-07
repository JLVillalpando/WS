package com.epagoinc.client;

import com.epagoinc.clientcatalogqueryservice.*;

import javax.xml.rpc.Stub;

/**
 * ClientCatalogQuery.java
 * <p/>
 * Parts of this file were auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */

public class ClientCatalogQuery implements IClientCatalogQueryService {

    private AuthorizationHeader auth;

    public ClientCatalogQuery(AuthorizationHeader auth) {
        this.auth = auth;
    }

    public ExecuteCatalogQueryResponse executeCatalogQuery(ExecuteCatalogQueryRequest parameters)
            throws java.rmi.RemoteException {
        ClientCatalogQueryServiceLocator locator = new ClientCatalogQueryServiceLocator();
        try {
            Stub stub = (Stub) locator.getPort(IClientCatalogQueryService.class);
            BasicHttpBinding_IClientCatalogQueryServiceStub ePagoStub = (BasicHttpBinding_IClientCatalogQueryServiceStub) stub;

            ePagoStub.setHeader("urn:epagoinc.com:agentservice:authorization:v2",
                    "clientSwitchAuthorization", auth);
            return ePagoStub.executeCatalogQuery(parameters);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(System.out);
            return null;
        }
    }
}

