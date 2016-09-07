package com.epagoinc.client;
  
import com.epagoinc.clientcatalogqueryservice.Agent;
import com.epagoinc.clientcatalogqueryservice.AgentBranch;
import com.epagoinc.clientcatalogqueryservice.AgentCategory;
import com.epagoinc.clientcatalogqueryservice.AgentCategoryConcept;
import com.epagoinc.clientcatalogqueryservice.AuthorizationHeader;
import com.epagoinc.clientcatalogqueryservice.Bank;
import com.epagoinc.clientcatalogqueryservice.BankAccount;
import com.epagoinc.clientcatalogqueryservice.ConceptData;
import com.epagoinc.clientcatalogqueryservice.ExecuteCatalogQueryRequest;
import com.epagoinc.clientcatalogqueryservice.ExecuteCatalogQueryResponse;
import com.epagoinc.clientswitchaccountbalanceservice.AccountBalanceQueryRequest;
import com.epagoinc.clientswitchaccountbalanceservice.AccountBalanceQueryResponse;
import com.epagoinc.clientswitchaccountbalanceservice.ArrayOfReferenceCollectionReferenceReference;
import com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryRequest;
import com.epagoinc.clientswitchdepositnotificationservice.AgentBalanceQueryResponse;
import com.epagoinc.clientswitchdepositnotificationservice.AgentDeposit;
import com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsRequest;
import com.epagoinc.clientswitchdepositnotificationservice.AgentPendingDepositsResponse;
import com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositRequest;
import com.epagoinc.clientswitchdepositnotificationservice.NotifyDepositResponse;
import com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationRequest;
import com.epagoinc.clientswitchdepositnotificationservice.VoidNotificationResponse;
import com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionRequest;
import com.epagoinc.clientswitchtransactionservicev2.ApplyTransactionResponse;
import com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionRequest;
import com.epagoinc.clientswitchtransactionservicev2.ApplyVoidTransactionResponse;
import com.epagoinc.clientswitchtransactionservicev2.CapturedReference;
import com.epagoinc.clientswitchtransactionservicev2.PaymentConcept;
import com.epagoinc.clientswitchtransactionservicev2.PaymentMethod;
import com.epagoinc.clientswitchtransactionservicev2.PaymentMethodPaymentType;
import com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionRequest;
import com.epagoinc.clientswitchtransactionservicev2.PrepareTransactionResponse;
import com.epagoinc.clientswitchtransactionservicev2.PrintReference;
import com.epagoinc.clientswitchtransactionservicev2.Tax;
import com.epagoinc.clientswitchtransactionservicev2.TransactionPaymentMethod;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.UUID;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

/**
 *
 * @author Villa
 */

public class ApiClient {

    public Transaction tran = new Transaction();
    private final AuthorizationHeader auth;
    
    public ApiClient(String IdTerminal){
        this.auth = Globals.auth;
        this.auth.setTerminalId(IdTerminal);
    }

    public AccountBalanceQueryResponse executeAccountBalanceQuery(String conceptCode, String account) {
        ClientSwitchAccountBalanceService client = new ClientSwitchAccountBalanceService(this.auth);
        AccountBalanceQueryRequest request = new AccountBalanceQueryRequest(conceptCode, account);
        AccountBalanceQueryResponse response = null;
        //tran = new Transaction();
        tran.setJustDidSuccessfulQuery(false);
        //Globals.JustDidSuccessfulQuery = false;

        /* Read the initial time. */
        DateTime startTime = new DateTime();

        try {
            response = client.accountBalanceQuery(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        /* Read the end time. */
        DateTime stopTime = new DateTime();

        /* Compute the duration between the initial and the end time. */
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n        Response Time: " + elapsed);
        System.out.print("\n           statusCode: " + response.getBalanceRecord().getStatusCode());
        System.out.print("\n        statusMessage: " + response.getBalanceRecord().getStatusMessage());

        if (response.getBalanceRecord().getStatusCode() == 0) {
            tran.setJustDidSuccessfulQuery(true);
            tran.setConceptCode(conceptCode); // for PrepareTransaction.cs usage next
            tran.setAccount(response.getBalanceRecord().getAccount());
            tran.setSubTotalAmount(response.getBalanceRecord().getAmount());

            System.out.print("\n-------------------------------------------------------------------------------");
            System.out.print("\n              account: " + response.getBalanceRecord().getAccount());
            System.out.print("\n               amount: " + response.getBalanceRecord().getAmount());
            System.out.print("\n          paymentRule: " + response.getBalanceRecord().getPaymentRule());

            for (ArrayOfReferenceCollectionReferenceReference conceptReference : response.getBalanceRecord().getConceptReferences()) {
                System.out.print("\n\n<conceptReference>");
                System.out.print("\n          displayName: " + conceptReference.getDisplayName());
                System.out.print("\n                 name: " + conceptReference.getName());
                System.out.print("\n                value: " + conceptReference.getValue());
            }
        }
        return response;
    }

    public ApplyTransactionResponse executeTransaction(String conceptCode, String account, BigDecimal subTotalAmount, String DV) throws IOException {
        String clientSwitchTransactionId = UUID.randomUUID().toString().toUpperCase();
        String CR="";
        tran.setClientSwitchTransactionId(clientSwitchTransactionId); // for ExecuteApplyTransaction.java usage
        System.out.println("\nclientSwitchTransactionId: " + clientSwitchTransactionId);

        PaymentConcept paymentConcept = new PaymentConcept();
        paymentConcept.setConceptCode(conceptCode);
        paymentConcept.setAccount(account);
        //BigDecimal subTotalAmount = new BigDecimal(0.0);

        ClientSwitchTransactionServiceV2 client = new ClientSwitchTransactionServiceV2(this.auth);
        PrepareTransactionRequest request = new PrepareTransactionRequest(
                clientSwitchTransactionId,
                paymentConcept,
                subTotalAmount);
        PrepareTransactionResponse response = null;
        ApplyTransactionResponse response2 = null;

        /* Read the initial time. */
        DateTime startTime = new DateTime();

        try {
            response = client.prepareTransaction(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        /* Read the end time. */
        DateTime stopTime = new DateTime();

        /* Compute the duration between the initial and the end time. */
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n            Response Time: " + elapsed);
        System.out.print("\n               statusCode: " + response.getStatusCode());
        System.out.print("\n            statusMessage: " + response.getStatusMessage());

        tran.JustDidSuccessfulQuery = false;

        if (response.getStatusCode() == 0) {
            tran.setNewTransactionApplied(false);
            tran.setConceptCode(paymentConcept.getConceptCode());// for ApplyTransaction.cs usage next
            tran.setEPagoTransactionId(response.getEPagoTransactionId()); // For ApplayTransaction.cs
            tran.setTotalAmount(response.getTotalAmount());  // For ApplayTransaction.cs
            tran.setAccount(account);
            System.out.print("\n\n            ApplyTransaction");
            /*Globals.ReferenceNames.add(reference.getName());
            Globals.ReferenceLabels.put(reference.getName(), reference.getLabel());
            Globals.ReferenceTypes.put(reference.getName(), reference.getType());
            Globals.ReferenceCurrentValues.put(reference.getName(), reference.getCurrentValue());
            Globals.ReferenceDefaultValues.put(reference.getName(), reference.getDefaultValue());*/
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            f.setTimeZone(TimeZone.getTimeZone("GMT-5"));
            Calendar clientSwitchTransactionDate = Calendar.getInstance();            // Get the current time
            String strDate = f.format(clientSwitchTransactionDate.getTime());
            String iDate=strDate;
            TransactionPaymentMethod paymentBreakdown[] = new TransactionPaymentMethod[]{
                new TransactionPaymentMethod(
                new PaymentMethod(
                PaymentMethodPaymentType.Cash // paymentType
                , null // creditCardType
                ), tran.getTotalAmount() // amount
                , "" //documentNumber,
                , "" //authorizationCode,
                , "" //bankRoutingNumber,
                , null //Date documentDate
                )
            };

            CapturedReference[] capturedReferences = null;
            /*int i;
            for (i=0; i < 1; i++) {
                capturedReferences[i] = new CapturedReference("DV", DV);
            }
             */
            if (DV != null) {
                CR = FileUtils.pad(DV, 20, ' ');
                capturedReferences = new CapturedReference[1];
                capturedReferences[0] = new CapturedReference("DV", DV);
            }
            else
            {
                CR = FileUtils.pad(CR, 20, ' ');
            }

            //ClientSwitchTransactionServiceV2 client2 = new ClientSwitchTransactionServiceV2(Globals.auth);
            System.out.print("\n\n            ApplyTransaction:" + tran.getClientSwitchTransactionId() + "/" + clientSwitchTransactionDate + " / " + tran.getEPagoTransactionId() + "/" + tran.getConceptCode() + " / " + tran.getTotalAmount() + " / " + Arrays.toString(paymentBreakdown) + " / " + Arrays.toString(capturedReferences));
            ApplyTransactionRequest request2 = new ApplyTransactionRequest(tran.getClientSwitchTransactionId(), clientSwitchTransactionDate, tran.getEPagoTransactionId(), tran.getConceptCode(), tran.getTotalAmount(), paymentBreakdown, capturedReferences);

            /* Read the initial time. */
            DateTime startTime2 = new DateTime();

            try {
                Globals.startTime = System.currentTimeMillis();
                response2 = client.applyTransaction(request2);

            } catch (RemoteException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            /* Read the end time. */
            DateTime stopTime2 = new DateTime();

            /* Compute the duration between the initial and the end time. */
            Period duration2 = new Period(startTime2, stopTime2);

            String elapsed2 = formatter.print(duration2);

            System.out.print("\n\n              Response Time: " + elapsed2);
            System.out.print("\n                 statusCode: " + response2.getStatusCode());
            System.out.print("\n              statusMessage: " + response2.getStatusMessage());

            tran.setJustDidSuccessfulQuery(false);

            if (response2.getStatusCode() == 0) {

                System.out.print("\n-------------------------------------------------------------------------------");
                System.out.print("\n  clientSwitchTransactionId: " + response2.getClientSwitchTransactionId());
                System.out.print("\n         ePagoTransactionId: " + response2.getEPagoTransactionId());

                // The following two lines are to format strDate for printout purposes only
                clientSwitchTransactionDate = response2.getEPagoTransactionDate();     // Get the time returned by the ePago Transactional Switch
                strDate = f.format(clientSwitchTransactionDate.getTime());

                System.out.print("\n       ePagoTransactionDate: " + strDate);
                System.out.print("\n           commissionAmount: " + response2.getCommissionAmount());

                tran.setNewTransactionApplied(true);

                System.out.print("\n\n<printReferences>");
                
                
                String path;
                
                String s;
                String[] taxesS = new String[2];
                Tax[] taxes = response.getTaxes();
                String tax2A, tax2I;
                Integer tax0 = 0, commision = 0;

                if (taxes.length > 0) {
                    tax0 = taxes[0].getAmount().multiply(new BigDecimal(100)).intValue();
                    for (int k = 0; k < taxes.length; k++) {
                        if (taxes[k].isIncluded()) {
                            taxesS[k] = "1";
                        } else {
                            taxesS[k] = "0";
                        }
                    }
                } else {
                    taxesS[0] = "0";
                    taxesS[1] = "0";
                }

                if (taxes.length > 1) {
                    tax2A = String.valueOf(taxes[1].getAmount().multiply(new BigDecimal(100)).intValue());
                    tax2I = taxesS[1];
                } else {
                    tax2A = "0";
                    tax2I = "0";
                }
                String ch = "0";
                if (response.getOtherCharges().length > 0) {
                    ch = String.valueOf(response.getOtherCharges()[0].getAmount().multiply(new BigDecimal(100)).intValue());
                }

                if (response2.getCommissionAmount() != null) {
                    commision = response2.getCommissionAmount().multiply(new BigDecimal(100)).intValue();
                }

                String cash = "CASH      P";
                SimpleDateFormat f2 = new SimpleDateFormat("yyyyMMdd");
                Calendar creationDate = Calendar.getInstance();            // Get the current time
                String creatDate = f.format(creationDate.getTime());
                String creatDateS = f2.format(creationDate.getTime());
                //FileUtils.writeFile(path, header);
                path = "C:\\Users\\Villa\\Documents\\NetBeansProjects\\Files\\CF" + creatDateS + ".txt";

                File fi = new File(path);
                if (fi.exists() && !fi.isDirectory()) {
                    s = "\nDTL" + FileUtils.pad(tran.getConceptCode(), 10, ' ') + FileUtils.pad(tran.getAccount(), 20, ' ') + CR + "000" + tran.getEPagoTransactionId()
                            + tran.getClientSwitchTransactionId() + iDate + strDate + FileUtils.padL(String.valueOf(tran.getTotalAmount().multiply(new BigDecimal(100)).intValue()), 12, '0')
                            + FileUtils.padL(String.valueOf(tax0), 12, '0') + taxesS[0] + FileUtils.padL(String.valueOf(commision), 12, '0') + FileUtils.padL(ch, 12, '0') + FileUtils.padL(tax2A, 12, '0') + tax2I
                            + cash;
                    s = FileUtils.addBlanks(s, 13);
                } else {
                    String header = "HDRSTLMERC" + creatDate + "XXXSTL" + creatDateS + "1CF" + creatDateS;
                    s = FileUtils.addBlanks(header, 214) + "\nBCH" + this.auth.getTerminalId() + "XXX   " + "000001" + FileUtils.addBlanks(Globals.branchname, 30 - Globals.branchname.length())
                            + "000001" + iDate + strDate;
                    s = FileUtils.addBlanks(s, 155);
                    
                    s += "\nDTL" + FileUtils.pad(tran.getConceptCode(), 10, ' ') + FileUtils.pad(tran.getAccount(), 20, ' ') + CR + "000" + tran.getEPagoTransactionId()
                            + tran.getClientSwitchTransactionId() + iDate + strDate + FileUtils.padL(String.valueOf(tran.getTotalAmount().multiply(new BigDecimal(100)).intValue()), 12, '0')
                            + FileUtils.padL(String.valueOf(tax0), 12, '0') + taxesS[0] + FileUtils.padL(String.valueOf(commision), 12, '0') + FileUtils.padL(ch, 12, '0') + FileUtils.padL(tax2A, 12, '0') + tax2I
                            + cash;
                    s = FileUtils.addBlanks(s, 13);
                }

                FileUtils.writeFile(path, s);

                for (PrintReference printReference : response2.getPrintReferences()) {
                    System.out.print("\n\n    <reference>");
                    System.out.print("\n         label: ");
                    if ((printReference.getLabel().length() > 0) && (!"\n      ".equals(printReference.getLabel()))) {
                        System.out.print(printReference.getLabel());
                    }
                    System.out.print("\n         value: " + printReference.getValue());
                }

                System.out.print("\n\n       account: " + response2.getAccount());
            }

        } else {
            response2 = new ApplyTransactionResponse();
            response2.setStatusCode(response.getStatusCode());
            response2.setStatusMessage(response.getStatusMessage());
        }
        return response2;
    }

    public AgentBalanceQueryResponse executeAgentBalanceQuery() {
        ClientSwitchDepositNotificationService client = new ClientSwitchDepositNotificationService(this.auth);
        AgentBalanceQueryRequest request = new AgentBalanceQueryRequest();
        AgentBalanceQueryResponse response = null;

        /* Read the initial time. */
        DateTime startTime = new DateTime();

        try {
            response = client.agentBalanceQuery(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        /* Read the end time. */
        DateTime stopTime = new DateTime();

        /* Compute the duration between the initial and the end time. */
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n        Response Time: " + elapsed);
        System.out.print("\n           statusCode: " + response.getStatusCode());
        System.out.print("\n        statusMessage: " + response.getStatusMessage());

        if (response.getStatusCode() == 0) {
            System.out.print("\n-------------------------------------------------------------------------------");
            System.out.print("\n       currentBalance: " + response.getCurrentBalance());
            System.out.print("\n           dueBalance: " + response.getDueBalance());
            System.out.print("\n           minPayment: " + response.getMinPayment());
            System.out.print("\npendingDepositsAmount: " + response.getPendingDepositsAmount());
        }

        return response;

    }

    public AgentPendingDepositsResponse executeAgentPendingDeposits() {
        ClientSwitchDepositNotificationService client = new ClientSwitchDepositNotificationService(this.auth);
        AgentPendingDepositsRequest request = new AgentPendingDepositsRequest();
        AgentPendingDepositsResponse response = null;

        /* Read the start time. */
        DateTime startTime = new DateTime();

        try {
            response = client.agentPendingDeposits(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        /* Read the end time. */
        DateTime stopTime = new DateTime();

        /* Compute the duration between the initial and the end time. */
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n              Response Time: " + elapsed);
        System.out.print("\n                 statusCode: " + response.getStatusCode());
        System.out.print("\n              statusMessage: " + response.getStatusMessage());

        if (response.getStatusCode() == 0) {

            System.out.print("\n-------------------------------------------------------------------------------");

            // pendingDeposits
            System.out.print("\n<pendingDeposits>");
            for (AgentDeposit pendingDeposit : response.getPendingDeposits()) {
                System.out.print("\n\n    <agentDeposit>");
                System.out.print("\n       clientNotificationId: " + pendingDeposit.getClientNotificationId());
                System.out.print("\n        ePagoNotificationId: " + pendingDeposit.getEPagoNotificationId());
                System.out.print("\n                  bank code: " + pendingDeposit.getBank().getCode());
                System.out.print("\n                  bank name: " + pendingDeposit.getBank().getName());
                System.out.print("\n           bank routeNumber: " + pendingDeposit.getBank().getRouteNumber());
                System.out.print("\n                     amount: " + pendingDeposit.getAmount());
                System.out.print("\n                  reference: " + pendingDeposit.getReference());
            }
        }
        return response;
    }

    public ExecuteCatalogQueryResponse executeCatalogQuery() {
        ClientCatalogQuery client = new ClientCatalogQuery(this.auth);
        ExecuteCatalogQueryRequest request = new ExecuteCatalogQueryRequest();
        ExecuteCatalogQueryResponse response = null;

        /* Read the initial time. */
        DateTime startTime = new DateTime();

        try {
            response = client.executeCatalogQuery(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        /* Read the end time. */
        DateTime stopTime = new DateTime();

        /* Compute the duration between the initial and the end time. */
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n            Response Time: " + elapsed);
        System.out.print("\n               statusCode: " + response.getStatusCode());
        System.out.print("\n            statusMessage: " + response.getStatusMessage());

        //Globals.JustDidSuccessfulQuery = false;
        if (response.getStatusCode() == 0) {

            System.out.print("\n-------------------------------------------------------------------------------");

            // concepts
            System.out.print("\n\n<concept>");

            Globals.MaximumNumberOfAvailableConcepts = 0;
            Globals.AvailableConceptCodes.clear();
            Globals.AvailableConceptShortNames.clear();
            Globals.AvailableConceptsThatHaveQuery.clear();

            for (ConceptData concept : response.getConcepts()) {
                System.out.print("\n\n   conceptCategory: " + concept.getConceptCategory());
                System.out.print("\n       conceptCode: " + concept.getConceptCode());
                System.out.print("\n       conceptName: " + concept.getConceptName());
                System.out.print("\n  conceptShortName: " + concept.getConceptShortName());
                System.out.print("\n     defaultAmount: " + concept.getDefaultAmount());
                System.out.print("\n        hasBarCode: " + concept.isHasBarCode());
                System.out.print("\n          hasQuery: " + concept.isHasQuery());
                System.out.print("\n   providerMessage: " + concept.getProviderMessage());
                System.out.print("\n    readOnlyAmount: " + concept.isReadOnlyAmount());
                System.out.print("\n   requireQuantity: " + concept.isRequireQuantity());

                Globals.AvailableConceptCodes.add(concept.getConceptCode());
                Globals.AvailableConceptShortNames.add(concept.getConceptShortName());
                Globals.AvailableConceptsThatHaveQuery.put(concept.getConceptCode(), concept.isHasQuery());
                Globals.MaximumNumberOfAvailableConcepts++;
            }

            // agentCategories
            System.out.print("\n\n<agentCategory>");
            for (AgentCategory agentCategory : response.getAgentCategories()) {
                System.out.print("\n\n  code: " + agentCategory.getCode());
                System.out.print("\n  name: " + agentCategory.getName());

                System.out.print("\n\n  <availableConcept>\n");

                for (AgentCategoryConcept availableConcept : agentCategory.getAvailableConcepts()) {
                    System.out.print("\n     conceptCode: " + availableConcept.getConceptCode());
                }
            }

            // agents
            System.out.print("\n\n<agent>");
            for (Agent agent : response.getAgents()) {
                System.out.print("\n\n          categoryCode: " + agent.getCategoryCode());
                System.out.print("\n                  code: " + agent.getCode());
                System.out.print("\n  geoPoliticalLocation: " + agent.getGeoPoliticalLocation());
                System.out.print("\n          categoryCode: " + agent.getName());
                System.out.print("\n          neighborhood: " + agent.getNeighborhood());
                System.out.print("\n                street: " + agent.getStreet());
            }

            // agentBranches
            System.out.print("\n\n<agentBranch>");

            for (AgentBranch agentBranch : response.getAgentBranches()) {
                System.out.print("\n\n               address: " + agentBranch.getAddress());
                System.out.print("\n             agentCode: " + agentBranch.getAgentCode());
                System.out.print("\n                  code: " + agentBranch.getCode());
                System.out.print("\n  geoPoliticalLocation: " + agentBranch.getGeoPoliticalLocation());
                System.out.print("\n                  name: " + agentBranch.getName());

            }

            // banks
            System.out.print("\n\n<bank>");

            for (Bank bank : response.getBanks()) {
                System.out.print("\n\n         code: " + bank.getCode());
                System.out.print("\n         name: " + bank.getName());
                System.out.print("\n  routeNumber: " + bank.getRouteNumber());
            }

            // bankAccounts
            System.out.print("\n\n<bankAccount>");

            Globals.MaximumNumberOfBankAccounts = 0;
            for (BankAccount bankAccount : response.getBankAccounts()) {
                System.out.print("\n\n  accountNumber: " + bankAccount.getAccountNumber());
                System.out.print("\n       bankCode: " + bankAccount.getBankCode());

                Globals.AccountNumbers.add(bankAccount.getAccountNumber());
                Globals.BankCodes.add(bankAccount.getBankCode());

                Globals.MaximumNumberOfBankAccounts++;
            }

        }
        return response;
    }

    public ApplyVoidTransactionResponse executeApplyVoidTransaction(String ClientSwitchTransactionId, String EPagoTransactionId) {
        String clientSwitchVoidTransactionId = UUID.randomUUID().toString().toUpperCase();
        System.out.print("\n    clientSwitchVoidTransactionId: " + clientSwitchVoidTransactionId);
        System.out.print("\noriginalClientSwitchTransactionId: " + ClientSwitchTransactionId);
        System.out.print("\n       originalEPagoTransactionId: " + EPagoTransactionId);

        Calendar clientSwitchVoidTransactionDate = Calendar.getInstance();            // Get the current time

        // The following three lines are to format strDate for printout purposes only
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        f.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        String strDate = f.format(clientSwitchVoidTransactionDate.getTime());

        System.out.print("\n  clientSwitchVoidTransactionDate: " + strDate);

        String remarks = "Error del ?";

        System.out.print("\n                          remarks: " + remarks);

        ClientSwitchTransactionServiceV2 client = new ClientSwitchTransactionServiceV2(this.auth);
        ApplyVoidTransactionRequest request;
        request = new ApplyVoidTransactionRequest(
                clientSwitchVoidTransactionId,
                ClientSwitchTransactionId,
                EPagoTransactionId,
                clientSwitchVoidTransactionDate,
                remarks
        );
        ApplyVoidTransactionResponse response = null;

        // Read the initial time. 
        DateTime startTime = new DateTime();

        try {
            response = client.applyVoidTransaction(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //Read the end time. 
        DateTime stopTime = new DateTime();

        //Compute the duration between the initial and the end time. 
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n\n                    Response Time: " + elapsed);
        System.out.print("\n                       statusCode: " + response.getStatusCode());
        System.out.print("\n                    statusMessage: " + response.getStatusMessage());

        return response;
    }

    public NotifyDepositResponse executeNotifyDeposit() {
        String clientSwitchNotificationId = UUID.randomUUID().toString().toUpperCase();

        //Globals.ClientSwitchNotificationId = clientSwitchNotificationId; // for ExecuteVoidNotification.java usage
        System.out.print("\n  clientSwitchNotificationId: " + clientSwitchNotificationId);

        // The following four lines are to format strDate for printout purposes only
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        f.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        Calendar clientSwitchNotificationDate = Calendar.getInstance();            // Get the current time
        String strDate = f.format(clientSwitchNotificationDate.getTime());

        System.out.print("\nclientSwitchNotificationDate: " + strDate);

        int maxElement = Globals.MaximumNumberOfBankAccounts;
        Random random = new Random();
        int rInt = random.nextInt(maxElement);

        String accountNumber = Globals.AccountNumbers.get(rInt);
        String bankCode = Globals.BankCodes.get(rInt);

        System.out.print("\n               accountNumber: " + accountNumber);
        System.out.print("\n                    bankCode: " + bankCode);

        String reference = "";

        for (int i = 0; i < 10; i++) {
            reference = String.format("%d", random.nextInt(9)).concat(reference);
        }

        System.out.print("\n                   reference: " + reference);

        System.out.print("\n                      amount: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputBuffer = null;
        try {
            inputBuffer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigDecimal amount = null;
        try {
            amount = new BigDecimal(inputBuffer);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        ClientSwitchDepositNotificationService client = new ClientSwitchDepositNotificationService(this.auth);
        NotifyDepositRequest request = new NotifyDepositRequest(
                clientSwitchNotificationId,
                clientSwitchNotificationDate,
                amount,
                accountNumber,
                bankCode,
                reference);
        NotifyDepositResponse response = null;

        //Read the initial time. 
        DateTime startTime = new DateTime();

        try {
            response = client.notifyDeposit(request);
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        //Read the end time. 
        DateTime stopTime = new DateTime();

        //Compute the duration between the initial and the end time. 
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        //Compute the duration between the initial and the end time. 
        String elapsed = formatter.print(duration);

        System.out.print("\n               Response Time: " + elapsed);
        System.out.print("\n                  statusCode: " + response.getStatusCode());
        System.out.print("\n               statusMessage: " + response.getStatusmessage());

        if (response.getStatusCode() == 0) {
            System.out.print("\n-------------------------------------------------------------------------------");
            System.out.print("\n         ePagoNotificationId: " + response.getEPagoNotificationId());

            //Globals.ClientSwitchNotificationId = clientSwitchNotificationId;   // for VoidNotification.cs
            //Globals.EPagoNotificationId = response.getEPagoNotificationId();                 // idem
        }
        return response;
    }

    public VoidNotificationResponse executeVoidNotificationResponse(String originalClientSwitchNotificationId, String originalEPagoNotificationId) throws RemoteException {

        System.out.print("\noriginalclientSwitchNotificationId: " + originalClientSwitchNotificationId);
        System.out.print("\n       originalEPagoNotificationId: " + originalEPagoNotificationId);

        String clientSwitchVoidNotificationId = UUID.randomUUID().toString().toUpperCase();
        System.out.print("\n    clientSwitchVoidNotificationId: " + clientSwitchVoidNotificationId);

        // The following four lines are to format strDate for printout purposes only
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        f.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        Calendar clientSwitchVoidNotificationDate = Calendar.getInstance();            // Get the current time
        String strDate = f.format(clientSwitchVoidNotificationDate.getTime());

        System.out.print("\n  clientSwitchVoidNotificationDate: " + strDate);

        String remarks = "Error del ?";

        System.out.print("\n                           remarks: " + remarks);

        ClientSwitchDepositNotificationService client = new ClientSwitchDepositNotificationService(this.auth);
        VoidNotificationRequest request = new VoidNotificationRequest(
                originalClientSwitchNotificationId,
                originalEPagoNotificationId,
                clientSwitchVoidNotificationId,
                clientSwitchVoidNotificationDate,
                remarks);

        VoidNotificationResponse response = null;

        //Read the start time. 
        DateTime startTime = new DateTime();

        response = client.voidNotification(request);

        //Read the end time. 
        DateTime stopTime = new DateTime();

        //Compute the duration between the initial and the end time. 
        Period duration = new Period(startTime, stopTime);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .printZeroIfSupported()
                .minimumPrintedDigits(2)
                .appendHours()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendMinutes()
                .appendSeparator(":")
                .minimumPrintedDigits(2)
                .appendSeconds()
                .appendSeparator(".")
                .appendMillis()
                .toFormatter();

        String elapsed = formatter.print(duration);

        System.out.print("\n\n                     Response Time: " + elapsed);
        System.out.print("\n                        statusCode: " + response.getStatusCode());
        System.out.print("\n                     statusMessage: " + response.getStatusmessage());

        return response;
    }

}
