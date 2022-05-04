package day27_nested_loops_part2;

public class UniqueChars {
    public static void main(String[] args) {
/*
Task 06: Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
 */
        //If I want to see only unique once --> count is one
// MANUALLY

        String str = "aabdfccfs";
        //            012345678

        System.out.println(str.indexOf("f")); // --> if we have equal char lastindexOf and indexOf equal
        System.out.println(str.lastIndexOf("f"));

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            boolean isUnique = str.indexOf(each) == str.lastIndexOf(each);
            if(isUnique=true) {
                System.out.println(each);
            }
        }













    }
}
