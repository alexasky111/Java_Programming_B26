package morning_practice.saims_recent_practices.maps_practice;

import java.util.*;

public class RemoveNames {
    /*
    Given an ArrayList of names, remove all the names that are ''
- Think about how many different ways you can do this
____________________________________________________________
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Vika", "Alex", "Sasha", "Ahmed"));
        System.out.println(removeName(names));

        System.out.println(removeName2(names));

    }

    public static ArrayList<String> removeName(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            names.removeIf(name -> name.equals("Ahmed"));
        }
        return names;
    }

    public static ArrayList<String> removeName1(ArrayList<String> names) {

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {

            if (it.next().equals("Ahmet")) {
                it.remove();
            }
        }

        return names;

    }

    public static ArrayList<String> removeName2(ArrayList<String> names) {

        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        int count = 0;

        for (String s : names) {

            if (map.containsKey(s)) {
                count = map.get(s);
                count++;
                map.put(s, count);

            } else {
                map.put(s, 1);
            }

        }
        map.remove("Ahmet");

        for (String each : map.keySet()) {

            list.add(each);

        }

        return list;
    }


}
