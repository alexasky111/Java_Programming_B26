package Replit_Arrays;

public class Review_InitialsOfNAmes {
    public static void main(String[] args) {
        String [] names = {"James Bond", "Alexa P", "Vova Gochak"};

        for (String each : names) {

            String lastNAme = each.substring(each.indexOf(" ")+1);
            System.out.println("" + each.charAt(0) + lastNAme.charAt(0)); // only initials from names
        }

    }
}
