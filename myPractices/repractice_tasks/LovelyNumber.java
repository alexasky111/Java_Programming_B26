package repractice_tasks;

public class LovelyNumber {
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

    public static boolean isLovely(int num) {

        String numToString = String.valueOf(num);
        int count = 0;

            for (int i = 1; i < numToString.length(); i++) {
                if (numToString.contains(numToString.charAt(i) + "")) {
                    numToString.replaceFirst(numToString.charAt(i) + "", "*");
                    count++;
                }
            }

    if(count>=3){
        return false;
    }else{
        return true;
    }
    }
}
