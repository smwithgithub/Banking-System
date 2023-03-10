package com.smcodenow;

import java.util.Date;

public class Transaction {
    //================== declearing variable for needed values==============
    private int id;
    private String type;
    private Date date;
    private double amount;
    private Account account;

    //=====================setter getter method of encapsulated values====================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //============== deposite method for show deposite transaction information============
    public void deposite(Account dtAccount, double dtAmount){
        type="Deposite";
        date = new Date();
        setAccount(dtAccount);
        setAmount(dtAmount);
        account.deposite(dtAmount);
        account.getTransactions().add(this);

    }

    //============== Withdrow method for show deposite transaction information============
    public void withdrow (Account wtAccount, double wtAmount){
        if(account.getBalance()>wtAmount){
            type="Withdrow";
            date = new Date();
            setAccount(wtAccount);
            setAmount(wtAmount);
            account.deposite(wtAmount);
            account.getTransactions().add(this);
        }
        else{
            System.out.println("Insufficient Ballance");
        }
    }

    @Override
    public String toString() {
        return "Transaction id=" + id + ", date=" + date + ", type=" + type + ", amount=" + amount + '\n';
    }

    public void show(){
        System.out.println("----------------Transaction -----------");
        System.out.println("Id "+getId());
        System.out.println("Date "+getDate());
        System.out.println("Account No "+getAccount().getAccNo());
        System.out.println("Title "+getAccount().getTytle());
        System.out.println("Type "+getType());
        System.out.println("Amount "+getAmount());

    }

}
