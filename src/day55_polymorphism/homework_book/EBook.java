package day55_polymorphism.homework_book;

public abstract class EBook extends Book implements Downloadable {
    /*
    Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
     */
    double size;

    public abstract void open();



}
