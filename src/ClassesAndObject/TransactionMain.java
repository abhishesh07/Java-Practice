package ClassesAndObject;

import java.util.ArrayList;

public class TransactionMain {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        Client client=new Client(100, "Abhishesh", "8765430190");
        accounts.add(new Account(1, 5000,3.5, client));
        accounts.add(new Account(2, 4000,4.5, client));

        accounts.get(0).withdraw(6000); //not enough balance
        accounts.get(0).withdraw(500);
        accounts.get(0).deposit(5000);
        accounts.get(0).withdraw(2000);

        accounts.get(1).deposit(6000);
        accounts.get(1).withdraw(500);
        accounts.get(1).deposit(5000);
        accounts.get(1).withdraw(2000);
        System.out.println(accounts.get(0));
        System.out.println(accounts.get(1));
        for(Account account:accounts){
            System.out.println("Account "+ account.getId()+ ":");
            System.out.println("W: "+account.countTransaction('W'));
            System.out.println("D: "+ account.countTransaction('D'));
        }
    }
}
