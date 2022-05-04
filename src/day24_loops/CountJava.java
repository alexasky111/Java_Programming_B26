package day24_loops;

public class CountJava {
    /*
    java is a language
    0123

    java 0,4     i, i + 4            -> space index but it's not included
    ava  1,5     i, i + 4
    va i 2,6
     */
    public static void main(String[] args) {
        String str = "java is a  java language.";
        int count = 0;

        for( int i = 0; i < str.length()-3; i++ ) { // index out of bounce if we do i+4
            String everyFour = str.substring(i, i + 4); // gives you every four characters
//            System.out.println(everyFour);
            if(everyFour.equals("java")){
                count++;
            }
        }
        System.out.println(count);




    }


}
