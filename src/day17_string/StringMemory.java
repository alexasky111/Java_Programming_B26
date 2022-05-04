package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java";// String literal, in String pool

        String second = new String ("java"); // String object, not in String pool, but in the heap
        System.out.println(first==second); // == with String type gives you false; The == doesn't compare the characters, it compares the memory location of the object

        String third = "java";
        System.out.println(first==third);

        String fourth = "Java";
        System.out.println(first==fourth); // at this line, how much object in the String pool: 2 - "java" & "Java"

        //How many total objects are there? => 3 -> 2 in the String pool and 1 separate directly in the heap

    String fifth = new String ("java");
        System.out.println(second==fifth); //NO == doesn't compare value, they are different subjects



    }
}
