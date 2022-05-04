package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner object

        System.out.print("What is your fav book? ");
        String favBook = input.nextLine();

        System.out.print("What is your age? "); // we changed it to "print" instead of println for answer to be in the same line w/ a question !
        byte age = input.nextByte();

        System.out.print("What is your fav number? ");
        long number = input.nextLong();

        System.out.println(favBook); // helps to see answers after the printing statements each in new line
        System.out.println(age);
        System.out.println(number);




    }
}
