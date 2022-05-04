package day33_methods;

public class Recap_Multidimensional_EachLoop {
    public static void main(String[] args) {
        /*
        Given a 2D String array, concatenate the last character of each inner
element on one line, then each following array values in separate lines
Ex:
{"James", "is", "back"}
{"he", "was", "never", "gone"}
{"methods", "tomorrow"}
Output:
ssk
esre
sw
         */

        String [][] words = {
            {"James", "is", "back"},
            {"he", "was", "never", "gone"},
            {"methods", "tomorrow"},
        };
        for (String [] eachArray : words) {

            // 1. To go through each word in each Array
            for (String eachWord : eachArray) {

            // 2. To access the last characters of eachWord
                System.out.print(eachWord.charAt(eachWord.length()-1));
            }
            System.out.println();

        }















    }
}
