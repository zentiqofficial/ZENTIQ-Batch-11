package com.zentiq.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(50);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        queue.add(40);

        System.out.println("PriorityQueue: " + queue);

        System.out.println("First element: " + queue.peek());

        System.out.println("Remove: " + queue.poll());
        System.out.println("After poll: " + queue);

        System.out.println("Remove: " + queue.poll());
        System.out.println("After poll: " + queue);

        System.out.println("Remove: " + queue.poll());
        System.out.println("After poll: " + queue);
    }

}
