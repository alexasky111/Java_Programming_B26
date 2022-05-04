package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2022";
        //normal concatenation
        System.out.println("This year "+year);
        System.out.println("Next year will be "+ (year+1));

        //Using Parse method==>takes String and coverts/returns into an int number type
        int numYear = Integer.parseInt(year);

        System.out.println("This year "+numYear);
        System.out.println("Next year will be "+(numYear +1));

        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); // I am x years old
        //no matter what they type in 5 years you'll be $ageIn5Years

        //1. To get the number from the String first->convert to String Array and pull out the 2nd element in the Array
        String agePart = str.split(" ")[2];
        /*
        OR: String [] arr = str.split(" ");
            String agePart = arr[2];
         */
        int age = Integer.parseInt(agePart);
        System.out.println("In 5 years I will be "+(agePart+5));
    }
}
