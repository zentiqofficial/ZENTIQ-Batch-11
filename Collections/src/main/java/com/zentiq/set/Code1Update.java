package com.zentiq.set;

import java.util.HashSet;
import java.util.Set;

public class Code1Update {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20); // duplicate

		System.out.println("Set: " + set);

		int numberOfBuckets = 16;

		System.out.println("\nHashCode and Bucket:");

		for (Integer value : set) {

			int hashCode = value.hashCode();

			int bucket = (numberOfBuckets - 1) & hashCode;

			System.out.println("Value: " + value + " | HashCode: " + hashCode + " | Bucket: " + bucket);
		}
	}
}
