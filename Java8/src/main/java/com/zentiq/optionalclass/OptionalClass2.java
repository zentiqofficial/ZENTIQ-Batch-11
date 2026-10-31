package com.zentiq.optionalclass;

import java.util.Optional;

public class OptionalClass2 {
	
    public static void main(String[] args) {

        String name = "Zentiq";

        // Without Optional
        if (name != null) {
            System.out.println(name);
        }

        // With Optional
        Optional<String> op = Optional.ofNullable(name);

        if (op.isPresent()) {
            System.out.println(op.get());
        }

        // Using ifPresent()
        op.ifPresent(n -> System.out.println(n));
    }

}
