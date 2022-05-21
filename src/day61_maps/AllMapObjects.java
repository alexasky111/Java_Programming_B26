package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("saim", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("aysun", "ui testing");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null,"nothing");

        System.out.println(map);

        Map<String, String> linked = new LinkedHashMap<>(); //maintains the insertion order
        linked.put("saim", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("aysun", "ui testing");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null,"nothing");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("saim", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("aysun", "ui testing");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
        //treeMap.put(null,"nothing"); TreeMap obj cannot have a null key
        System.out.println(treeMap);

        Map<String, String> hashTable = new Hashtable<>(); //maintains the insertion order
        hashTable.put("saim", "java");
        hashTable.put("hello", "world");
        hashTable.put("james", "bond");
        hashTable.put("aysun", "ui testing");
        hashTable.put("nadir", "soft skills");
        hashTable.put("username", "password");
        hashTable.put(null,"nothing");
        System.out.println(hashTable); //order is not guaranteed; objects cannot have null key or value




    }
}
