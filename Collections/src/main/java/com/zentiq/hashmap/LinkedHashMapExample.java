package com.zentiq.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Rahul");

        map.put(102, "Anil");

        map.put(103, "Neha");

        System.out.println(map);
    }

}
