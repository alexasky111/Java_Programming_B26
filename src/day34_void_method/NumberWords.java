package day34_void_method;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        System.out.println(numberAsWord(10));

        //To use Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //To use Scanner method inside of the argument
        System.out.println(numberAsWord(input.nextInt()));

        /*
        The method returns String, so we must store into a String
        String num = numberAsWord(input.nextInt());
         */
    }

    public static String numberAsWord (int num){

        //If my num is less than 0 or more than 10
        if(num < 1 || num > 10){
            return num + " is an invalid number";
        }

        // input is int; output is String; the first variable is what it is returning
        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        //if the num is 1, it does 1-1=0 -> goes to position Zero="One" etc
        return words[num-1];





    }
}
