package morning_practice.book_shelf;

public class Test {
    public static String capitalize(String word) {
        String res = "";

        String[] arr = word.split(" ");

        if (!word.isEmpty()) {
            for(int i=0; i< arr.length; i++){
               arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
                res += arr[i] + " ";
            }
        } else {
            res = "";
        }

        return res;

    }

    public static void main(String[] args) {
        String str = "mark twain";

        System.out.println(capitalize(str));
    }
}
