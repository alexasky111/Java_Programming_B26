package day28_arrays_intro;

import java.util.Scanner;

public class StoreTask_ButScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter which item are you looking for? ");
        String lookingFor = input.nextLine();
        String [] items = {"shoes", "jacket", "gloves", "airpods", "IPad"};

        //Im going to say it is not in stock until I find that it is and im going one loop at the time
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(lookingFor)) {
                inStock = true;
                break;
            }

        }

        System.out.println(lookingFor + (inStock ? " in stock" : "not in stock"));


    }
}
