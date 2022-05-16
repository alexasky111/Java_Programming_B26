package Interview_Questions;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String sentence = "Java is the best programming language";
        String word = "java";

        System.out.println(containJava(sentence,word));
        System.out.println(sumOfDigits(555));

        int [] arr = {0, 2, 0, 0, 0, 3, 4, 5};
        System.out.println(Arrays.toString(moveZeroes(arr)));

    }
    /*
    Write a program that determines if the given sentence contains the given word (Do not use contains() method)

                   Ex;
                   Input: String sentence = "Java is the best programming language"
                          String word = "Java";
                   Output: true
     */
    public static boolean containJava(String sentence, String word){

        String [] arr = sentence.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(word)){
                return true;
            }
        }

        return false;
    }
    /*
      Write a program that can return the sum of digits of an integer. Do not use any string manipulations.

                 Ex;
                 Input: 123
                 Output: 6
     */
    public static int sumOfDigits(int num){

        String str = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            sum += Integer.parseInt(str.charAt(i)+"");
        }
        return sum;
    }
    /*
      Task 03 ;   Write a program that can move all the zeros to the end of the List of integers
                Ex;
                   input: [0, 2, 0, 0, 0, 3, 4, 5]
                   output: [2, 3, 4, 5, 0, 0, 0, 0]
     */
    public static int [] moveZeroes(int [] arr){

        int [] fixed = new int [arr.length];
        int index = 0;

       for(int each : arr){
           if(each!=0){
               fixed[index] = each;
               index++;
           }
        }
        return fixed;
    }
}

