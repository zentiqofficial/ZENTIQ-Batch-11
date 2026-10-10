package com.zentiq.set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Delhi");
        set.add("Mumbai");
        set.add("Pune");
        set.add("Gurugram");
        set.add("Delhi");       // Duplicate

        System.out.println(set);

        System.out.println("Size: " + set.size());

        System.out.println("Contains Pune: " + set.contains("Pune"));

        set.remove("Mumbai");

        System.out.println("After remove: " + set);
    }
}
