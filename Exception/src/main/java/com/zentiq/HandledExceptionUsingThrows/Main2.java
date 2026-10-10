package com.zentiq.HandledExceptionUsingThrows;

public class Main2 {

    void m1() {
        System.out.println("m1");
        m3();
    }

    void m2() {
        System.out.println("m2");

        int result = 10 / 0;
    }

    void m3() {

        System.out.println("m3");

        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in m3");
        }
    }

    public static void main(String[] args) {

        Main2 obj = new Main2();

        obj.m1();

        System.out.println("Program completed");
    }
}