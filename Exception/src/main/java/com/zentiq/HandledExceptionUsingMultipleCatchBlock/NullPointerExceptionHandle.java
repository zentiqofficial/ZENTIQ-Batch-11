package com.zentiq.HandledExceptionUsingMultipleCatchBlock;

public class NullPointerExceptionHandle {

    public static void main(String[] args) {

        String name = null;

        try {

            System.out.println(name.length());

        } catch (NullPointerException e) {

            System.out.println("Object is null");

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic problem");

        } catch (Exception e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}