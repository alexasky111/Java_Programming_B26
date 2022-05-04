package day13_02_29_2022;

public class P02_Login {
    public static void main(String[] args) {
        boolean isLoginSuccess = login("Cydeo", "Cydeo123");
        if(isLoginSuccess){
            System.out.println("Welcome to Cydeo");
        }else {
            System.err.println("Check pass");
        }
        System.out.println("==================================");

        isLoginSuccess = login();
        if(isLoginSuccess){
            System.out.println("Welcome to Cydeo");
        }else {
            System.err.println("Check pass");
        }

    }
    // If match -->true, if not --> false
    public static boolean login(String username, String password){
        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;
    }

    public static boolean login(){
        String username = getUsername(); // this m-thod returns username from this method
        String password = getPassword(); // this m-thod returns password from this method

        if(username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("cydeo123")){
            return true;
        }
        return false;
    }
    public static String getUsername(){
        // Assume we get info from external file
        return "Cydeo";

    }
    public static String getPassword(){
        // Assume we get info from external file
        return "Cydeo123";

    }
}
