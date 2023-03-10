package com.smcodenow;

public class AccountTransfer extends Transaction {
    Account accountTo;
    String atType = "Transfer ";

    public void transfer(Account byAccount, Account toAccount, double atAmmount) {
        setAccountTo(toAccount);
        deposite(toAccount, atAmmount);
        withdrow(byAccount, atAmmount);

    }

    @Override
    public String toString() {
        return "Transaction id=" + getId() + ", date=" + getDate() + ", type=" + getAtType() + ", amount=" + getAmount() +
                " from " + getAccount().getAccNo() + " To " + getAccountTo().getAccNo();
    }

    @Override
    public void show() {
        System.out.println("----------------Transaction -----------");
        System.out.println("Id " + getId());
        System.out.println("Date " + getDate());
        System.out.println("for Account No " + getAccount().getAccNo() + " to " + getAccountTo().getAccNo());
        System.out.println("Title " + getAccount().getTytle());
        System.out.println("Type " + getType());
        System.out.println("Amount " + getAmount());

    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public String getAtType() {
        return atType;
    }

    public void setAtType(String atType) {
        this.atType = atType;
    }

}
