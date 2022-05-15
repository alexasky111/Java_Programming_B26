package day57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("enter a num");
            int num = input.nextInt();
            System.out.println("enter num 2");
            int num2 = input.nextInt();

            System.out.println(num/num2);
        } catch (InputMismatchException e){
            e.printStackTrace(); //shows the exception msg in the console
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());//info/description about the exception
        } finally{
            System.out.println("Finally block");
            input.close();
        }

        System.out.println("Done");

    }
}
