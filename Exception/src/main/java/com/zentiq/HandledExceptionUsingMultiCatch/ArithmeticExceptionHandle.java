package com.zentiq.HandledExceptionUsingMultiCatch;

public class ArithmeticExceptionHandle {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException | NullPointerException e) {

            System.out.println("Exception handled");

        } catch (Exception e) {

            System.out.println("Other exception handled");

        }

        System.out.println("Program completed");
    }
}