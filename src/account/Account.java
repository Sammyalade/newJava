package account;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;

    private boolean isGenerated = false;

    public Account(String name, String pin){
        this.name = name;
        if(pin.length() <= 4){
            this.pin = pin;
        }
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount < 0){
            throw new InvalidAmountException("Invalid Amount to deposit");
        } else {
            balance += amount;
        }
    }
    public void resetAccountNumber(){
        nextAccountNumber = 1000;
    }

    public void withdraw(int amount, String reason) throws InsufficientFundsException, InvalidAmountException {
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient Funds");
        } else if(amount < 0){
          throw new InvalidAmountException("Cannot withdraw negative amount") ;
        } else {
            balance -= amount;
        }
    }

    public int checkBalance(String pin) throws InvalidPinException {
        boolean isInvalidPin = this.pin.equals(pin);
        if (!isInvalidPin) {
            throw new InvalidPinException("Invalid Pin");
        }
        return balance;
    }

    public void setNumber(int accountNumber){
        number = accountNumber;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString(){
        return String.format("Account Name: %s%nAccount Number: %s%nBalance: %s", name, number, balance);
    }
}
