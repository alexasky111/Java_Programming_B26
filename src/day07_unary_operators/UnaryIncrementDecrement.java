package day07_unary_operators;

public class UnaryIncrementDecrement {

    public static void main(String[] args) {

        int a = 7;


       String random = ("I have: "+ a++ +"bananas,\nI plan on buying: "+ a++ +"apples"+a+ a-- + a); //got it
        System.out.println(random);

//        a++; --a; ++a; --a;  //not in the string, so works like regular +,-
        System.out.println(a);
    }
}
