package day58_exceptions.bank;

public class InvalidCredentialsException extends Exception{
    //this is checked exception now because the parent is the Exception Class

    public InvalidCredentialsException(String msg){
        super(msg);
    }

}
