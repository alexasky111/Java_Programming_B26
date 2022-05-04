package day28_arrays_intro;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Which number do you want? ");
        int mon = input.nextInt(); // 4
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(months[mon - 1]); // I accessed one element from my Array --> I didn't print the whole months Array

        //months[3] --> because 4-1=3 [mon-1]

    }
}
