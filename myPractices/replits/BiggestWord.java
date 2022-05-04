package replits;

public class BiggestWord {
    /*
    Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
    Input:
  [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]

Output:
  jaaaaavvaaaaaaaaaa
     */
    public static void main(String[] args) {

        String [] arr = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        //To assign 1st element of the array to be able to compare w/
        String longestElement = arr[0];
        //To loop through an array
        for (int i = 0; i < arr.length; i++) {
            //if one of the elements in the array > then the 1st one-->reassign
            if(arr[i].length() > longestElement.length()){
                longestElement = arr[i];
            }
        }
        System.out.println(longestElement);
    }



}
