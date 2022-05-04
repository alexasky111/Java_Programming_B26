package day19_string;

public class MergeStrings {
    public static void main(String[] args) {

        /*
        2 strings: hard code to have 3 characters each
        merge the strings
         */
        String str1 = "abc";
        String str2 = "XYZ";
        String merged = ""; // you'll never face a number adding because you started w/ a string

        merged += str1.charAt(0);
        merged += str2.charAt(0);
        merged += str1.charAt(1);
        merged += str2.charAt(1);
        merged += str1.charAt(2);
        merged += str2.charAt(2);

        System.out.println(merged);

    // output: axbycz
//        System.out.println(""+str1.charAt(0)+str2.charAt(0)+str1.charAt(1)+str2.charAt(1)+str1.charAt(2)+str2.charAt(2));





    }
}
