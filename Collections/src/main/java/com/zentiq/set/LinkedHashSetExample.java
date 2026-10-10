package com.zentiq.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Gurugram");
        cities.add("Delhi");   // Duplicate - not added

        System.out.println(cities);

        // Check element
        System.out.println(cities.contains("Pune"));

        // Remove element
        cities.remove("Mumbai");

        System.out.println(cities);

        // Size
        System.out.println(cities.size());
    }
}
