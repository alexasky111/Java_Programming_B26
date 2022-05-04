package day21_loops;

public class HW_01 {
    /*
    While Loop Practice

write a program that will print all the alphabet letters in lowercase from 'a' to 'z'

     */
    public static void main(String[] args) {

        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println(" ");
        char letter2 = 'A';

        while (letter2 <= 'Z') {
            System.out.print(letter2 + " ");
            letter2++;

            char letter3 = 'z';
            while (letter3 >= 'a') ;
            {
                System.out.print(letter3 + " ");
                letter3--;
            }


        }

    }
}



