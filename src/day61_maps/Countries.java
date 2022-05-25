package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> countries = new HashMap<>();

        //created a HashMap that has key of String type - countries and ArrayList<String> for the value and those will be cities

        countries.put("United States", new ArrayList<>(Arrays.asList("New York City", "Chicago", "Dallas", "DC", "Denver", "LA"
        )));
        countries.put("Turkey", new ArrayList<>(Arrays.asList("Istanbul", "Ankara", "Izmir")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec","Vancouver", "Toronto")));
        System.out.println(countries);

        //Print all cities that start w/ D or I

        for(ArrayList<String> cities : countries.values()){//iterates through the values of the Map, which are the ArrayList of cities
            for (int i = 0; i < cities.size(); i++) {//iterates through each city in each ArrayList value
                if(cities.get(i).startsWith("D") || cities.get(i).startsWith("I")){
                    System.out.println(cities.get(i));
                }
            }
        }
        System.out.println();
        System.out.println("What country do you want to tour?");
        Scanner in = new Scanner(System.in);
        String country = in.nextLine();

        for(String cities: countries.get(country)){
            System.out.println("Touring..." + cities);
        }
    }
}
