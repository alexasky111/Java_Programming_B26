package day08_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {


        int b = 10; // b = 10
        b++; // post increment it will just increment the number-value it's going to just add one no printing, no other code -> 11
        System.out.println(b); // this will print the value of "b" so it is 11 now
        b--; // post decrement, there is no other code/printing in this line, so we subtract 1, so the values is -> 10
        System.out.println(b); // this will print the value of "b" so it is 10
        System.out.println(b++); // now there is a code-printing "()", so we get the value first, so it is holding the value of 10, and we print it, and it is still 10
        //post increment means get the current value and use it and after will add to it
        System.out.println(b++); //now it is finally printed, so it is 11 ->10 + 1

        // b++ holds the value of "12", but will never get it unless we print it->System.out.println(a) !!!
    }
}
