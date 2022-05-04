package day04_04_25_2022.B;

import day04_04_25_2022.A.First;

public class Third extends First {
    public static void main(String[] args) {
        First obj = new First();
        Third obj1 = new Third();

        System.out.println(obj.a);
        System.out.println(obj1.b); //protected var is accessible in diff package as long as there is inheritance, we need to create an object from the Sub Class
//        System.out.println(obj.c); -> default
//        System.out.println(obj.d); -> protected

        System.out.println(First.e); //can call in different package, only if has public access modifier
    }
}
