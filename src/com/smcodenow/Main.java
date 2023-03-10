package com.smcodenow;

public class Main {

    public static void main(String[] args) {
	    //Account class object creation for new account
        Account mainAccount=new Account(101,"Savings","Shamim",1000);

        //showing first time opening account details
        System.out.println("============New Account Information==============");
        mainAccount.tvDisplay();

        //Account class 2nd object creation for each transaction
        Account account = new SavingsAccount(2);
        account.setAccNo(100);
        account.setTytle("Savings");
        account.setBalance(100);

        //==========Transaction object for make transaction and get information========
        Transaction tAccount=new Transaction();
        AccountTransfer atAccount=new AccountTransfer();

        //==========Deposite money in Account============
        System.out.println("\n\n==========Deposite Money==================");
        tAccount.setId(1001);
        tAccount.deposite(account,10000);
        System.out.println(tAccount);
        account.tvDisplay();

        //==========withdrow money in Account============
        System.out.println("\n\n==========withdrow Money==================");
        tAccount.setId(1002);
        tAccount.withdrow(account,10000);
        System.out.println(tAccount);
        account.tvDisplay();

        //==========Transfer money in Account============
        System.out.println("\n\n===========Transfer Money============");
        atAccount.setId(1003);
        atAccount.transfer(account,mainAccount,1.500);
        System.out.println(atAccount);
        account.tvDisplay();

        System.out.println(account.hashCode());

    }
}
