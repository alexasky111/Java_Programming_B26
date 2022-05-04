package day03_04_18_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Moby Dick", "fantasy", "Herman Melville");
        //We must call the m-thod for it to work
        System.out.println(book1);

        Book b2 = new Book("Any Book","Fantasy", "Any Author"); //1
        Book b3 = new Book("Crime and Punishment", "Classics", "Fyodor Dostoevsky");
        Book b4 = new Book("The Three Musketeers", "adventure", "Alexandre Dumas");
        Book b5 = new Book("Moby Dick", "adventure", "Herman Melville");
        Book b6 = new Book("Sandman", "comics", "Neil Gaiman");
        Book b7 = new Book("Europe: A History", "history", "Norman Davies");
        Book b8 = new Book("Game of Thrones", "fantasy", "George R. Martin");

        System.out.println(Book.bookCount);

        //create an Array List
        ArrayList<Book>allbooks = new ArrayList<>(Arrays.asList(book1,b2,b3,b4,b5,b6,b7,b8));
        System.out.println(allbooks);

        ArrayList<Book>allFantasy = new ArrayList<>();

        for (Book each : allbooks) {
            if(each.category.equalsIgnoreCase("fantasy")){
                allFantasy.add(each);
            }
        }
        System.out.println(allFantasy);




    }


}
