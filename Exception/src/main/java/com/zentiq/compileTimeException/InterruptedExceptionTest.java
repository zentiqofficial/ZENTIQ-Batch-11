package com.zentiq.compileTimeException;

public class InterruptedExceptionTest {

    public static void main(String[] args) throws InterruptedException  {

        Thread.sleep(2000);

        System.out.println("Completed");
    }
}

//InterruptedException occurs when a thread is sleeping, waiting,
//or joining, and another thread interrupts it.