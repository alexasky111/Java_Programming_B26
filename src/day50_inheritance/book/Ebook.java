package day50_inheritance.book;

public class Ebook extends Book{
    double size;
    int page;

    public void read(){
        System.out.println("Reading a digital copy of "+title);
    }
}
