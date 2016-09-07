/**
 * BasicHttpBinding_IClientSwitchDepositNotificationServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchdepositnotificationservice;

public class BasicHttpBinding_IClientSwitchDepositNotificationServiceStub extends org.apache.axis.client.Stub implements com.epagoinc.clientswitchdepositnotificationservice.IClientSwitchDepositNotificationService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotifyDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "notifyDepositRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositRequest"), com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "notifyDepositResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VoidNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "voidNotificationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationRequest"), com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "voidNotificationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentBalanceQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentBalanceQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentBalanceQueryRequest"), com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentBalanceQueryResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentBalanceQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AgentPendingDeposits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentPendingDepositsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsRequest"), com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentPendingDepositsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public BasicHttpBinding_IClientSwitchDepositNotificationServiceStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public BasicHttpBinding_IClientSwitchDepositNotificationServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IClientSwitchDepositNotificationServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:authorization:v2", "AuthorizationHeader");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientcatalogqueryservice.AuthorizationHeader.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentBalanceQueryRequest");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentBalanceQueryResponse");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsRequest");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">agentPendingDepositsResponse");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositRequest");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">notifyDepositResponse");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationRequest");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationRequest.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">voidNotificationResponse");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Agent");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.Agent.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentBranch");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentBranch.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentCategory");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentCategory.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentCategoryConcept");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentCategoryConcept.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentDeposit");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentDeposit.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfAgentCategoryConcept");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentCategoryConcept[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentCategoryConcept");
        qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "availableConcept");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfAgentDeposit");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.AgentDeposit[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "AgentDeposit");
        qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "agentDeposit");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Bank");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.Bank.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "BankAccount");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.BankAccount.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ConceptData");
        cachedSerQNames.add(qName);
        cls = com.epagoinc.clientswitchdepositnotificationservice.ConceptData.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse notifyDeposit(com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchDepositNotificationService/NotifyDeposit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NotifyDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse voidNotification(com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchDepositNotificationService/VoidNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "VoidNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse agentBalanceQuery(com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchDepositNotificationService/AgentBalanceQuery");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AgentBalanceQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse agentPendingDeposits(com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchDepositNotificationService/AgentPendingDeposits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AgentPendingDeposits"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{parameters});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
