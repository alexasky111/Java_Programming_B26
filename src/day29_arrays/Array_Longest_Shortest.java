package day29_arrays;

public class Array_Longest_Shortest {
    public static void main(String[] args) {
        String [] strs = {"apple", "java", "computer", "water"};
        String smallest = strs[0]; // can't start from 0, because non of the Strings will be smaller than 0
        String biggest = strs[0];

//        for (int i = 0; i < strs.length; i++) {
//
//            if(strs[i].length() < smallest.length()) {
//                smallest = strs[i];
//            }
//            if(strs[i].length() > biggest.length()) {
//                biggest = strs[i];
//            }
//
//        }
        for(String word : strs) { //each word is every element in an Array->strs
            if (word.length()>biggest.length()){
                biggest = word;
            }
            if (word.length()>smallest.length()){
                smallest = word;
            }
        }


        System.out.println("Biggest String : " +biggest);
        System.out.println("Biggest String : " +smallest);
    }
}
