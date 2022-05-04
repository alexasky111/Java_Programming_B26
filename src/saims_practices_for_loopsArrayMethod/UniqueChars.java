package saims_practices_for_loopsArrayMethod;

public class UniqueChars {
    public static void main(String[] args) {
        /*

        String str="aabdfccfsf";
        //          012345678


        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

        // Dynamic

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            int a=str.indexOf(each);

            int b=str.lastIndexOf(each);

            boolean isUnique=a==b;

            // boolean isUnique=str.indexOf(each)==str.lastIndexOf(each);

            if(isUnique){
                System.out.print(each);
            }

        }
         */

        String str = "Saeeda";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            int num = str.indexOf(letter);

            int num1 = str.lastIndexOf(letter);

            boolean isUnique = num==num1;

            if(isUnique) {
                System.out.print(letter);
            }

        }









    }
}
