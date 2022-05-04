package saims_practices_for_loopsArrayMethod;

public class MultidimentionalArray_Task04 {
    public static void main(String[] args) {
/*
Given a 2D String array, concatenate the last character of each inner
element on one line, then each following array values in separate lines
Ex:
{"James", "is", "back"}
{"he", "was", "never", "gone"}
{"methods", "tomorrow"}
Output:
ssk
esre
sw
 */
        String [][] strArr = {
                {"James", "is", "back"}, // element 0 of 2D
                {"he", "was", "never", "gone"}, // element 1 of 2D
                {"methods", "tomorrow"} // element 2 of 2D
        };

        // 1. To Loop through each element of 2D
        for (int i = 0; i < strArr.length; i++) {
            String lastChar = "";
            String firstChat = "";

        // 2. To loop through each character of each element in 2D
            for (int j = 0; j < strArr[i].length; j++) {

        // 3. To collect all the last characters of the Strings in 1 variable "lastChar"
                lastChar += strArr[i][j].charAt(strArr[i][j].length()-1);

        // 4. To collect all the first characters of the String in 1 variable "firstChar"
                firstChat += strArr[i][j].charAt(0);

            }
            System.out.println(lastChar);
            System.out.println(firstChat);
        }




















    }
}
