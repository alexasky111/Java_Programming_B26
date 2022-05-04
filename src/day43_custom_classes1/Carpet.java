package day43_custom_classes1;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(boolean inputPersian, double inputWidth, double inputLength, double inputUitPrice) {
        width = inputWidth;
        length = inputLength;
        isPersian = inputPersian;
        unitPrice = inputUitPrice;

        calculatePrice();

    }
//This method does the calculation for us
    public void calculatePrice() {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }
    public String toString(){
        //Ternary has to be in () bc it is a separate condition, but it is included in the main printing statement
        return (isPersian ? "The Persian Carpet " : "Carpet ") + "\nhas dimensions of "+length+" x "+ width+ "\nThe unit price "+unitPrice+"\nAll coming to a total of $"+totalPrice;
    }

}
