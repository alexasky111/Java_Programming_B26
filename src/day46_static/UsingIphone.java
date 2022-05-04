package day46_static;

public class UsingIphone {
    public static void main(String[] args) {
        Iphone phone = new Iphone("iphone X", 1000);
        System.out.println(phone);

        Iphone iphone2 = new Iphone("Iphone 11", 1200);
        System.out.println(iphone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
    }

}
