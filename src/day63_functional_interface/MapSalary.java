package day63_functional_interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 30000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 42452512.23);
        map.put("Elza", 123131214.1);
        map.put("Peter", 231234.0);

        String nameForLargest = "";
        double maxSalary = Double.MIN_VALUE;

        String nameForLowest = "";
        double lowestSalary = Double.MAX_VALUE; //we want the biggest possible double value, so any other will be smaller

        // 1.1 who has the maximum salary?
        for (String key : map.keySet()) {
            double value = map.get(key); //we use get method to read the values by the keys
            if (value> maxSalary) //goes to the map and gives the value of the key
            {
                nameForLargest = key;
                maxSalary = value;
            }

            //1.2 who has the minimum salary?
            if(value<lowestSalary){
                nameForLowest = key;
                lowestSalary = value;
            }
        }
        System.out.println("Max Salary: "+nameForLargest+" - $"+maxSalary);
        System.out.println("Lowest Salary: "+nameForLowest+" - $"+lowestSalary);
        System.out.println();
        //1.3 how many employees has the salary between 120k ~ 150K?
        int counter = 0;

        for(double value : map.values()){ //going through values
            if(value >=120_000 && value<= 150_000){
                counter++;
            }
        }
        System.out.println("Number over 120,000K and less than 150_K: "+ counter);
        System.out.println();
        //1.4 display the names of the employees who are making less than 118k?
        for(String name: map.keySet()){ //going through keys
            if(map.get(name) <= 118_000){
                System.out.println(name);
            }
        }
        System.out.println();
        // 1.5 increase the salary of each employee by 10K
        for(String key: map.keySet()){
            map.put(key, map.get(key)+10_000);
        }
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
