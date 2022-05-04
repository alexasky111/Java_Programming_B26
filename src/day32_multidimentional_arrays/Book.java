package day32_multidimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters is there? ");

        // 1. Instead of storing in a variable and using it I can store input.nextInt() in 2D Array right away
        String [][] book = new String [input.nextInt()][];
        System.out.println(Arrays.deepToString(book));

        // 2. I know I will use nextLine() after nextInt(), so I need to add empty nextLine() to handle an issue
        input.nextLine();

        // 3. To loop through the 2D Array, we need to add things/use indexes, so NO for each loop
        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter"+(i+1));    // we want to say chapter 1,2,3,4,5, right now i=0, so we +1
            String chapter = input.nextLine();

        // 4. To break up sentences by the dot and store into a book
            String [] sentences = chapter.split("!");
            book[i] = sentences;
        }
        System.out.println(Arrays.deepToString(book));













    }
}
