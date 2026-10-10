package com.zentiq.HandledExceptionUsingTryCatchFinally;

public class ArithmeticExceptionHandle {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Exception handled");

        } finally {

            System.out.println("Finally block executed");

        }

        System.out.println("Program completed");
    }
}