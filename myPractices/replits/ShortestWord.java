package replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ShortestWord {
    /*
    Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
     */
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        //To create an array w/ .split() method
        str = str.trim();
        String[] arr = str.split(",");
        System.out.println(Arrays.toString(arr));

        //To create an empty String container where all the short words will be stored
        String shortWords = "";

        //To create an element to compare w/
        String shortiest = arr[0];

        //To loop through an array and find the shortes words
        for (String each : arr) {
            if (each.length() < shortiest.length()) {
                shortiest = each;
            }
        }
        //To create the ArrayList(Collections type) to be able to use .removeIf() m-thod
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        String finalShortiest = shortiest;
        list.removeIf(each -> each.length() != finalShortiest.length());
        System.out.println(list);


    }


}


