package day07_unary_operators.day12_multi_if_statements;

public class Calculator {
    public static void main(String[] args) {

        /* create a class Calculator

        - do it without Scanner

        declare and assign 2 number variables
        declare and assign a char variable for an operator

        create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
	* : multiply num1 and num2
	/ : divide num1 and num2
        any other char: "invalid operator"
        */

        double num1 = 10;
        double num2 = 20;
        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2 + ": add num1 and num2");
        } else if (operator == '-') {
            System.out.println(num1 - num2 + ": minus num1 and num2");
        } else if (operator == '*') {
            System.out.println(num1 * num2 + ": multiply num1 and num2");
        } else if (operator == '/') {
            System.out.println(num1/num2+": divide num1 and num2");
        } else {
            System.out.println("invalid operator");
        }
    }
}
