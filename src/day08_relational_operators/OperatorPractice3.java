package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {


        int h = 5; // h = 5 -> 6 -> 7 -> 8
        int p = h; // p gets assigned the value of h, which is 5
        // p = 5

        h++; // post increment, no other code so it adds 1

        System.out.println("h"+h);
        System.out.println("p"+p);

        int k = h++; // post increment -> we get the value first, which is 6 and assign it to the new variable k, so k has the value of 6. Then h adds 1

        System.out.println(h);
        System.out.println(k);

        int g = ++h; // pre increment, it adds 1 right away, and then it assigns the value from h to the new variable g

        System.out.println(h);
        System.out.println(g);









    }
}
