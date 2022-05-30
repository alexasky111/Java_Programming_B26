package day63_functional_interface;

import java.util.function.Predicate;

public class UsePredicate {
    public static Predicate<String> isPalindrome = (str) -> {
        String reverse = new StringBuilder(str).reverse().toString();//toString() must be added to convert to a String object

        return str.equals(reverse); //this time Functional Interface has a return type -> boolean
    };

    public static Predicate<Integer> isPrime = (number) -> {

        if(number==0 || number==1) return false;

        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    };


}
