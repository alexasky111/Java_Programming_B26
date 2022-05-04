package day50_inheritance.book;

public class AudioBook extends Book{
//the info from the Book class is being inherited by the AudioBook

    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening to "+ title + " narrated by "+ narrator);
    }
}
