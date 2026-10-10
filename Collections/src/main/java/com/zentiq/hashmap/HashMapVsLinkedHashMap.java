package com.zentiq.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVsLinkedHashMap {
	
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(103, "Neha");
        hashMap.put(101, "Rahul");
        hashMap.put(104, "Priya");
        hashMap.put(102, "Anil");


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(103, "Neha");
        linkedHashMap.put(101, "Rahul");
        linkedHashMap.put(104, "Priya");
        linkedHashMap.put(102, "Anil");


        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println();

        System.out.println("LinkedHashMap:");
        System.out.println(linkedHashMap);
    }


}
