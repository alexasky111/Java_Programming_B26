package day29_arrays;

import java.util.Locale;

public class Arrays_Initials {
    public static void main(String[] args) {
        /*
        Initials
•Given an array of classmate’s names, first name and last separated by a
space, print the initials of everyone
Ex:
Input:
[ “James Bond”, “Eve Rell”, “Anna Johnson” ]
Output:
JB
ER
AJ
         */
    String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        for (int i = 0; i < names.length; i++) {

            String fullName = names[i]; //storing as a temporary variable in the loop
            String lastNAme = fullName.substring(fullName.indexOf(" ")+1); // to pull out the FULL last name,starting w/
            // ---> space+1 <---
            System.out.println("" + fullName.charAt(0) + lastNAme.charAt(0)); //or fullName,substring(0,1)

        }
        for(String str : names){
            String fullName = str; //storing as a temporary variable in the loop
            String lastNAme = fullName.substring(fullName.indexOf(" ")+1); // to pull out the FULL last name,starting w/
            // ---> space+1 <---
            System.out.println("" + fullName.charAt(0) + lastNAme.charAt(0));

//            System.out.println(str.trim().substring(0,1)+str.substring(str.indexOf(" ")+1).charAt(0));

        }

    }
}
