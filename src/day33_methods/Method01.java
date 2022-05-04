package day33_methods;

public class Method01 {
    public static void helloWorld(){
        System.out.println("Hello World");
    }
    // You write it ONE time - you reuse it MULTIPLE
    public static void helloWorld50(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        helloWorld50();
        helloWorld50();

    }
}
