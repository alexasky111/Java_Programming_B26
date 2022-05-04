package day03_02_22_2022;

import java.util.Scanner;

public class MultibranchIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight!");
        double mass = input.nextDouble();
        System.out.println("Please enter your height!");
        double height = input.nextDouble();
        String output = "";

        double BMI = mass/(height*height);

        if (BMI < 18.5) {
            output = "Underweight";
        } else if (BMI==18.5 || BMI<25){
            output = "Normal weight";
        } else if (BMI==25 || BMI<30) {
            output = "Overweight";
        } else if (BMI>=30) {
            output = "Obese";
        }

        System.out.println(output);


    }
}
