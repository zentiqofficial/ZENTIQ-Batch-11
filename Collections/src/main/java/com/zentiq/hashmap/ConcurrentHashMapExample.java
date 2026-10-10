package com.zentiq.hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	
	public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(103, "Neha");
        map.put(101, "Rahul");
        map.put(102, "Anil");

        System.out.println(map);
    }

}
