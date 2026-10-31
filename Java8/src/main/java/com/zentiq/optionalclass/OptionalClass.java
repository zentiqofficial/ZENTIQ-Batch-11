package com.zentiq.optionalclass;

import java.util.Optional;

public class OptionalClass {
	
	 public static void main(String[] args) {

	        String name = null;

	        // Without Optional
	        if (name != null) {
	            System.out.println(name);
	        } else {
	            System.out.println("Default Name");
	        }

	        // With Optional
	        Optional<String> op = Optional.ofNullable(name);

	        System.out.println(op.orElse("Default Name"));
	    }

}
