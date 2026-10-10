package com.zentiq.set;

import java.util.TreeSet;

public class TreeSetExample1 {
	
	 public static void main(String[] args) {

	        TreeSet<Integer> numbers = new TreeSet<>();

	        numbers.add(50);
	        numbers.add(10);
	        numbers.add(40);
	        numbers.add(20);
	        numbers.add(10);   // Duplicate

	        System.out.println("Numbers: " + numbers);

	        System.out.println("Size: " + numbers.size());

	        System.out.println("Contains 40: " + numbers.contains(40));

	        numbers.remove(20);

	        System.out.println("After remove: " + numbers);
	    }

}
