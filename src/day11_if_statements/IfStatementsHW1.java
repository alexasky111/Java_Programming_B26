package day11_if_statements;

import java.util.Scanner;

public class IfStatementsHW1 {
    /*
    Do all tasks hardcoded at least, then make them more dynamic with Scanner
________________________________________________________________________
Create two number variables
Find and print which number is bigger between the two
ex:
50
45
output:
50 is bigger
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number one: ");
        int num1 = input.nextInt();
        System.out.println("Enter number two: ");
        int num2 = input.nextInt();

//        if(num1>num2){
//            System.out.println(num1+" number one is bigger");
//        }
//        else{
//            System.out.println(num2+" number two is bigger");
//        }
    String message;
        message = num1>num2? num1+"number one is bigger" : num2+"number two is bigger";

        }
        }

