package saims_practices_for_loopsArrayMethod;

public class Array_T06 {
    public static void main(String[] args) {
/*        Initials
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
        String initials = "";

        for (int i = 0; i < names.length; i++) {
            initials = names[i].toUpperCase();
            System.out.println(""+initials.charAt(0) + initials.charAt(initials.indexOf(' ')+1));

        }


            }
        }














