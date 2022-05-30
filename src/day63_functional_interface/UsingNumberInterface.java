package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {
        //NumberInterface evenOrOdd = (n) -> {}; 'n' is just a name for number

        NumberInterface evenOrOdd = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };
        evenOrOdd.apply(20);
        evenOrOdd.apply(25);

        NumberInterface cube = (number) -> {
            System.out.println(number+number+number);
        };

        cube.apply(3); //27
        cube.apply(4); //64
    }
}
