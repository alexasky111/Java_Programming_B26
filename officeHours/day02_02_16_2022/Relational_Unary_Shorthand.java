package day02_02_16_2022;

public class Relational_Unary_Shorthand {
    public static void main(String[] args) {
        // Declaration
        boolean cond = true;
        int a = 10, b =10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("=============== Unary Ops ==============");
        System.out.println("cond = "+ !!!cond); //false

        // Post and Pre inc
        System.out.println("a = " + a);
        // memory --> 11 print -->10
        System.out.println("a = " + a);


    }


}
