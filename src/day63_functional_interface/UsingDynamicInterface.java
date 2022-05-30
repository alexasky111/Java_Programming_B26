package day63_functional_interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface<String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };
        printEachChar.test("hello world");

        DynamicInterface<Integer> printNumbers5Times = n ->{
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };
        printNumbers5Times.test(10);




    }
}
