package day58_exceptions.homework;

public class OutOfInkException extends RuntimeException{

    public OutOfInkException(String msg){
        super(msg);
    }
}
