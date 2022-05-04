package day49_inheritance.homework;

public class EBook extends Book{
    int size;
    int pages;
    public void read(){
        System.out.println("Reading a digital copy of "+title);
    }
}
