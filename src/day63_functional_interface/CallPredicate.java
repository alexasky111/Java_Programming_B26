package day63_functional_interface;

public class CallPredicate {
    public static void main(String[] args) {
        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);
        //test() -> an abstract method defined in Functional Interface
        System.out.println(UsePredicate.isPalindrome.test("abc"));
        System.out.println(UsePredicate.isPrime.test(5));

    }
}
