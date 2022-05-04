package day09_scanner;

public class ShortCircuit {
    public static void main(String[] args) {

//        System.out.println(5 / 0);
        System.out.println(true || 5/ 0 == 0);
//        System.out.println(true | 5/0 == 0); error
        System.out.println(false && 5/0 == 0);
//        System.out.println(false & 5/0 == 0); error

        int a = 0;

        System.out.println(false && a++ == 5);// double circuit => from the execution sides if you know the result it doesn't do the both sides, when you go outside you check if it's raining and the temperature => if it is raining you won't go outside

        System.out.println(a);

        int b= 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);

    }
}
