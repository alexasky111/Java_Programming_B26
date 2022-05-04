package Interview_Questions;

public class PalindromeInterview {
    public static void main(String[] args) {
        /*
        Palindrome: its the same reading from the beginning and end

        Ex:
            mom
            racecar
            anna
            madam

        Task: Check if a word is palindrome

        Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
     */
//        String st = "mom";
//        String newWord = "";
//
//        for (int i = st.length()-1; i >=0; i--) {
//            newWord += st.charAt(i);
//        }
//        if (newWord.equals(st)){
//            System.out.println("The word "+st+" is palindrome");
//        }
        String str = "racecar";
        // reverse the String

        String reverse = "";

        //if I'm reading from the end the last character is length()-1 (thats the starting point)
        for (int i = str.length() - 1; i >= 0; i--) {
        reverse += str.charAt(i); // characters are being read from the end and being added backwards into a reverse string
        } if (str.equals(reverse)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");


    }

}


