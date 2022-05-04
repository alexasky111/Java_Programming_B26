package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Hobby {
    /*
      create a class called Hobby

        - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)
            */
    String name;
    double annualCost;
    Boolean isOutdoors, requiresOthers;


    /* - constructor

            - create a constructor that creates a Hobby object with the name

            - create a constructor that creates a Hobby object with the name and annual cost

            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
*/
    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }


    /*      - method:

              - doIt():
                  print: Doing $name-of-hobby $outside-or-inside

              - toString()
                  print all the Hobby information
                  */
    public void doIt() {
        String res = "Doing " + name;

        if(isOutdoors != null) {
            res += (isOutdoors ? ". His hobby is outdoors. " : " His hobby is indoors. ");
        }
        System.out.println(res);
    }

    public String toString() {
        String res = name + " | ";

        if (annualCost != 0) {
            res += annualCost + " | ";
        }

        if (isOutdoors != null) {
            res += isOutdoors ? " His hobby is outdoors. | " : " His hobby is indoors. | ";
        }
        if (requiresOthers != null) {
            res += requiresOthers ? " His hobby requires others." : " His hobby doesn't require others.";
        }
        res += "\n";

        return res;

    }


}
    /*Create a separate class to create and test the Hobby objects

        - create an java.util.ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually

Q: What is some difference between Array and ArrayList
Q: How does our custom class objects work with ArrayList
Q: What is an object
Q: How does removeIf method work
Q: How does Arrays.asList method work
     */

