package interview_tasks.from_generalpdf;

import java.util.ArrayList;

public class Task46 {
    /*
    //46
 String a="aaa10ss20bb30";
 output > 60
     */
    public static void main(String[] args) {
        String a = "aaa10ss20bb30";
        System.out.println(returnSumOfNums(a));
    }

    public static int returnSumOfNums(String str) {

        int sum = 0;
        String res = "";
        boolean b1 = Character.isDigit(str.charAt(str.length() - 1));

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                res += str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i + 1))) {
                sum += Integer.parseInt(res);
                res = "";
            }
        }
        if (!res.isEmpty()) {
            if (b1) {
                res += str.charAt(str.length() - 1);
            }
            sum += Integer.parseInt(res);
        } else {
            if (b1) {
                sum += Integer.parseInt(str.charAt(str.length() - 1) + "");
            }
        }

        return sum;
    }
}
