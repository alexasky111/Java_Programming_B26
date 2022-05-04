package day18_string_continue;


import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a message: ");
        String message = input.nextLine(); // input.nextLine().toLowerCase().trim(); - THE SAME
        message = message.toLowerCase(); // in case you type all UPPER case
        message = message.trim();

        if (message.contains("java is bad") || message.contains("have fun") || message.contains("crying") )
        {
            System.out.println("Message failed to send");
        }
        else {
            System.out.println(message + "Message was sent");
        }


    }
}
