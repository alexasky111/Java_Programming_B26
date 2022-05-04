package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

//different class, different package
//with inheritance

public class Four extends First{
    public static void main(String[] args) {
        First obj1 = new First();
        System.out.println(obj1.one);
//        System.out.println(obj1.two);
//        System.out.println(obj1.three);
//        System.out.println(obj1.four);
        Four obj2 = new Four();
        System.out.println(obj2.one);//public
        System.out.println(obj2.two); //protected
    }
      /*

    line 13 is trying to directly access a protected variable outside of the package. You cannot directly access any protected information outside of the package

    line 19 we are able to access the two variable because it is inherited from the First class to the Four class, so the two variable belongs to the objects of the Four class (sub class)

     */
}
