package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a url");

        String url = input.next();
        String website = url.substring(4, url.length()-4);

        System.out.println("Your web title is "+website);

        //String website = url.substring(4, 10); -> doesn't work for all inputs





    }
}
