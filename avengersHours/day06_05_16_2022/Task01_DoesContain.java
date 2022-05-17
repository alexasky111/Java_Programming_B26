package day06_05_16_2022;

public class Task01_DoesContain {
    public static void main(String[] args) {
        String sentence = "Java is the best programming language";
        String word = "Java";
        String word1 = "Python";

        System.out.println(doesContain(sentence,word));
    }
        /*
    Write a program that determines if the given sentence contains the given word (Do not use contains() method)

                   Ex;
                   Input: String sentence = "Java is the best programming language"
                          String word = "Java";
                   Output: true
     */
    public static boolean doesContain(String sentence, String word){
        if(sentence.indexOf(word) == -1){
            return false;
        }
        return true;
    }
}
