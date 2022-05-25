package day28_05_24_2022.finally_block;

public class FinallyBlock {
    public static void main(String[] args) {


        readFromDB();
        System.out.println("Line after method");

    }

    public static void readFromDB() {

        Connection connection = new Connection();
        try {

            connection.open();
            // Read data from database
            String str = null;    // assume that Iread this data from Database and put into str
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException is handled");
        } finally {
            connection.close();
        }


    }
}
