package com.smcodenow;

import java.util.ArrayList;


public class Account {
    private int accNo;
    private String tytle;
    private String clientName;
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //==================defoult constructor============
    public Account(){
        accNo=5000;
        tytle="Savings";
        clientName="Shamim";
        balance =500;
        setAccNo(accNo);
        setBalance(balance);
        setClientName(clientName);
        setTytle(tytle);
    }

    //=========argument constructor=========
    public Account(int accNo, String tytle, String clientName, double balance){
        this.accNo=accNo;
        this.tytle=tytle;
        this.clientName=clientName;
        this.balance=balance;
    }

    //=========copy constructor=========
    public Account(Account account) {
        System.out.println("---Copy  Constructor--- ");
        setAccNo(account.getAccNo());
        setTytle(account.getTytle());
        setBalance(account.getBalance());

    }


    //=========Passing method for encapsulated data============

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getTytle() {
        return tytle;
    }

    public void setTytle(String tytle) {
        this.tytle = tytle;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //========Balance Deposite Method=============
    public void deposite(double dAmount){
        this.balance+=dAmount;
    }

    //========Balance withdrow Method=============
    public void withdrow(double wAmount){
        this.balance+=wAmount;
    }

    //showing method for first time opening account details
    public void tvDisplay(){
        System.out.println("Name:\t\t\t\t"+ "'"+getClientName()+"'");
        System.out.println("Account No:\t\t\t"+ getAccNo());
        System.out.println("Account Title:\t\t"+ getTytle());
        //===========transaction information showing============
        for (Transaction transaction:transactions) {
            System.out.println(transaction);
        }
        System.out.println("Account Balance:\t"+ getBalance());
    }


    //==========toString method for showing Account information============
//    @Override
//    public String toString() {
//        return "Account Information"+ "\nWoner Name: "+clientName+"\nAccount No: "+accNo+"\nTitle: "+tytle+"\nBalance: "+balance;
//    }

    //================setter and getter for transaction ArrayList=======


    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Account)
        {
            Account a=(Account) obj;
            if(this.accNo==a.getAccNo() && this.tytle.equals(a.getTytle()))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return accNo+tytle.hashCode()+(int)balance/accNo;
    }

}
