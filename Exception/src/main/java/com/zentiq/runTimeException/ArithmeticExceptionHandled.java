package com.zentiq.runTimeException;

public class ArithmeticExceptionHandled {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }

        System.out.println("Program completed");
    }
}
