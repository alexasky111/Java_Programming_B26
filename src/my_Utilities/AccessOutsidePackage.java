package my_Utilities;

import day47_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsidePackage {

        //different Class and different Package
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
//        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        //c & z are private and not accessible
        //b & y are default (didn't have any access modifier), so they can only be accessed in the same package
        //what is accessible outside a package --> a & x (public modifier members)
    }
}
