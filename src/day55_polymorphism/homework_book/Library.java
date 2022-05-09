package day55_polymorphism.homework_book;

public class Library {
    public static void main(String[] args) {
        //you can't instantiate from abstract class or interface
        //all possible objects from the concrete class JavaTextBook
        JavaTextBook javaTextBook1 = new JavaTextBook();//ref of itself
        javaTextBook1.read();
        javaTextBook1.download();
        javaTextBook1.open();
        System.out.println("javaTextBook1.fun = " + javaTextBook1.fun);
        System.out.println("javaTextBook1.size = " + javaTextBook1.size);
        System.out.println("javaTextBook1.name = " + javaTextBook1.name);

        //ref of parent
        EBook javaTextBook2 = new JavaTextBook();
        javaTextBook2.read();
        javaTextBook2.download();
        javaTextBook2.open();
        System.out.println("javaTextBook2.size = " + javaTextBook2.size);
        System.out.println("javaTextBook2.name = " + javaTextBook2.name);
        //javaTextBook4.fun -> no reference to sub class var fun

        //polymorphism->ability of an object to take different forms
        Book javaTextBook3 = new JavaTextBook();
        javaTextBook3.read();

        //javaTextBook3.download(); Book class doesn't have a reference to the .download() method, because Book doesn't implement Downloadable

        //javaTextBook3.open(); Book super class doesn't have a reference to the .open() method from its subclass Ebook
        System.out.println("javaTextBook3.name = " + javaTextBook3.name);
        //javaTextBook3.size; -> doesn't know how to access subclass var
        //javaTextBook3.fun; -> doesn't know how to access grandchild var

        Downloadable javaTextBook4 = new JavaTextBook();
        javaTextBook4.download();
        //javaTextBook4.open(); -> no ref
        //javaTextBook4.read(); -> no ref


    }

}
