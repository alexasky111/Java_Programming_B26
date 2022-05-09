package day55_polymorphism.homework_book;

public class JavaTextBook extends EBook{

    String fun;

    @Override
    public void read() {
        System.out.println("reading a page from a new java text book");
    }

    @Override
    public void download() {
        System.out.println("finishing downloading a new ebook about java");
    }

    @Override
    public void open() {
        System.out.println("opening a new chapter in the java text book");
    }
}
