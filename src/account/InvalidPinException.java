package account;

public class InvalidPinException extends Exception {
    public InvalidPinException(String errorMessage){
        super(errorMessage);
    }

    public InvalidPinException(){
        super();
    }

    public InvalidPinException(String errorMessage, Throwable cause){
        super(errorMessage, cause);
    }
}
