package day13_02_29_2022;

public class P01_MainMethodsOverloading {
    public static void main(String[] args) {
        //Can we overload main m-thod?
        //Yes, we can
        System.out.println("Hello from String main"); // STARTING POINT, will run 1st; Java compiler is looking for String parameters
    }
    public static void main(int[] args) {
        System.out.println("Hello from int main");
    }
    public static void main(double[] args) {
        System.out.println("Hello from double main");

    }

    public static void main(char[] args) {
        System.out.println("Hello from char main");

    }
}
