package com.zentiq.set;

import java.util.HashSet;
import java.util.Set;

public class Code3 {
	
	public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Gurugram");

        System.out.println(cities.contains("Delhi"));
        System.out.println(cities.contains("Chennai"));
    }

}
