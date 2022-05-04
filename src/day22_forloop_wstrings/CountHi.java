package day22_forloop_wstrings;

public class CountHi {
    public static void main(String[] args) {

        String str = "aaaahiahhihibbbcch";
        int count = 0;

        for(int i = 0; i < str.length()-1; i++) { //i <= str.length() - 2
            //           to prevent error because of the last h and then check for i
            //start from 0 and check one at a time
        if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
            count++;

            }
        }
        System.out.println(count);









        /*
        String str = "aaaahiahhihibbbcch";
        aa
        aa
        ah
        hi

         */




    }
}
