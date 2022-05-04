package codingBat;

public class Multidimensional {
    public static void main(String[] args) {
        /*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
         */
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        System.out.println(start1(a, b));
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && b.length > 0) {

            if (a[0] == 1) {
                count++;
            }
            if (b[0] == 1) {
                count++;
            }

        }
        return count;
    }
}
