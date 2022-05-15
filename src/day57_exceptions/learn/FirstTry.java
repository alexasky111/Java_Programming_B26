package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First Line");

        try {//execute the code top to bottom, but if code gives an exception, we can handle it
            String word = "java";
            System.out.println(word.charAt(100));
            //parameters, e is a name of the exception
        } catch (Exception e) {
            System.out.println("Exception happened");
        }

        System.out.println("Last Line");

    }
}
