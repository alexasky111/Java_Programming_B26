package day36_overloading_method;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }
    //I will try to overload by changing the return type
    // You get overloading by CHANGING the Parameters
//    public static int method(){
//
//    } --> this is not valid changing the return type doesn't overload
    public static int method(int a){
        return 0; // If you did overload method by changing the parameters, you can change the return value, but only after you correctly overload the method
    }
}
