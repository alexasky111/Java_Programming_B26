package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    /*
    rank
    1 - student
    2 - student
    3 - student
    4 - student
    5 - student
     */
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("James", 4.0, 7)); //1st student in the map, can be without a ref no problem
        Student obj = new Student("Hanna", 3.9, 10);
        map.put(2, obj);
        map.put(3, new Student("Diana", 3.8, 14));
        map.put(4, new Student("Jehad", 3.7, 29));

        System.out.println(map);

        System.out.println(map.get(5));
        System.out.println(map.get(1));
        System.out.println(map.get(4).name);

        //looping through the map by the keys:
        for (int keys : map.keySet()){//returns all the keys not values
            System.out.println("Rank: "+keys);
            System.out.println(map.get(keys));
            System.out.println();
        }
        System.out.println(map.values());

        //looping through the map by the values:
        for(Student student: map.values()){
            if(student.id <= 10){
                System.out.println(student.name);
            }
        }
        //another way to loop through entry(key&value)

        for(Map.Entry<Integer, Student> entry: map.entrySet()){
            System.out.println("Rank: "+entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
}
