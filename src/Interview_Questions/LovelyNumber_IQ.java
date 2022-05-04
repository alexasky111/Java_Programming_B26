package Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LovelyNumber_IQ {
    /*
     We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.
     */
    public static void main(String[] args) {
        System.out.println(lovelyNumber(0));
        System.out.println(lovelyNumber(100));
        System.out.println(lovelyNumber(111));
    }

    public static int lovelyNumber(int num){

//        String [] split = (num+"").split("");
        // 1st I neew to convert into string, then I need to divide in each method
        String [] split = String.valueOf(num).split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));

        for (String each : list) {
            if(Collections.frequency(list, each)>=3){
                return 0;
            }
        }
        return 1;
    }
}
