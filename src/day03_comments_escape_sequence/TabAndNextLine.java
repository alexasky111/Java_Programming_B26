package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed once");
        System.out.println("\t\tThis was tabbed twice");
        System.out.println("    This was tabbed once without escape");
        //examp-les of next lines
        System.out.println();
        System.out.println("1) Go to store");
        System.out.println("2) Grab milk");
        System.out.println("3) Wash car");
        System.out.println("\n1) Go to store\n2) Grab milk \n3) Wash car");
    }
}
