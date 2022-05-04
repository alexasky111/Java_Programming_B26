package day47_encapsulation.debit;

public class DebitCard {
     /*
    Debit card - custom classes + static

    Create a class for Debit Card that has the following instance variables:
        card number (long), holder name (String), card type (String), pin (int), and balance (double)

        static variables: account type (debit)
            -> Use static block to initialize account type

        */

    //instance variables
    long cardNumber;
    String holderName, cardType;
    int pin;
    double balance;

    //static variables
    static String accountType;

    //we dont need static block the point is to understand
    static {
        //we can put anything: loops, arrays, arrayLists
        accountType = "Checking";
    }


    /*
    Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance. The card number has to be 16 characters long to be a valid card number. If the length is too short or too big do not store the card number and print “Invalid card number”

    Overload the constructor to take all of the instance variables. The card type must be either MasterCard or Visa to be valid card type. If it is not one of those two then do not store the type and print “invalid card type”. Also the pin must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the instance variable and print “Invalid pin length”

    */
    public DebitCard(long cardNumber, String holderName, double balance) {
        // 'this' reference of the DebitCard objects
        this.holderName = holderName;
        this.balance = balance;
        //To convert long num in the String, we want to know the length/how many digits there is
        if (String.valueOf(cardNumber).length() == 16) { //(""+cardNumber).length()
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number");
        }
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance); // this() is used to chain the constructors
        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")) {
            this.cardType = cardType;
        } else {
            System.out.println("Invalid Card type - Must be Visa or MasterCard");
        }
        //To convert int num in the String, we want to know the length/how many digits there is
        if (String.valueOf(pin).length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Invalid Pin - Must be 4 digits");
        }
    }

    /*

    Add the toString method that will print all of the cards information (Except the pin). If the card type does not have a value do not print that line.

     */
    public String toString() {
        String info = "Holder's Name: " + holderName;
        if (cardNumber != 0) {
            info += "\nCard Number: " + cardNumber;
        }
        if (cardType != null) {
            info += "\nCard Type: " + cardType;
        }
        info += "\nBalance: " + balance;

        return info;
    }
}
