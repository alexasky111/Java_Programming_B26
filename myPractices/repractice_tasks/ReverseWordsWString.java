package repractice_tasks;

import java.util.Arrays;

public class ReverseWordsWString {

    public static void main(String[] args) {
        System.out.println(reversedWordOrder("Doe John am I"));
    }

    public static String reversedWordOrder(String str){
        String [] arr = str.split(" ");
        String reversed = "";

        for (int i = arr.length-1; i >=0; i--) {
            reversed += arr[i]+" ";
        }
        return reversed;
    }
}
