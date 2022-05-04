package day22_forloop_wstrings;
// write down everything from the topic in the piece of paper and see what's missing and start from there

public class ForLoopPractice {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++ ) {// declare inside of the loop
            System.out.println(i);
        }

        /*
        int i  =  0;              i  <  20;                      i++
where do we start; where are we going; how do we get there
           int i  =  20;             i  >  0;                        i--
         */

/*
"For Loop is used when there is a fixed number of iterations"
for(initialization; boolean condition; update) {
// stetements
}
flow of for loop
----------------
1) the loop executes the initialization part to declare and assign a variable
initialization: int i = 1;
initializatin part runs once in the beginning -->
-----------------
2) the boolean/termination condition is checked --> if "T" the loop executes the statements; if "F" the loop will stop
------------------
In our example: i <= 10;
3) the statements in the code are executed top-to-bottom
in our example: System.out.println(i);
------------------
4)update happens: i++ can be ++i
------------------
5) goes back to step 2 and repeats !

 */








    }
}
