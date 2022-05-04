package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {
        //not doing any inheritance here, only main method to create my objects

        Book obj1 = new Book();
        //obj1 can access to 6 instance variables
        AudioBook obj2 = new AudioBook();
        ////obj1 can access to 6 instance variables and 2 new var in the Audio class:
        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        //obj2 has access to m-thod listen()
        obj2.title = "Java is fun";
        obj2.listen();

        Ebook obj3 = new Ebook();
        //obj3 has access to the 6 var from the Book class and the 2 new var in the Ebook class:
        obj3.size = 20.4;
        obj3.page = 1004;
        //obj3 has access to the instance method read
        obj3.title = "Soft skills is important";
        obj3.read();

        //using updated Author info
        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling", 40);
        //made an Author obj it belongs to the Book obj4 object (made local author reference) obj belongs to the main method
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

//        Author author = new Author(); here you are making an Author obj in the main method, it is local to the main method
        //on line 27 the obj is made w/ the reference coming from the book obj. The Author obj belongs to the Book obj

    }
}
