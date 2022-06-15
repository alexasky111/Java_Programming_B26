package interview_tasks.from_generalpdf;

import java.util.ArrayList;

public class TAsk46 {
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
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        String res = "";

        for (int i = 0; i < str.length() - 1; i++) {

            if (Character.isDigit(str.charAt(i))) {
                res += str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i + 1))) {
                list.add(Integer.parseInt(res));
                res = "";
            }
        }
        if (!res.isEmpty()) {
            if (Character.isDigit(str.charAt(str.length() - 1))) {
                res += str.charAt(str.length() - 1);
                sum += Integer.parseInt(res);
            }else{
                sum += Integer.parseInt(res);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }


        return sum;
    }
}
