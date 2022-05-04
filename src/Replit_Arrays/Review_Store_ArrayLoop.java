package Replit_Arrays;

public class Review_Store_ArrayLoop {
    public static void main(String[] args) {
        String [] items = {"shoes", "jackets", "gloves"};
        double [] prices = {89.99, 150.0, 999.99};
        int [] itemsID = {12345, 12346, 12347};

        //print the catalog

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID"+itemsID[i]+" are "+items[i]+ " and they cost $"+prices[i]);
        }

        // find if it contains "gloves"
        int indexOfGloves = -1; //you can start w/ 0 -> -1 in case it doesn't find it it'll print -1
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")) {
                indexOfGloves = i;
                break;

            }
        }
        System.out.println(indexOfGloves);

        // find and print the info of the most expensive item (IDEA ABOUT MAX AND MIn)
        System.out.println();

        double mostExpensive = prices[0];
        int indexOfMostExpensive = 0;
        for (int i = 0; i < items.length; i++) {
            if(prices[i] > mostExpensive){
                mostExpensive = prices[i];
                indexOfMostExpensive = i;
            }
     }
        System.out.println("Item: "+items[indexOfMostExpensive]);
        System.out.println("Item Id: "+itemsID[indexOfMostExpensive]);
        System.out.println("Price: "+prices[indexOfMostExpensive]);








    }
}
