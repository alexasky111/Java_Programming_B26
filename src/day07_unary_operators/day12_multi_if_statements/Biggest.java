package day07_unary_operators.day12_multi_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
//        int num1 = 20;
//        int num2 = 20;
//        int num3 = 20;

    // you have to add == to get the result in case they are the same !
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>=num2 && num1>=num3) {
            System.out.println(num1+" is the biggest");
        } else if (num2>=num1 && num2>=num3) {
            System.out.println(num2+" is the biggest");
        } else { System.out.println(num3+" is the biggest");
        }  // You don't have to put else, it's not wrong, but you can assume
        }



    }

