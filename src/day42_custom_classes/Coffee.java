package day42_custom_classes;

public class Coffee {

    double price;
    double size;
    String brand;
    String types;

   //prints the info; however you make it this is how copy object will be printed
    public String toString() {
        return types+" from "+brand+" size of "+size+" oz. For a total price of " +price;
    }

    public void drink(){
        System.out.println("Trying "+types+" of coffee");

        size -=1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling "+amount + " oz of coffee");
//        size +=size; size is not changing bc 8 +=8 is happening to local variable size not an instance
        size += amount;
    }
}
