package com.zentiq.code.UsingWaitMethod;

class OddTask implements Runnable {

    public synchronized void run() {

        try {
            System.out.println("Odd Thread is waiting");

            this.wait();

            System.out.println("Odd Thread is awake");

            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd : " + i);
                Thread.sleep(500);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
