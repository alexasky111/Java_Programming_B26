package day34_void_method;

public class VoidVSReturn {
    public static void main(String[] args) {
        //String msg = sayHello() ==> This doesn't work because the method is void
//        System.out.println(sayHello());
        sayHello();

        // You must do smth w/ it; it returns smth but you must do smth
        sayBye(); // ==> still returns "Bye", but I didn't store it anywhere or print yet
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);


    }
    public static void sayHello(){

        System.out.println("Hello");
    }

    public static String sayBye(){
        //when you have a return type you must give a return value
        return "Bye";
    }


}
