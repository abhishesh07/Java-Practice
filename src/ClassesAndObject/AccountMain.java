package ClassesAndObject;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

    //this is example you can write your own main method according to your need

    Account testAccount = new Account(1122,20000,4.5);
    if(testAccount.withdraw(20001))
        System.out.println("Withdraw successful");
    else
        System.out.println("Withdraw unsuccessful");

    testAccount.deposit(3000);
    System.out.println(
            testAccount.getId() + " "+
                    testAccount.getBalance()+" "+
                    testAccount.getAnnualInterestRate());

    System.out.println(testAccount.getDateCreated());
    System.out.println(testAccount.getDateCreated().toString());
    System.out.println(testAccount.getDateCreated().toLocaleString());
    System.out.println(testAccount.getDateCreated().toGMTString());
    }
}
