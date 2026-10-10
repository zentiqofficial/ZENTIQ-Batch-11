package com.zentiq.code.UsingAtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

class CounterTask implements Runnable {

    private AtomicInteger counter;

    CounterTask(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.incrementAndGet();
        }
    }
}
