package Replit_Arrays;

public class Review_toCharAt_Split {
    public static void main(String[] args) {
        char [] letters = {'j', 'a', 'v'};
        String word = "java";
        // Converts String to char []
        char [] java = word.toCharArray(); // take a string and converting a character Array
//        System.out.println(Arrays.toString(letters));
//        System.out.println(Arrays.toString(java));

        // Print every letter in a string
        for (char eachChar : java) { // for(char eachChar : word.toCharArray())
            System.out.println(eachChar);
            System.out.println(java[0]);

        }
        // To convert a char Array back to a String
        String str = new String(java);
        char [] day = {'m', 'o', 'n'};
        String strDay = new String (day);
        System.out.println(strDay);

    }
}
