package day49_inheritance.homework;

public class AudioBook extends Book{
    String narrator;
    double duration;

    public void listen(){
        System.out.println("listening to "+title+" narrated by "+narrator);
    }

}
