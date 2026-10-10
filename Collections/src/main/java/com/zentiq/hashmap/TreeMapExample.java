package com.zentiq.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(103, "Neha");
        map.put(101, "Rahul");
        map.put(102, "Anil");

        System.out.println(map);
        
        Map<String, Integer> map1 = new TreeMap<>();

        map1.put("Neha", 103);
        map1.put("Rahul", 101);
        map1.put("Anil", 102);

        System.out.println(map1);
    }

}
