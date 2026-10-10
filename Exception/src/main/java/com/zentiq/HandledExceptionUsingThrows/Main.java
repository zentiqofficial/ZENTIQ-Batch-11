package com.zentiq.HandledExceptionUsingThrows;

public class Main {

    void m1() {
        System.out.println("m1");
        m2();
    }

    void m2() {
        System.out.println("m2");
        m3();
    }

    void m3() {
        System.out.println("m3");
        m4();
    }

    void m4() {
        System.out.println("m4");
        int result = 10 / 0;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        obj.m1();

        System.out.println("Program completed");
    }
}
