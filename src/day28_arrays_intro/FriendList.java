package day28_arrays_intro;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have? ");
        int numberOfFriends = input.nextInt();

        String [] friendList = new String [numberOfFriends]; // My size of the Array is based on the Scanner

        for (int i = 0; i < friendList.length; i++) { // friendList.length --> the length of my Array
            System.out.println("Enter your friends name: "+ (i + 1)); // --> starts w/ 0+1->1+1->2+1
            friendList[i] = input.next(); // in a friendList I'm storing position of i

        }
        System.out.println(Arrays.toString(friendList));






    }
}
