/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epagoinc.client;

import com.epagoinc.clientswitchtransactionservicev2.CapturedReference;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Villa
 */
public class Transaction {
    public String ClientSwitchTransactionId;
    private String EPagoTransactionId;
    private String ConceptCode;
    private String Account;
    private BigDecimal SubTotalAmount;
    private BigDecimal TotalAmount;
    public boolean JustDidSuccessfulQuery;
    public boolean NewTransactionApplied;
    public ArrayList<CapturedReference> ReferenceNames;

    public String getEPagoTransactionId() {
        return EPagoTransactionId;
    }

    public void setEPagoTransactionId(String EPagoTransactionId) {
        this.EPagoTransactionId = EPagoTransactionId;
    }

    public String getConceptCode() {
        return ConceptCode;
    }

    public void setConceptCode(String ConceptCode) {
        this.ConceptCode = ConceptCode;
    }

    public ArrayList<CapturedReference> getReferenceNames() {
        return ReferenceNames;
    }

    public void setReferenceNames(ArrayList<CapturedReference> ReferenceNames) {
        this.ReferenceNames = ReferenceNames;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public BigDecimal getSubTotalAmount() {
        return SubTotalAmount;
    }

    public void setSubTotalAmount(BigDecimal SubTotalAmount) {
        this.SubTotalAmount = SubTotalAmount;
    }

    public BigDecimal getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(BigDecimal TotalAmount) {
        this.TotalAmount = TotalAmount;
    }
    
    public boolean isJustDidSuccessfulQuery() {
        return JustDidSuccessfulQuery;
    }

    public void setJustDidSuccessfulQuery(boolean JustDidSuccessfulQuery) {
        this.JustDidSuccessfulQuery = JustDidSuccessfulQuery;
    }

    public boolean isNewTransactionApplied() {
        return NewTransactionApplied;
    }

    public void setNewTransactionApplied(boolean NewTransactionApplied) {
        this.NewTransactionApplied = NewTransactionApplied;
    }

    public String getClientSwitchTransactionId() {
        return ClientSwitchTransactionId;
    }

    public void setClientSwitchTransactionId(String ClientSwitchTransactionId) {
        this.ClientSwitchTransactionId = ClientSwitchTransactionId;
    }
    
    
    
}
