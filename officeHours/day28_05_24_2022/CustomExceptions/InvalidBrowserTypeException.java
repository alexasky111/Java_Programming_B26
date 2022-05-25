package day28_05_24_2022.CustomExceptions;

public class InvalidBrowserTypeException extends RuntimeException{
    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}
