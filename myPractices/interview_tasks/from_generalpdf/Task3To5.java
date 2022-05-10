package interview_tasks.from_generalpdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3To5 {
    public static void main(String[] args) {
        //To check Task 03
        changeValues(5, 6);
        //To check Task 04
        Integer [] arr = {2, 5, 7, 15, 1, 6};
        System.out.println(returnDifferenceMaxAndSecondMin(arr));
        //To check Task 05
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        System.out.println(returnSortedArrList(list));

    }
    /*
    Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
     */
    public static ArrayList<Integer> returnSortedArrList(ArrayList<Integer> list){
        //for [1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)<list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
// for [50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(i)>list.get(j)){
//                    Integer temp = list.get(i);
//                    list.set(i,list.get(j));
//                    list.set(j,temp);
//                }
//            }
//        }
//        return list;

//        Collections.sort(list);
//        Collections.sort(list,Collections.reverseOrder());

    }

    /*
Use Collection int a [] = {2,5,7,15,1,6};
int a [] = {2,5,7,15,1,6};
output
13   < Max number minus second min num and result is 13
*/
    public static int returnDifferenceMaxAndSecondMin(Integer [] arr) {
//        Integer [] arr = {2,5,7,15,1,6};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        list.remove(min);
        Integer min1 = Collections.min(list);
        int res = max - min1;
        return res;
    }

    /*
    int a=5;
int b=6;
change and print
a==6;
b==5;
     */
    public static void changeValues(int num, int num1) {
        int one = num;
        int two = num1;
        num = two;
        num1 = one;

        System.out.println("a==" + num + "\nb==" + num1);
    }


}
