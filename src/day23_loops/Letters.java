package day23_loops;

public class Letters {
    public static void main(String[] args) {

        char lowerCaseUp = 'a';

        while (lowerCaseUp <= 'z') {
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }
        System.out.println(); //empty print

        char uppercaseBack = 'Z'; // int i = 122;

        while (uppercaseBack >= 'A') { // i >= 97;
            System.out.print(uppercaseBack+ " "); //(char)i
            uppercaseBack--;
        }


    }
}
