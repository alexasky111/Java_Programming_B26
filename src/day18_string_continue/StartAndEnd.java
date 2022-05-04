package day18_string_continue;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app")); // false, they are different

        System.out.println(str.startsWith("Apples")); //true, but normally we don't use this method w/ the whole word

        String s = "A";
        System.out.println(str.startsWith(s)); // true, does the String str start with the String s ?


        System.out.println(str.startsWith(" App")); //space is in the String so it counts as a space character
        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a")); //true
        System.out.println(sentence.endsWith("day")); //true
        System.out.println("day"); //true
        System.out.println(sentence.endsWith("good")); //false
        System.out.println(sentence.endsWith("today was a good day")); //true



    }
}
