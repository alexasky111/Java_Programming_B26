package day52_inheritance.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod();
        System.out.println();
        B obj2 = new B();
        obj2.instanceMethodA();
        B.staticMethod();
    }
}
