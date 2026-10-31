package com.zentiq.funtionalInterface;

import java.util.function.IntSupplier;

public class PrimitiveSupplier {
	
    public static void main(String[] args) {

        // IntSupplier - no input, int output
        IntSupplier randomValue =
                () -> (int) (Math.random() * 100);

        System.out.println(randomValue.getAsInt());
    }

}
