package replits;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAtack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write your code below this line.
        int length = inhabitants.length; //to have a dynamic size of a new array
        int day = 0; //to have a var that will count days till population is zero
        int sum; //to have a boolean condition in the loop
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants)); //1st statement to be printed
        //[3, 6, 0, 4, 3, 2, 7, 0]
        do {
            day++;
            sum = 0; //we need a variable to have a condition in the while loop
            int[] fixed = Arrays.copyOf(inhabitants, length); //Arrays.copyOf(values of the array below, the size of new array)
            for (int i = 0; i < length; i++) {

                //if an element in the arr = 0 and it is not in the 1st or last position in the arr, then
                //the value of element bf this one /=2 and the value of element after this one /=2
                if (inhabitants[i] == 0 && i != 0 && i != length - 1) {
                    fixed[i - 1] = inhabitants[i - 1] / 2;
                    fixed[i + 1] = inhabitants[i + 1] / 2;
                    //if 1st element in the arr = 0, then the value of element next to it /=2
                } else if (i == 0 && inhabitants[i] == 0) {
                    fixed[i + 1] = inhabitants[i + 1] / 2;
                    //if last element in the arr = 0, then the value of element before it /=2
                } else if (i == length - 1 && inhabitants[i] == 0) {
                    fixed[i - 1] = inhabitants[i - 1] / 2;
                }
            }
            for (int j = 0; j < length; j++) {
                inhabitants[j] = fixed[j]; //to load all the new values back
            }

            for (int each : inhabitants) {
                sum += each; //we will add all the values of the elements in the arr
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            if (sum == 0) { //after all the values are added the sum == 0, loop stops
                System.out.println("---- EXTINCT ----");
                break;
            }

        } while (sum != 0);


    }

}

