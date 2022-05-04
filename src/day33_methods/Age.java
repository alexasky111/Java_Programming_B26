package day33_methods;

import java.util.Scanner;

public class Age {

    public static void getAge(int birthYear){
        System.out.println("Your age is "+(2022-birthYear)+" years old");
    }

    public static void main(String[] args) {
        getAge(1994);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        int age = input.nextInt(); // Could do getAge(input.nextInt());
        getAge(age);
    }
}
