package account;

public class Account {

    private static int accountNumberCount = 1000;
    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name, String pin){
        this.name = name;
        if(pin.length() <= 4){
            this.pin = pin;
        }
        this.number = ++accountNumberCount;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount < 0){
            throw new InvalidAmountException("Invalid Amount to deposit");
        } else {
            balance += amount;
        }
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

    public int getNumber(){
        return number;
    }

    @Override
    public String toString(){
        return String.format("Account Name: %s%nAccount Number: %s%nBalance: %s", name, number, balance);
    }
}
