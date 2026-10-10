package com.zentiq.set;

import java.util.HashSet;

public class HashSetBucket {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);

		int numberOfBuckets = 16;

		System.out.println("Number of buckets: " + numberOfBuckets);

		for (Integer value : set) {

			int hash = value.hashCode();

			int bucket = (numberOfBuckets - 1) & hash;

			System.out.println("Value: " + value + " | HashCode: " + hash + " | Bucket: " + bucket);
		}
	}

}
