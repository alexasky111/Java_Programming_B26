package day24_loops;

public class Syllables {
    /*
    Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2
     */
    public static void main(String[] args) {
        String s = "ja-va"; // do the logic and add Scanner -> input.nextLine()
        int syllables = 1;

        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == '-'){
                syllables++;
            }
        }
        System.out.println("Syllables: " + syllables); //could do like before syllables + 1 and assign syllables = 0, that way we will have 1 -> '-' but 2 -> syllables
    }
}
