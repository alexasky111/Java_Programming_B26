package day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {

        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);

//        accountOne.withdraw(2000); // uncomment this to see the exception

        // valid login
        try {
            accountOne.login("jamesbond", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        // invalid username
        try {
            accountOne.login("james", "007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        // invalid password
        try {
            accountOne.login("jamesbond", "something");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

    }
}
