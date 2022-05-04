package day26_nested_loops.day30_Arrays_Loops;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String str = "I love Ukraine"; //My sentence
        String [] words = str.split(" "); // splitting by a space
        String reversedWord = "";

        char [] middleWord = words[1].toCharArray(); //could use charAt method as well

        for (int i = middleWord.length-1; i >= 0 ; i--) {
            reversedWord += middleWord[i]; // here would be the method charAt
        }
        System.out.println(words[0]+" "+reversedWord+" "+words[2]);

    }
}
