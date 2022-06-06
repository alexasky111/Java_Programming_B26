package interview_tasks.mentor_sessions.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationCombinations {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        findPermutationCombinations(list);
    }

    public static void findPermutationCombinations(ArrayList<Character> list) {

        int numberOfCombinations = 1;
        String str = "";

        for (int i = 1; i <= list.size(); i++) {
            numberOfCombinations *= i;
        }

        for (int i = 0; i < numberOfCombinations;) {
            Collections.shuffle(list);
            if(!str.contains(String.valueOf(list))){
                str += list + "\n";
                i++;
            }
        }
        System.out.println(str);
    /*
     Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
     */
    }
}
