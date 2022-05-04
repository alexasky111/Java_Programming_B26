package day17_string;

public class MainMethod {
    public static void main(String[] args) {
        String name = "james";

        // how to compare String values-->use .equals()
        System.out.println(name.equals("james"));


        System.out.println("cate".equals("dog"));
        System.out.println(name.equals("James"));
        System.out.println(name.equalsIgnoreCase("James"));



        String a = new String ("hello");
        String b = new String ("hello");

        System.out.println(a.equals(b)); // we want to use this method bc it's checking the values, are these characters equal to this character?! Never compare Strings w/ ==

        System.out.println(a.equals("hello")); //compares an object w/ literal "hello" object
        System.out.println(a.equals("java"));
        System.out.println(name.length());
        String last = "today was fund";
        System.out.println(last.length());
        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));
    }
}
