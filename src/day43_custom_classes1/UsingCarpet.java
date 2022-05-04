package day43_custom_classes1;

public class UsingCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(true, 8.5, 12,2.5);
        System.out.println(carpet1);

        //To reassign the carpet lengthfrom 12 to 14
        carpet1.length = 14;
        carpet1.calculatePrice();
        //To only see the changed price after length=14, without a whole printing statement
        System.out.println(carpet1.totalPrice);

    }
}
