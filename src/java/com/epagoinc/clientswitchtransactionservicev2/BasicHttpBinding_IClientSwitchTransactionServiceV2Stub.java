/**
 * BasicHttpBinding_IClientSwitchTransactionServiceV2Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epagoinc.clientswitchtransactionservicev2;

public class BasicHttpBinding_IClientSwitchTransactionServiceV2Stub extends org.apache.axis.client.Stub implements com.epagoinc.clientswitchtransactionservicev2.IClientSwitchTransactionServiceV2 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrepareTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "prepareTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionRequest"), com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "prepareTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "applyTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionRequest"), com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "applyTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ApplyVoidTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "applyVoidTransactionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionRequest"), com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionResponse"));
        oper.setReturnClass(com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "applyVoidTransactionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public BasicHttpBinding_IClientSwitchTransactionServiceV2Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IClientSwitchTransactionServiceV2Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IClientSwitchTransactionServiceV2Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
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
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">applyVoidTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">PaymentMethod>creditCardType");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PaymentMethodCreditCardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">PaymentMethod>paymentType");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionRequest");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", ">prepareTransactionResponse");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfCapturedReference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.CapturedReference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "CapturedReference");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfCharge");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Charge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Charge");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Charge");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfPaymentMethod");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PaymentMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentMethod");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "paymentMethod");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfPossibleValue");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PossibleValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PossibleValue");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "possibleValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfPrintReference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PrintReference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PrintReference");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfReference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Reference[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Reference");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "reference");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfTax");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Tax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Tax");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "tax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "ArrayOfTransactionPaymentMethod");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "TransactionPaymentMethod");
            qName2 = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "payment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "CapturedReference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.CapturedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Charge");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Charge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentConcept");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PaymentConcept.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PaymentMethod");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PaymentMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PossibleValue");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PossibleValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "PrintReference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.PrintReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Reference");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Reference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "Tax");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:epagoinc.com:agentservice:v2", "TransactionPaymentMethod");
            cachedSerQNames.add(qName);
            cls = com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod.class;
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
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
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
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse prepareTransaction(com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchTransactionServiceV2/PrepareTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PrepareTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse applyTransaction(com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchTransactionServiceV2/ApplyTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse applyVoidTransaction(com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:epagoinc.com:agentservice:v2/IClientSwitchTransactionServiceV2/ApplyVoidTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ApplyVoidTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
