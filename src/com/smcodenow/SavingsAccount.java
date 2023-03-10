package com.smcodenow;

import java.text.SimpleDateFormat;

public class SavingsAccount extends Account {
    SimpleDateFormat dt=new SimpleDateFormat("DD-mm-YYYY");
    private String saType="Saving ";
    private double rate;
    private int limit=1;

    private SavingsAccount() {
        super();


    }

    public SavingsAccount(Account account,int limit) {
        super( account);

        this.limit=limit;
    }

    public SavingsAccount(int accNo, String tytle,String clientName, double balance) {
        super(accNo, tytle,clientName, balance);
        // TODO Auto-generated constructor stub
    }

    public SavingsAccount(int limit) {
        super();
        this.limit = limit;
    }


    public SimpleDateFormat getDt() {
        return dt;
    }

    public void setDt(SimpleDateFormat dt) {
        this.dt = dt;
    }

    public String getSaType() {
        return saType;
    }

    public void setSaType(String saType) {
        this.saType = saType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
