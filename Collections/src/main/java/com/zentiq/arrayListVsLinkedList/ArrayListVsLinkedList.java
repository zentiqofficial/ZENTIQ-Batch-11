package com.zentiq.arrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
    public static void main(String[] args) {

        int size = 1_000_000; // 10 lakh elements

        // ==================
        // ArrayList
        // ==================
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }

        // search in ArrayList
        long startTime = System.nanoTime();
        arrayList.get(999_999); // get last element
        long endTime = System.nanoTime();

        System.out.println("ArrayList  search time: "
                + (endTime - startTime) + " ns");

        // ==================
        // LinkedList
        // ==================
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }

        // search in LinkedList
        startTime = System.nanoTime();
        linkedList.get(999_999); // get last element
        endTime = System.nanoTime();

        System.out.println("LinkedList search time: "
                + (endTime - startTime) + " ns");

        // ==================
        // Result
        // ==================
        System.out.println("\n--- Result ---");
        System.out.println("ArrayList  ====> O(1) direct jump  fast");
        System.out.println("LinkedList ====>  O(N) traverse all  slow");
    }
}
