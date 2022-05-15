package day58_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{

    //this is unchecked exception now because the parent is the RuntimeException Class
    public NotEnoughMoneyException(){
        super("Not Enough money in the account");
    }
    public NotEnoughMoneyException(String msg){
        super(msg);
    }
}
