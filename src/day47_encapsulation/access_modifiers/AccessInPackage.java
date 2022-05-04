package day47_encapsulation.access_modifiers;

public class AccessInPackage {

    //different Class same package
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        //c & z are private modifiers, not accessible outside the Class
    }
}