package day26_nested_loops;

public class Month {
    public static void main(String[] args) {
        /*
        Go through a whole month, by doing through each week and each day
         */

        for (int week = 1; week <= 4; week++) // days are inside of the weeks so weeks are in the outer loop
        {
            System.out.println("Week: " + week);  //so it'll say week 1 -> week 2 -> week 3
// you can use switch statements to print the name of hte week

            for (int day = 1; day <= 7; day++) {
                System.out.println("\tDay: " + day);
            }
        }
/*
--> loop inside of a loop

 outer loop: is a 1st loop that has another loop inside it
 ---determines how executions of the code you want inside of this block
 ---in our ex: we wanted to run for 4 times, bc there is 4 weeks

 inner loop: loop inside another one
 ---treat this as a normal loop that will be executed from beginning to end Each Iteration of the OUTER loop


 in our ex: it means the days will go from 1 to 7 for every week !
 */

    }
}
