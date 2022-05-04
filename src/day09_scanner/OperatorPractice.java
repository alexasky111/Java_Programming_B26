package day09_scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class OperatorPractice {
    public static void main(String[] args) {
        int w = 78/ 2 * 2 + 3 - 5 % 5;
        /* w = 39 * 2 + 3 - 5 % 5;
          78 + 3 - 5 % 5;
              78 + 3 - 0;
              w = 81
              */
        int a = 8; // 8 -> 7;
        int b = a--; // -> 8
        System.out.println(a);
        System.out.println(b);

        int L = 50; // 50 -> 49 -> 50 -> 49 -> 50
        int P = --L + L++ + L-- + L++;
        //      49 + 49 + 50 + 49
        System.out.println(L);
        System.out.println(P);

        int R = 20; // -> 20 -> 19 -> 20 -> 19 -> 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20 + -19 + 19 * 19 % 2;

        System.out.println(R);
        System.out.println(W);

        int e = 1; // 1 -> 0 -> 1 -> 0 -> -1
        int f = -e-- + e++ / -e-- * --e;
        // -1 + 0 / -1 * (-1)
        // -1 + 0 = -1

        System.out.println(e);
        System.out.println(f);
    }
}
