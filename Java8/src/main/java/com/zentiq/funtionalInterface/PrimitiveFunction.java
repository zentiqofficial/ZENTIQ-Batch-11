package com.zentiq.funtionalInterface;

import java.util.function.IntFunction;

public class PrimitiveFunction {
	
    public static void main(String[] args) {

        // IntFunction - int input, object output
        IntFunction<String> convert =
                x -> "Number is: " + x;

        System.out.println(convert.apply(5));
    }

}
