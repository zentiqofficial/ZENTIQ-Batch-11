package com.zentiq.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Anil");
        map.put(103, "Neha");
        map.put(104, "Neha");

        System.out.println(map);
    }
}
