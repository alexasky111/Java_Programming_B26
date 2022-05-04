package day23_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        /* pick three color and make a line at the end of all unique ones
        */

        Scanner input = new Scanner(System.in);

        int colorsPicked = 0; // indexes start from zero -> zero iteration, 1 iteration, 2 iteration
        String uniqueColors = "";

        while(colorsPicked < 3) {

            System.out.println("Pick a color");
            String color1 = input.next();
            System.out.println(color1);


         if(uniqueColors.contains(color1)){
             System.out.println("You already have tha color");
         } else {

             uniqueColors += color1 + " ";
             colorsPicked++;

         }


        }

        System.out.println(uniqueColors);


    }
}
