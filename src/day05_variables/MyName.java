package day05_variables;

import org.w3c.dom.ls.LSOutput;

public class MyName {
    public static void main(String[] args) {
        char letterOne = 'S';
        char letterTwo = 'a';
        char letterThree = 's';
        char letterFour = 'h';
        char letterFive = 'a';

        System.out.println("\n"+letterOne+"\n"+letterTwo+"\n"+letterThree+"\n"+letterFour+"\n"+letterFive);

        System.out.println("My name is "+letterOne+letterTwo+letterThree+letterFour+letterFive);
        // or you can make a variable of the name

        String name = ""+letterOne+letterTwo+letterThree+letterFour+letterFive;  //"" - is just a space to get a result as a String!

        System.out.println("My name: "+name);

    }




}
