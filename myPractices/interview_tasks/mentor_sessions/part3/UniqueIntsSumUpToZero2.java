package interview_tasks.mentor_sessions.part3;

import java.util.ArrayList;

public class UniqueIntsSumUpToZero2 {
    public static void main(String[] args) {

        System.out.println(upToZero(20));
    }
    public static int randomInt(int Min, int Max) {
        return (int) (Math.random() * (Max + 1 - Min)) + Min;
    }

    public static ArrayList<Integer> upToZero(int n) {

        if (n > 1 && n < 100) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            while (list.size() != n - 1) {
                int num = randomInt(-n, n);
                if (!list.contains(num)) {
                    list.add(num);
                    sum += num;
                }
            }

            while (list.size() != n) {
                int lastElement = -sum;
                if(!list.contains(lastElement)){
                    list.add(lastElement);
                } else {
                    sum -= list.get(0);
                    lastElement = randomInt(-n, n);
                    if(!list.contains(lastElement)){
                        list.set(0, lastElement);
                        sum += lastElement;
                    }
                }
            }

            return list;
        }

        return null;
    }
}
/*
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
 The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
 The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
  (but there are many more correct answers).
 */

