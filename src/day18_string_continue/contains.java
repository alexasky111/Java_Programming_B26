package day18_string_continue;

public class contains {
    public static void main(String[] args) {
        String day = "Today it is above 70";
        System.out.println(day.contains("it is")); //true
        System.out.println(day.contains("itis")); //false
        System.out.println(day.contains("ay it")); //true
        System.out.println(day.contains("7")); //true
        System.out.println(day.contains("today")); //false bc we had Today w/ uppercase

        System.out.println("Ti7"); //false



    }
}
