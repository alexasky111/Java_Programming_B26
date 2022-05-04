package day24_loops;

public class CharactersInString {
    public static void main(String[] args) {
        /*
        Given a String print the ascii value codes for each character
Ex:
Input:
“java”
Output:
106 97 118 9
         */
   String s = "java";
   for (int i = 0; i < s.length(); i++) {
       System.out.println((int)s.charAt(i) + " "); // casting (int)s.charAt(i) -char- into -int-  + " "-> gives a space
   }



    }
}
