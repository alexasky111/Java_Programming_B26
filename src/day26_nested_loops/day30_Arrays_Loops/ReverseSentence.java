package day26_nested_loops.day30_Arrays_Loops;

public class ReverseSentence {
    public static void main(String[] args) {
            /*
        Given a sentence
            today is monday

         reverse the sentence
            monday is today
     */

        String str = "Today is Monday, we learned String methods";

        String [] words = str.split(" ");
        String reversed = "";

        for (int i = words.length-1; i >= 0 ; i--) { // because we are going backwards

            reversed += words[i] + " ";

            }
        System.out.println(reversed.trim());
        }




    }

