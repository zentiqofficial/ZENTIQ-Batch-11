package com.zentiq.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePerformance {

	    public static void main(String[] args) {

	        int count = 10_000_000;

	        // -------------------------------
	        // LinkedList
	        // -------------------------------

	        Queue<Integer> linkedList = new LinkedList<>();

	        long start1 = System.nanoTime();

	        for (int i = 0; i < count; i++) {
	            linkedList.add(i);
	        }

	        for (int i = 0; i < count; i++) {
	            linkedList.poll();
	        }

	        long end1 = System.nanoTime();

	        long linkedListTime = end1 - start1;


	        // -------------------------------
	        // ArrayDeque
	        // -------------------------------

	        Queue<Integer> arrayDeque = new ArrayDeque<>();

	        long start2 = System.nanoTime();

	        for (int i = 0; i < count; i++) {
	            arrayDeque.add(i);
	        }

	        for (int i = 0; i < count; i++) {
	            arrayDeque.poll();
	        }

	        long end2 = System.nanoTime();

	        long arrayDequeTime = end2 - start2;


	        // -------------------------------
	        // Result
	        // -------------------------------

	        System.out.println("LinkedList Time : "
	                + linkedListTime / 1_000_000.0 + " ms");

	        System.out.println("ArrayDeque Time : "
	                + arrayDequeTime / 1_000_000.0 + " ms");
	    }

}
