package day25_recap;


import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
    /*
Given a String with multiple words separated by spaces, create a camel case version of the words.
Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

Ex:
	Today is SUNDAY

	Output:
today is Sunday
	todayIsSunday
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words: ");
        String str = input.nextLine().toLowerCase(); // 1. we will make everything lowercase no matter what and then adjust
        String camelCase = str.substring(0,1); // 2. To put the 1st character into the String right away, because the loop will start from i=1. It starts from i = 1 bc I am doing i - 1 to check for spaces, and I don't want to do this in the first iteration

        for(int i = 1; i < str.length(); i++) {
        //	todayIsSunday
            if (str.charAt(i - 1) == ' '){

                camelCase += str.substring(i, i + 1).toUpperCase(); // (""+str.charAt(i)).toUpperCase() | substring(i, i + 1) is the same as charAt(i) but the types are different

            } else {
                camelCase +=str.charAt(i); // today
            }
        }
        System.out.println(camelCase.replace(" ", "")); // DELETE the spaces

//
//                String str = "Today is SUNDAY";
//                str = str.toLowerCase();
//                String output = str.substring(0,1);
//
//                // String firstWord = str.substring(0,str.indexOf(" "));
//                // String secondWord = str.substring(str.indexOf(" "),str.lastIndexOf(" "));
//                // String lastWord = str.substring(str.lastIndexOf(" "));
//
//
//                for (int i = 1; i < str.length(); i++){
//
//            /* if (str.charAt(i-1) == ' '){
//                output+= str.substring(i,i+1).toUpperCase();
//
//            }else{
//                output+=str.charAt(i);
//            }
//             */
//                    if(str.charAt(i)==' '){
//                        str=str.replaceFirst(" "+str.charAt(i+1),(""+str.charAt(i+1)).toUpperCase());
//                    }
//                    output+=""+str.charAt(i);
//                }
//
//                System.out.println(output.replace(" ",""));

            }
        }


