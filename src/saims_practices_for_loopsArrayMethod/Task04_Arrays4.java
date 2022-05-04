package saims_practices_for_loopsArrayMethod;

public class Task04_Arrays4 {
    public static void main(String[] args) {
        /*
        Multiple Words

Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
         */
       String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
       String [] strArr = str.split(", ");
        for ( String word : strArr ) {

          if (word.contains(" ")){
                System.out.println(word);
            }


        }







    }
}
