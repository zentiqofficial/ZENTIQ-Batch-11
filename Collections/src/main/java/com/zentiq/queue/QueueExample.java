package com.zentiq.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Queue: " + queue);

        // See first element
        System.out.println("Peek: " + queue.peek());

        // Remove first element
        System.out.println("Poll: " + queue.poll());

        System.out.println("After poll: " + queue);

        // Add another element
        queue.offer(50);

        System.out.println("After offer: " + queue);

        // Size
        System.out.println("Size: " + queue.size());
    }

}
