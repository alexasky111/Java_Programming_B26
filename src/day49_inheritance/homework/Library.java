package day49_inheritance.homework;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Eat pray love";

        AudioBook audioBook = new AudioBook();
        audioBook.title = "me";
        audioBook.narrator = "Oprah Winfrey";
        audioBook.listen();

    }
}
