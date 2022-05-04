package day28_arrays_intro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // int[] myList = {1,2,3,4,5}; --> the length and values are known
        // int[] scores = new int[4];
/*                   -> Arrays hold the multiple values <-
It is a data structure, which is a collection of data in one object. Before we had normal variables that stored one piece of info at a time. Arrays are objects
                     -> How to create Arrays <-
1) datatype [] arrayName = { }; --> we are able to make an array w/ initial elements. These elements are given btw the curly brackets. Each element is separated by a comma
           Ex. int [] nums = {1,2,3,4,5};
           TO GET THE LAST INDEX: --> arrayName[ arrayName.length - 1 ]
2) datatype [] arrayName = new dtaType [size]; --> able to make an array of a certain size. These elements have a default value. There is elements created for each position in the array
            Ex. String [] cities = new String [5]; [null, null, null, null, null]
            int [] nums = new int [4]; [0, 0, 0, 0]
                Q: What i the diff btw null and "" (empty space)

Default values for array types:
                String --> null
                int --> 0
                double --> 0.0
                boolean --> false

                null means nothing, for objects
                empty space is a String, but it has no characters


 */

// w/ normal variables
        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree = "Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

// declare Array w/ values
        String [] cities = {"Chicago", "NY", "Houston", "Denver", "Pittsburgh" }; //every variable/value is an element --> we defined 5 elements, we have 5 variables, the length is 5 || the element of arrays is the data ||

//        String [] cities2 = {cityOne,cityTwo,cityThree,cityFour,cityFive};  -->you can print w/ variables as well if you got them from somewhere else

// The main thing How to store to the Array -> How to get the information to the Array
        System.out.println(cities[0]); // --> to access the 1st element of Array
        System.out.println(cities[1]); // --> to access the 2nd element of Array
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
//        System.out.println(cities[5]); --> out of bonds(Index 5 out of bounds for length 5)

        // print all the cities in one line
        System.out.println("Reverse order of the cities: " + cities[4] + ", "+cities[3]+ ", "+cities[2]+", "+cities[1]+", "+cities[0]);  // <- How to access each element


        // print the array all at one time
        System.out.println(cities); //this doesn't print the array how we want
        System.out.println(Arrays.toString(cities)); //this method from Arrays Class lets you print the Array fully

        // number of elements in the Array
        System.out.println(cities.length);
    }
}
