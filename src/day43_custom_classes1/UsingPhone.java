package day43_custom_classes1;

public class UsingPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Iphone X");
        System.out.println(phone1); // this one calls the constructor on line 8 in Phone Class

        Phone phone2 = new Phone("Iphone 12", "Apple");
        System.out.println(phone2); // this one calls the constructor on line 12 in Phone Class

        Phone phone3 = new Phone("Iphone X", "Apple", 64, 5.5);
        System.out.println(phone3); // this one calls the constructor on line 17 in Phone Class





    }
}
