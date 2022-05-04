package day05_variables;

public class Computer {
    /*Create a class named Computer
create a main method

    - Create variables with most appropriate datatypes:

        - brand, processor, ram memory, storage memory, has monitor, has wifi card, description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0

        - Print out all the variables and values of the computer */
    public static void main(String[] args) {
        String brand, description, color, ramMemory, typeOfUsb;
        int storageMemory, cpu, numberOfMonitors, numberOfUsbSlots;
        boolean hasWifiCard, hasUsb3_0;

        brand = "Apple";
        description = "has everything you need";
        color = "white";
        ramMemory = "128GB";
        storageMemory = 128;
        cpu = 128;
        numberOfMonitors = 2;
        numberOfUsbSlots = 2;
        hasWifiCard = true;
        hasUsb3_0 = true;


        System.out.println("I've purchased "+brand+" computer w/ "+storageMemory+"GB of storage memory.\nIt also is "+color+" and "+description+".\nIt's ram memory is "+ramMemory+".\nApple has type of usb: "+"."+"\nIt has cpu: "+cpu+"."+"\nAlso the number of monitors is "+numberOfMonitors+"\nThe number of usb slots is "+numberOfUsbSlots+"\nIt also has a WifiCard: "+hasWifiCard+"\nAnd also has Usb 3.0: "+hasUsb3_0);

    }

}

