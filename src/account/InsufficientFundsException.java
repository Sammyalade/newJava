package account;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(){
        super();
    }

    public InsufficientFundsException(String errorMessage){ super(errorMessage); }

    public InsufficientFundsException(String errorMessage, Throwable cause){ super(errorMessage, cause); }
}

