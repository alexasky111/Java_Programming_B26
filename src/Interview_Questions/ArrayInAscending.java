package Interview_Questions;

public class ArrayInAscending {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 9, 6, 7};

        System.out.println(isAscending(a));

    }
    /*
    //10 if ascend true
int[]a={1,2,3,4,5,6,7};
     */

    public static boolean isAscending(int[] arr) {

        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    if (arr[i] > arr[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

