package day08_relational_operators;

public class OperatorPrictice2 {
    public static void main(String[] args) {

        int a = 40; // a = 40 -> 39 -> 38 -> 38 -> 36
        System.out.println(--a); // pre decrement, so we'll subtract right away, then it prints the value of a = 39
        System.out.println(--a); // pre decrement, we'll subtract right away, then it prints the value of a = 38
        System.out.println(a--); // post decrement, first get the current value of a = 38 and print it
        System.out.println(--a); // pre decrement, we'll subtract right away, then it prints the value of a = 36
        System.out.println(--a); // now it is a = 35
        System.out.println(a--); // here it holds the value 36, but it is never printed, so it stays 35
/*
Output so far:
39
38
38
36
35
35
 */

    }
}
