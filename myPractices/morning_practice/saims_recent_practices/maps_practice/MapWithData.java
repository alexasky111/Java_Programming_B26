package morning_practice.saims_recent_practices.maps_practice;

import java.util.HashMap;
import java.util.Map;

public class MapWithData {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("James", 80000.0);
        map.put("Jane", 30000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 12452512.23);
        map.put("Elza", 123131214.1);
        map.put("Peter", 231234.0);

        //1.1 who has the maximum salary?
        double maxSalary = Double.MIN_VALUE;
        String nameOfMAxSalary = "";
        for (String name : map.keySet()) {
            if (map.get(name) > maxSalary) {
                maxSalary = map.get(name);
                nameOfMAxSalary = name;
            }
        }
        System.out.println(nameOfMAxSalary);
        System.out.println();

        //1.2 who has the minimum salary?
        double minSalary = Double.MAX_VALUE;
        String nameOfMinSalary = "";

        for (String name : map.keySet()) {
            if (map.get(name) < minSalary) {
                minSalary = map.get(name);
                nameOfMinSalary = name;
            }

        }
        System.out.println(nameOfMinSalary);
        System.out.println();

        //1.3 how many employees has the salary between 120k ~ 150K?
        int count = 0;
        String name = "";
        for (String key : map.keySet()) {
            if (map.get(key) >= 120_000 && map.get(key) <= 150_000) {
                count++;
                name = key;
            }
        }
        System.out.println(count + " person's name is " + name);
        System.out.println();

        //  1.4 display the names of the employees who are making less than 118k?
        String namesOfLess118KSalary = "";
        for (String key : map.keySet()) {
            if (map.get(key) < 118_000) {
                namesOfLess118KSalary += key + " ";
            }

        }
        System.out.println(namesOfLess118KSalary);
        System.out.println();

        //1.5 increase the salary of each employee by 10K
        System.out.println(map);
        for (String key : map.keySet()) {
            map.put(key, map.get(key) + 10000);

        }
        System.out.println(map);

    }
    /*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
     */
}
