package com.zentiq.HandledExceptionUsingMultipleCatchBlock;

public class ArithmeticExceptionHandle {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException handled");

        } catch (NullPointerException e) {

            System.out.println("NullPointerException handled");

        } catch (Exception e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}