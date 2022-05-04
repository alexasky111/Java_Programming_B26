package day33_methods;

public class CountNumbers {
    public static void count(int number){ //the parameter is used as a stopping point for my loop
        for (int i = 0; i <= number; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        count(5);
        count(10);

        //The boolean is never true, so it won't print anything
        count(-100);
    }
}
