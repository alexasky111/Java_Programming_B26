package replits;

public class NonDuplicate {
    /*
    Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the non-duplicate number, which mean the ones that does not have two occurrences of it
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 4, 1, 5};

        String str = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count==1){
                str += arr[i]+" ";
            }
        }
        System.out.println(str);



    }


}
