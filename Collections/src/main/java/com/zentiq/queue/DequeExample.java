package com.zentiq.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // =========================
        // FIFO - Queue
        // =========================

        System.out.println("FIFO - Queue");

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Deque: " + deque);

        System.out.println("Remove: " + deque.removeFirst()); //10
        System.out.println("Remove: " + deque.removeFirst());

        System.out.println("After removal: " + deque);


        // =========================
        // LIFO - Stack
        // =========================

        System.out.println("\nLIFO - Stack");

        deque.clear();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Deque: " + deque);

        System.out.println("Remove: " + deque.removeLast()); //30
        System.out.println("Remove: " + deque.removeLast());

        System.out.println("After removal: " + deque);
    }
}