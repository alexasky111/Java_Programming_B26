package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String str = "sunday";
                    //012345
        System.out.println(str.substring(1)); // I want to keep the characters starting from character 1 (the ones I/m keeping)
        System.out.println(str.substring(3)); // I want to keep the characters starting from character 3
        System.out.println(str);
        System.out.println("satur"+str.substring(3)); //concatenation w/ word "day" from line 8
        System.out.println(str.substring(2, 4)); // WHENEVER 2 NUMBERS LAST ONE IS NOT INCLUDED it is just a stopping point won't be in a console
        System.out.println(str.substring(0, 5)); // gives a string without the last character
        System.out.println(str.substring(0,6)); // you'll keep the whole word
        System.out.println(str.substring(0,7));// This will stop the code from running !Out of bounds
        // index is start from zero







    }
}
