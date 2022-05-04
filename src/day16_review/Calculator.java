package day16_review;

import java.util.Scanner;

public class Calculator {
    /*
declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other char: "invalid operator"
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1");
        double num1 = input.nextDouble();
        System.out.println("Pick operators: + - / %");
        String operator = input.next();
        System.out.println("Enter num 2");
        double num2 = input.nextDouble();
        
        boolean validCalc = true;

        double result = 0;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/": // to avoid division by "0"
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("cannot divide by 0");
                    validCalc = false;
                }
                break;
            case "%":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by 0");
                    validCalc = false;
                }
                break;
                
            default:
                System.out.println(operator+" is not valid ");
                validCalc = false;

        }
        if(validCalc) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

    }
}
