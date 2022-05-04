package day21_loops;

public class Middle_char {
    /*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
    Ex:
    Input: elephant
    Output: The middle characters: ph
     */
    public static void main(String[] args) {
        String s = "abcdef";
                  //012345

        int mid = s.length()/2;

        if(s.length()%2==0) { // it gives you the 2nd one btw two
            // our word is even length
            // length/2 => 6/2 = 3
            char firstMiddle = s.charAt(mid-1);
            char secondMiddle = s.charAt(mid);
            System.out.println("With char: "+ firstMiddle + secondMiddle);
            System.out.println("With substring: "+s.substring(mid-1, mid+1));
                                                            // 2 -> because we need to get 'c' first AND then 'd'

        } else {

            char middle = s.charAt(s.length()/2); //if we put 2 only -> not working bc it is "hardcoded"
            System.out.println("With charAt: " + middle);
            System.out.println("With substring: " + s.substring(s.length()/2, s.length()/2 + 1));

        }
    } // our word is odd length
    // length/2:  5/2==2

}
