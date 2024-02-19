package account;

public class InvalidAmountException extends Exception{

    public InvalidAmountException(){
        super();
    }

    public InvalidAmountException(String errorMessage){
        super(errorMessage);
    }

    public InvalidAmountException(String errorMessage, Throwable cause){
        super(errorMessage, cause);
    }
}
