package com.zentiq.code.UsingJoinMethod;

public class EvenTask implements Runnable {

    Object lock;

    EvenTask(Object lock) {
        this.lock = lock;
    }

    public void run() {

        synchronized (lock) {

            try {
                System.out.println("Even Thread is waiting");

                lock.wait();

                System.out.println("Even Thread is awake");

                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("Even : " + i);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
