package day14_nested_if_statements;

import java.util.Scanner;

public class NestedIfHW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please pick duration of the movie: " );
        double durationOfTheMovie = input.nextDouble();
        String message = ""; double price;

        if(durationOfTheMovie >= 1 && durationOfTheMovie<=4){
            System.out.println("Please wait a moment !");
         if (durationOfTheMovie==1) {
            price = 8.99;
            message = "The price of the movie is "+ price;}
         else if (durationOfTheMovie==1.5){
             price = 10.50;
             message = "The price of the movie is "+price;
         } else if (durationOfTheMovie==2.0) {
             price = 12.99;
             message = "The price of the movie is "+price;
         } else if (durationOfTheMovie==2.5) {
             price = 14.50;
             message = "The price of the movie is "+price;
         } else if (durationOfTheMovie == 3 || durationOfTheMovie == 3.5 || durationOfTheMovie == 4) {
             price = 15.99;
             message = "The price of the movie is "+price;
         }
            System.out.println(message);
        } else {
            message = "Not Found. Please try again";
            if(durationOfTheMovie<=0){
                message = "Movies cannot be less than 0 minutes";
            } if (durationOfTheMovie>4){
                message = "Movies cannot be more than 4 hours";
            }
            System.out.println(message);
        }



    }
}
