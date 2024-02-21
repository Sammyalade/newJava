package account;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public Bank(){
        this.accounts = new ArrayList<>();
        accountNumberGenerator = 1000;
    }

    public Account register(String firstName, String lastName, String correctPin) {
        Account newAccount = new Account(firstName + " " + lastName, generateAccountNumber(), correctPin);
        accounts.add(newAccount);
        return newAccount;

    }
    public int generateAccountNumber(){
        return accountNumberGenerator + ++numberOfUser;

    }

    public int countNumberOfUser() {
        return numberOfUser;
    }

    public void deposit(int amount, int accountNumber) {
        for(Account account : accounts){
            if(account.getNumber() == accountNumber)
                account.deposit(amount);
        }
    }

    public void withdraw(int amount, int accountNumber, String correctPin) {
        for(Account account : accounts){
            if(account.getNumber() == accountNumber){
                account.withdraw(amount, correctPin);
            }
        }
    }
    public void transfer(int senderAccount, int receiverAccount, int amount, String correctPin) {
        for(Account account: accounts ){
            if (account.getNumber() == senderAccount){
                account.withdraw(amount, correctPin);
            }
            if (account.getNumber() == receiverAccount){
                account.deposit(amount);
            }
        }
    }

    public int checkBalance(int accountNumber, String correctPin) {
        int balance = 0;
        for(Account account : accounts){
            if(account.getNumber() == accountNumber){
                balance = account.getBalance(correctPin);
            }
        }
        return balance;
    }

    public void remove(int accountNumber, String correctPin) {
        accounts.removeIf(account -> account.getNumber() == accountNumber);
        numberOfUser--;
    }

    public Account findAccount(int accountNumber) {
        Account accountInfo = null;
        for(Account account : accounts){
            if(account.getNumber() == accountNumber){
                accountInfo = account;
            }
        }
        return accountInfo;
    }

    private int numberOfUser;

    private final int accountNumberGenerator;

    private final List<Account> accounts;
}
