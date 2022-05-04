package day08_relational_operators;

public class Smth {
    public static void main(String[] args) {
        int M = 300; // 300 -> 301 -> 300
        int N = 400; //400 -> 401
        int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println(M);
        System.out.println(N);
        System.out.println(U);


    }



}
