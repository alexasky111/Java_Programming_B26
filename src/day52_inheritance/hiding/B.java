package day52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

//    @Override --> we cannot override the static m-thod, but we can declare this method and the staticMethod from the parent class will become hidden
    public static void staticMethod(){
        System.out.println("Static m-thod from the child class");
    }
}
