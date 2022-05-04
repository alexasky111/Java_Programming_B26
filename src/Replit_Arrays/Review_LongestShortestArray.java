package Replit_Arrays;

public class Review_LongestShortestArray {
    public static void main(String[] args) {
        String[] strs = {"apple", "banana", "java", "computer"};
        String smallest = strs[0];
        String biggest = strs[0];

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > biggest.length()) {
                biggest = strs[i];
            }
            if (strs[i].length() < smallest.length()) {
                smallest = strs[i];
            }
        }
        System.out.println(smallest);
        System.out.println(biggest);





















    }
}
