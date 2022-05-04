package day52_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);//static var so I access through the Class
        //FinalExample.PLANET = "Mars";

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a); //can access both but can't reassign
        System.out.println(obj.b);

        FinalExample obj2 = new FinalExample(108);
        System.out.println(obj2.b);

        /*
        obj and obj2 were separeta obj. Each obj has its own copy of instance var a and b both are final so they cannot be changed.
        a was hardcoded to be 5 in the class
        b was assigned in the constructor call
         */
    }
}
