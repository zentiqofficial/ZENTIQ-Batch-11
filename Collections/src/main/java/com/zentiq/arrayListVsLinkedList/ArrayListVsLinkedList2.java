package com.zentiq.arrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList2 {
	
	  public static void main(String[] args) {

	        int size = 1_000_000; // 10 lakh elements

	        // ==================
	        // ArrayList
	        // ==================
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        for (int i = 0; i < size; i++) {
	            arrayList.add(i);
	        }

	        // add at beginning - ArrayList
	        long startTime = System.nanoTime();
	        arrayList.add(0, 99); // shift all elements ❌
	        long endTime = System.nanoTime();
	        System.out.println("ArrayList  add at beginning: "
	                + (endTime - startTime) + " ns");

	        // add at end - ArrayList
	        startTime = System.nanoTime();
	        arrayList.add(99); // just add at end ✅
	        endTime = System.nanoTime();
	        System.out.println("ArrayList  add at end:       "
	                + (endTime - startTime) + " ns");

	        // ==================
	        // LinkedList
	        // ==================
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        for (int i = 0; i < size; i++) {
	            linkedList.add(i);
	        }

	        // add at beginning - LinkedList
	        startTime = System.nanoTime();
	        linkedList.addFirst(99); // just add new node ✅
	        endTime = System.nanoTime();
	        System.out.println("LinkedList add at beginning: "
	                + (endTime - startTime) + " ns");

	        // add at end - LinkedList
	        startTime = System.nanoTime();
	        linkedList.addLast(99); // just add new node ✅
	        endTime = System.nanoTime();
	        System.out.println("LinkedList add at end:       "
	                + (endTime - startTime) + " ns");

	        // add at middle - ArrayList
	        startTime = System.nanoTime();
	        arrayList.add(size / 2, 99); // shift half elements ❌
	        endTime = System.nanoTime();
	        System.out.println("ArrayList  add at middle:    "
	                + (endTime - startTime) + " ns");

	        // add at middle - LinkedList
	        startTime = System.nanoTime();
	        linkedList.add(size / 2, 99); // traverse to middle ❌
	        endTime = System.nanoTime();
	        System.out.println("LinkedList add at middle:    "
	                + (endTime - startTime) + " ns");

	        // ==================
	        // Result
	        // ==================
	        System.out.println("\n--- Result ---");
	        System.out.println("Add at beginning ==> LinkedList fast");
	        System.out.println("Add at end       ==>  ArrayList  fast");
	        System.out.println("Add at middle    ==>  ArrayList  fast");
	    }
	
 
}
