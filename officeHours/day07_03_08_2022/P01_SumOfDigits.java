package day07_03_08_2022;

public class P01_SumOfDigits {
    public static void main(String[] args) {
        /*

       for (init;condition;frequency of iteration) {
       //statements
            if(){
                 if(){
       switch(){
            }
        }
         }
             }
             init ---> int i =0 (i,j,k)
             condition ---> true/false i<5
             iteration ---> inc/dec i++, i-- i+=2 i+=10 .....
         */

        String word = "Cydeo School";
        // C y d e o
        // 0 1 2 3 4
        // if you know the length ---> for loop || if not---> do,while
        // curly brackets are the scope

        String result = word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4);
        System.out.println(result);
        result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i) + " ";
        }

        System.out.println(result);
        System.out.println("--------Reversed word----------");

        for (int i = word.length() - 1; i >= 0; i--) { // to reverse from the end
            System.out.print(word.charAt(i));

        }
        // word.length().for --> will give you option to create for loops
        System.out.println("----Print out only Cydeo----");


        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ' ') {
                continue; // if put continue; we'll
            }
            System.out.print(word.charAt(i)); // while i->5 we have empty space, and we'll see Cydeo
        }


    }
}
