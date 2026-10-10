package com.zentiq.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Rahul",101);
        map.put("Anil", 102);
        map.put("Neha", 103);

        System.out.println(map);
    }
}
