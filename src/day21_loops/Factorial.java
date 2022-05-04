package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int a = 5;
        int result = 1;
        // factorial 5! = 5*4*3*2*1
        // repeated action: is to multiply the numbers
        // stopping point: number gets to 1

        while (a > 1) {
            System.out.println(result + "*"+a);
            result *= a;
            a--;
        }
        System.out.println(result);




    }
}
