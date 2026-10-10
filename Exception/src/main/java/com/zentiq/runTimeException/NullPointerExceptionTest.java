package com.zentiq.runTimeException;

public class NullPointerExceptionTest {

	public static void main(String[] args) {

        String name = null;

        System.out.println(name.length());
    }
}

//NullPointerException occurs when we try to use
//an object that contains null.