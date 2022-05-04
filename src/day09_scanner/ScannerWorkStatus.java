package day09_scanner;
import java.util.Scanner;
public class ScannerWorkStatus {

    public static void main(String[] args) {
Scanner input = new Scanner (System.in);

        System.out.println("What's your first name: ");
        String firstName = input.next();

        System.out.println("What's your last name: ");
        String lastName = input.next();

        System.out.println("Are you employed? ");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Are you a student? ");
        boolean isStudent = input.nextBoolean();

String details = firstName+" "+lastName+" is employed: "+isEmployed+ " is a student "+isStudent;
        System.out.println(details);

    }
}
