package account;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String name = "Guaranty Trust Bank";
    private final List<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void deposit(int number, int amount){

    }

    public void withdraw(int number, int amount, String remark){

    }

    public void transfer(int number, int amount, String remark){

    }

    public int checkBalance(int number, String pin){
        return 0;
    }

    public Account registerCustomer(String firstName, String lastName,  String pin){

        Account newAccount = new Account(firstName + " " + lastName, pin);

        accounts.add(newAccount);

        return newAccount;

    }

    public void removeAccount(int accountNumber, String reason){

    }

    public Account findAccount(int accountNumber){
        for(Account account : accounts){
            if(account.getNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
}
