package com.zentiq.HandledExceptionUsingTryCatchFinally;

public class NullPointerExceptionHandle {

    public static void main(String[] args) {

        String name = null;

        try {

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println("Object is null");

        } finally {

            System.out.println("Finally block executed");

        }

        System.out.println("Program completed");
    }
}