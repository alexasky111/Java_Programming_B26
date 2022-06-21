package interview_tasks.from_generalpdf;

import java.util.*;

public class HackerRankMigratoryBirds {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 4, 4, 5, 3));
        System.out.println(migratoryBird(list));
    }

    public static int migratoryBird(List<Integer> list) {

        int count = 0;
        int highestFrequency = Integer.MIN_VALUE;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            if (map.containsKey(list.get(i))) {
                count = map.get(list.get(i));
                map.put(list.get(i), count + 1);
                if (highestFrequency < list.get(i)) {
                    highestFrequency = list.get(i);
                    res = list.get(i);
                }
            } else {
                map.put(list.get(i), 1);
            }
        }

        return res;
    }
    /*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
Example
    There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .
Function Description
    Complete the migratoryBirds function in the editor below.
    migratoryBirds has the following parameter(s):
    int arr[n]: the types of birds sighted
Returns
    int: the lowest type id of the most frequently sighted birds
Input Format
    The first line contains an integer, , the size of .
    The second line describes  as  space-separated integers, each a type number of the bird sighted.
Constraints
    It is guaranteed that each type is , , , , or .
 */

}
