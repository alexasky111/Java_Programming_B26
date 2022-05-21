package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMApObject {
    public static void main(String[] args) {
        //keys are Integer, values are String(obj types only)
        Map<Integer, String> map = new HashMap<>();
        // map.add(); --> it didn't inherit from the Collection bc there is no IS A RELATION
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); //HashMap element order is random, not insertion order, not sorted

        //read the key/value from map
        System.out.println(map.get(10)); //argument is the key, not index

        String value = map.get(5); //giving the value back, based on the key

        map.remove(1); //removes the value based on the key

        System.out.println(map.containsKey(1)); //it returns true/false based on the key
        System.out.println(map.containsKey(3)); //true

        System.out.println(map.containsValue("five")); //true
        System.out.println(map.containsValue("10")); //false

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world"); //null key exists so the value updates to hello world
        System.out.println(map);

        map.put(3, "March"); // 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);




    }

}
