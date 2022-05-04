package day06_arithmetic__operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4; // it'll read as 5.0, 4.0

        double addition = num1+num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1/num2;
        double remainder = num1 % num2;
        /* 10 / 3 = 3.3333
           10 % 3 = 1 - remainder

        */

        System.out.println(num1+" + "+num2+ " = "+addition);
        System.out.println(num1+" + "+num2+ " = "+subtraction);
        System.out.println(num1+" + "+num2+ " = "+multiplication);
        System.out.println(num1+" + "+num2+ " = "+division);
        System.out.println(num1+" + "+num2+ " = "+remainder);

//        System.out.println(num1+" + "+num2+ " = "+(num1+num2)); - will give the same result
    }
}
