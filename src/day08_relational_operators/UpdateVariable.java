package day08_relational_operators;

public class UpdateVariable {

    public static void main(String[] args) {

        // adding 1 to a variable
        int a = 10;
        a++;
        ++a;
        a = a + 1;

        // add 10 to the variable

        int b = 4;
        // 10 times I write b++;
        b = 14;
        b = b + 10; //reads the value b, adds 10 to it, then the result is store back into be by reassigning
        b += 10; // this code is the same as --> b = b + 10;

        int count = 0;
        count += 5; // count = count + 5;

        System.out.println(count);

        count-=10; //count = count - 10;

        System.out.println(count);

        count *=2;
        System.out.println(count);





    }
}
