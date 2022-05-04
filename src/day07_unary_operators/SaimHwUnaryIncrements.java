package day07_unary_operators;

public class SaimHwUnaryIncrements {

    public static void main(String[] args) {

        //Analyze the code only

        int b = 10;
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b++);

        System.out.println("\n");
        int a = 40;
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(--a);
        System.out.println(a--);

        System.out.println("\n");
        int c = 14;
        c--; //stores -1, but still 14
        c++; //becomes 13, but stores +1
        --c; // becomes 13 immediately because of Preincrement
        c--; // stores -1, but still 13
        c++; // How the hell it became 13 again????

        // because it is not in printing yet it's only -,+ if by itself!!!

        System.out.println(c);
            }
}
