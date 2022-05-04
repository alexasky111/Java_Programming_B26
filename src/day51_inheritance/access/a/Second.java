package day51_inheritance.access.a;

public class Second {

    //different class, same package
    public static void main(String[] args) {
        First obj1 = new First();
        System.out.println(obj1.one);
        System.out.println(obj1.two);
        System.out.println(obj1.three);
//        System.out.println(obj1.four); --> not accessible bc it is private
    }
}
