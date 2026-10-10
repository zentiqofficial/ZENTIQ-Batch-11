package com.zentiq.list;

import java.util.ArrayList;
import java.util.List;

public class Code2 {
	
	public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Anil");
        list.add("Rahul");
        list.add("Rohit");

        System.out.println(list);
        
        list.add(1, "Ram");
        System.out.println(list);
    }

}
