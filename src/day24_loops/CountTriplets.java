package day24_loops;

import java.util.Scanner;

public class CountTriplets {

        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            //WRITE YOUR CODE BELOW
            //"aaabbbcccccddddeeeeee"

            int endIndex = str.length();

            int numberOfTriples = 0;
            str += " ";

            for (int i = 0; i < endIndex; i++ ) {

                if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
                    numberOfTriples++;
                }


            }
            System.out.print(numberOfTriples);
        }
    }

