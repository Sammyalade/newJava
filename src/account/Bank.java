package account;

import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public void deposit(int naira, int kobo){

    }

    public void withdraw(int naira, int kobo, String reason){

    }

    public void transfer(int naira, int kobo, String reason){

    }

    public int checkBalance(int accountNumber, String pin){
        return 0;
    }

    public Account registerCustomer(String firstName, String lastName,  String pin){
        return null;
    }

    public void removeAccount(int accountNumber, String reason){

    }

    public Account findAccount(int accountNumber){
        return null;
    }
}
