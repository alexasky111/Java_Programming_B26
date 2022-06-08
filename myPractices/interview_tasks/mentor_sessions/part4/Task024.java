package interview_tasks.mentor_sessions.part4;

public class Task024 {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNum(-123));

    }
    /*
    24) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
     */

    public static int reverseNegativeNum(int num){
        //-123


        if(num<0){
            String str = Integer.toString(num);
            String reversed = str.substring(0,1);

            for (int i = str.length()-1; i >=1 ; i--) {
                reversed += str.charAt(i);
            }

            return Integer.parseInt(reversed);

        }
        return -1;


    }
}
