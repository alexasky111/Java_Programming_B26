package day24_loops;

public class CountChar {
    public static void main(String[] args) {
        /*
        Given a String, find and print how many uppercase letter, lowercase
letter, and number are in the String.
Ex:
Input: 2juMp41EEkd4s4
Output:
3 uppercase letters
6 lowercase letters
5 numbers
         */

        String str = "2juMp41EEkd4s4"; // I need somewhere to store how many upper case, lower case and numbers

        int upperCounter = 0;
        int lowerCounter = 0;
        int numberCounter = 0;

        for(int i = 0; i < str.length(); i++) {
           char letter = str.charAt(i); // how do you read a character one at a time; why assigned the variable --> to not keep repeating the method

           // get the character at the index num i for this iteration, stores into the variable letter for re-usability



            if (letter >= 'A' && letter <= 'Z'){
                upperCounter++;
            } else if (letter >= 'a' && letter <= 'z') {
                lowerCounter++;
            } else if (letter >= '0' && letter <= '9') { // 9 --> because we look for single characters one at a time, 10 --> already 2 characters
                numberCounter++;
            }
        }

        // the purpose of the loop was to check every character and see is it uppercase, lowercase or number. We want the loop to finish which means every character was checked. Then we will print one time after the loop the results

        System.out.println("Uppercase characters: "+upperCounter);
        System.out.println("Lowercase characters: "+lowerCounter);
        System.out.println("Numbers: "+numberCounter);









    }
}
