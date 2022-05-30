package day63_functional_interface.homework;

import java.util.function.Consumer;

public class Task03 {
    public static void main(String[] args) {

        //1.1 Create a function that prints the first and last element of an array


        Consumer<int[]> printFirstAndLast = (n) -> {
            System.out.println(n[0]);
            System.out.println(n[n.length - 1]);
        };
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        printFirstAndLast.accept(arr);
        //1.2 Create a function that prints the middle character/s of a String
        String name = "Alexandraq11w";
        Consumer<String> printMiddleChar = (s) -> {
            int mid = s.length()/2;
            if(s.length()%2==0){
                char firstMiddle = s.charAt(mid-1);
                char secondMiddle = s.charAt(mid);
                System.out.println(firstMiddle+secondMiddle);
            } else {
                char middle = s.charAt(s.length()/2);
                System.out.println(middle);
            }

        };
        printMiddleChar.accept(name);
    }

}
