package com.zentiq.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Code1 {
	
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
       // LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);  // duplicate

        System.out.println(set);
    }

}
