package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x); // 0

        x = x+1;
        System.out.println(x); // 1

        x++; //post increment
        System.out.println(x); // 2

        ++x; // pre increment
        System.out.println(x); //3

        System.out.println(++x);
        System.out.println(x++); // ststement is run 1st because it is a post increment, we will see 4 again
        System.out.println(x); //Only now it'll be +1=> 4+1


            }
}
