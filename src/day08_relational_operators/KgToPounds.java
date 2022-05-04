package day08_relational_operators;

public class KgToPounds {
    public static void main(String[] args) {
        /*
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
         */

        double kg = 2.20462;
        int kgOnHand = 55;
        double totalPounds = kg*kgOnHand;

        System.out.println(kgOnHand+" kg equal to "+totalPounds+" pounds");


    }
}
