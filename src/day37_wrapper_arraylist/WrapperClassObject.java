package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        // Wrapper classes are mandatory for Array list
        int a = 5;
        //What can we do w/ this: assign/reassign, math, casting
        //What can't we do w/ this: a.method()

        Integer a2 = new Integer(10); // might be depreciated/not supported anymore
        Integer a3 = 20; // ==> Correct way to make Wrapper class ==> Autoboxing: primitive -> object
        int a4 = a3; // Unboxing: object -> primitive
        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b = 2; // primitive type
        Byte b2 = 2; //

    }
}
