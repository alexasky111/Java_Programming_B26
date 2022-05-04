package codingBat;

public class ReturnLargestSumInArray {
    /*

Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
     */
    public int[] biggerTwo(int[] a, int[] b) {
    int sum1 = 0;
    int sum2 = 0;

        for (int j : a) {
            sum1 += j;
        }
        for (int j : b) {
            sum2 += j;
        }

        if(sum1>sum2){
            return a;
        }
        else if(sum2>sum1) {
            return b;
        }
        return a;
    }
}
