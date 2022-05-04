package Replit_Arrays;

public class Review_ReverseSentence_SplitMethod {
    public static void main(String[] args) {

        String sentence = "I love Ukraine";
        String[] arr = sentence.split(" ");
//        String reverse = arr[2]+" "+ arr[1]+" "+arr[0];
//        System.out.println(reverse.toUpperCase());

        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) { reversed += arr[i] + " ";
        }
        System.out.println(reversed.trim());


    }
}
