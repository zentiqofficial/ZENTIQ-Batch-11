package com.zentiq.runTimeException;

public class ClassCastExceptionTest {

	public static void main(String[] args) {

        Object obj = "Hello";

        Integer number = (Integer) obj;
    }
}
