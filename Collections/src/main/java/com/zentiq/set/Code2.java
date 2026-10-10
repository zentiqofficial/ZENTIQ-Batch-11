package com.zentiq.set;

import java.util.HashSet;
import java.util.Set;

public class Code2 {
	
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        //LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Neha");
        names.add("Rahul");  // duplicate

        System.out.println(names);
    }

}
