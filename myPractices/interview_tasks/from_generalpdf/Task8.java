package interview_tasks.from_generalpdf;

public class Task8 {
    public static void main(String[] args) {
        String s="1a2b3c4f!@#";
        returnEachString(s);
    }
    /*
    String s="1a2b3c4f!@#";
    int sum=0;
        String letter="";
        String digit="";
        String sign="";

   output
   10
a b c f
1 2 3 4
!@#
     */
    public static void returnEachString(String str) {

        String letter = "";
        String digit = "";
        String sign = "";

        int sum = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letter += ch + " ";

            } else if (Character.isDigit(ch)) {
                //taking asci code, now takes number values
                sum += Integer.parseInt(ch+"");
                digit += ch + " ";
            } else {
                sign += ch + " ";
            }
        }
        System.out.println(sum+"\n"+letter+"\n"+digit+"\n"+sign);
    }
}
