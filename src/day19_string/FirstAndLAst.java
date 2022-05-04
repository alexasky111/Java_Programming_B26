package day19_string;

import java.util.Scanner;

public class FirstAndLAst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String str = input.nextLine();

        System.out.println("First char: "+str.charAt(0));
        System.out.println("Last char: "+str.charAt(str.length()-1));//allows to get the last index bc index start w/ "0"




    }
}
