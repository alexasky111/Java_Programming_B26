package day04_04_25_2022.A;

public class Second {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
      //  System.out.println(obj.d); -> protected var

        System.out.println(First.e); //have to be called through a Class because it is not in the same Class where was declared
    }
}
