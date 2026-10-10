package com.zentiq.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        //numbers.add(null);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);       // Duplicate

        System.out.println("Numbers: " + numbers);

        System.out.println("First: " + numbers.first());

        System.out.println("Last: " + numbers.last());

        System.out.println("Contains 40: " + numbers.contains(40));

        System.out.println("Size: " + numbers.size());

        numbers.remove(20);

        System.out.println("After remove: " + numbers);
    }
}
