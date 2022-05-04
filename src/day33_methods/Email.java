package day33_methods;

public class Email {
    public static void buildEmail(String name, String domain){

        // 1. To take the 1st letter of the Name
        String email = name.substring(0,1);

        // 2. To take the 1st 3 letters of the LastName
        int space = name.indexOf(" ");
        email += name.substring(space+1, space+4);

        // 3. The domain variable is coming from the method perimeter. It is changeable in main method
        email += "@" + domain + ".com";
        System.out.println(email);
    }

    public static void main(String[] args) {
        buildEmail("James Bond","gmail");
        buildEmail("Anna Smith", "Yahoo");
    }
}
