package day22_forloop_wstrings;

public class CountLetters {
    public static void main(String[] args) {
           /*
            Given a String we want to count how many 'a' characters we have

            Challenge: adjust so that we can check for not only 'a' but any character

         */
      String st = "aabbcca";
      int count = 0; // just a variable->container


      for(int i = 0; i < st.length(); i++) {
          // i variable is used to keep track of iterations also as a dynamic index number
          // how do you read every character and count it
          if (st.charAt(i) == 'a') {
              count++; // sep variable and we use it to count 'a'
          }

      }
        System.out.println(count);






    }
}
