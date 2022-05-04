package day04_02_22_2022;

import java.util.Scanner;

public class P01_BMI_Calculator {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in); //multibranch since we have multi condition!

        double mass = 82.4;
        double height = 1.82;
        double BMI = mass/(height*height);

        String result = "";

//        if(BMI<18.5){
//            result="Underweight";
//        } else if (BMI>=18.5 && BMI<25){
//            result = "Normal weight";
//        } else if (BMI>=25 && BMI<30) {
//            result = "Overweight";
//        } else {
//           result = "Obese";
//        }


        result = (BMI<18.5) ? "Underweight": (BMI>=18.5 && BMI<25)? "Normal weight": (BMI>=25 && BMI<30)? "Overweight": "Obese";
        System.out.println(result);









    }
}
