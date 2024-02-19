package account;

public class Account {

    private String name;
    private int balance;
    private String pin;
    private int number;

    public void deposit(int amount) throws InvalidAmountException {
        if (balance < 0){
            throw new InvalidAmountException("Invalid Amount to deposit");
        }
    }

    public void withdraw(int amount, String reason) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient Funds");
        }
    }

    public int checkBalance(String pin) throws InvalidPinException {
        if (this.pin.equals(pin)){
            throw new InvalidPinException("Invalid Pin");
        }
        return 0;
    }
}
