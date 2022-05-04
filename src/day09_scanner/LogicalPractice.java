package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {

        int n = 20; // if it is btw 1 and 10

        System.out.println(n > 5);
        System.out.println(n < 10);

        System.out.println(n > 5 && n < 10); // true && false -> false, both of them need to be true to be True, otherwise False always

        System.out.println(4 > 3 || false); // true || false
        System.out.println(3 > 4 || false); // false || false

        System.out.println(!false); // to change "false" w/ NOT=! the output is "true"
        System.out.println(!true);
        System.out.println(4 != 4);

            }
}
