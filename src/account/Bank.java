package account;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public Bank(String bankName){
        name = bankName;
        this.accounts = new ArrayList<>();
        accountNumberGenerator = 1000;
    }

    public Account register(String firstName, String lastName, String correctPin) {
        Account newAccount = new Account(firstName + " " + lastName, generateAccountNumber(), correctPin);
        accounts.add(newAccount);
        return newAccount;

    }
    public int generateAccountNumber(){
        return accountNumberGenerator++;

    }

    public int countNumberOfUser() {
        return numberOfUser;
    }

    public void deposit(int amount, int accountNumber) {
       Account accountToDeposit = findAccount(accountNumber);
       accountToDeposit.deposit(amount);
    }

    public void withdraw(int amount, int accountNumber, String correctPin) {
        Account accountToWithdraw = findAccount(accountNumber);
        accountToWithdraw.withdraw(amount, correctPin);

    }
    public void transfer(int senderAccount, int receiverAccount, int amount, String correctPin) {
        Account sender = findAccount(senderAccount);
        sender.withdraw(amount, correctPin);
        Account receiver = findAccount(receiverAccount);
        receiver.deposit(amount);
    }

    public int checkBalance(int accountNumber, String correctPin) {
        Account accountToCheckBalance = findAccount(accountNumber);
        return accountToCheckBalance.getBalance(correctPin);
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

    private final String name;

    private int accountNumberGenerator;

    private final List<Account> accounts;
}
