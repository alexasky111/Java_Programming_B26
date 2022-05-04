package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {

        //different class, different package
        First obj1 = new First();
        System.out.println(obj1.one);
//        System.out.println(obj1.two);
//        System.out.println(obj1.three);
//        System.out.println(obj1.four);
    }

    //four is private, only visible in the same class
    //three is default, only visible in the same package
    //two is protected, no inheritance, so no visibility
}
