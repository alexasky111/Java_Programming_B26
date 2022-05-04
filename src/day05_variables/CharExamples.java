package day05_variables;

public class CharExamples {
    public static void main(String[] args) {
        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialCharacter = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialCharacter);

        char letterThree = 65;
        System.out.println(letterThree);
        //after the assigned variable value we'll get "A" as an output, but normally we'll do char letterThree = 'A';
        //char letterThree = '65'; this is completely wrong because there are 2 characters

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialCharacter); // this line is doing math because every character has a number value; original: (a=97)+(Z=90)+(A=65)+(9=57)+($=36) = 345!!!

        System.out.println(letterOne + " "+ letterTwo + " " + letterThree + " " + numberOne +" " + specialCharacter); //spaces between each character will put char characters in a line w/ spaces

        // to just see the characters
        System.out.println("chars: "+letterOne + letterTwo + letterThree + numberOne + specialCharacter); //string at the beginning makes all the char characters be in a string without putting quotations all the time
    }
}
