package account;

import exception.InsufficientFundsException;
import exception.InvalidAmountException;
import exception.InvalidPinException;

public class Account {


    public Account(String name, int number, String correctPin) {
        this.name = name;
        pin = correctPin;
        this.number = number;
    }

    public Account(String correctPin) {
        this.pin = correctPin;
    }

    private boolean isInvalid(int amount){
        return amount < 0;
    }

    public void deposit(int amount) {
        if(isInvalid(amount)) throw new InvalidAmountException("Invalid Amount");
        balance += amount;
    }

    private boolean isInvalidPin(String correctPin){
        return !this.pin.equals(correctPin);
    }

    public int getBalance(String correctPin) {
        validate(correctPin);
        return balance;
    }

    private void validate(String correctPin) {
        if(isInvalidPin(correctPin)) throw new InvalidPinException("Pin is Invalid");
    }

    private boolean isInsufficient(int amount){
        return amount > balance;
    }

    public void withdraw(int amount, String correctPin) {
        validate(amount, correctPin);
        validate(amount);
        if(isInvalid(amount)) throw new InvalidAmountException("Invalid Amount");
        balance -= amount;
    }

    private void validate(int amount) {
        if(isInsufficient(amount)) throw new InsufficientFundsException("Insufficient amount");
    }
    public int getNumber() {
        return number;
    }

    private void validate(int amount, String correctPin) {
        validate(amount);
        validate(correctPin);
    }


    private int number;
    private String name;
    private int balance;

    private final String pin;

}
