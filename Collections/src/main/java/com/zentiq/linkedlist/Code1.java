package com.zentiq.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Code1 {
	
	public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Anil");
        list.add("Rahul");
        list.add("Rohit");

        System.out.println(list);

        list.add(1, "Ram");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }

}

//ArrayList is backed by a dynamic array, while LinkedList is a doubly linked list. 
//ArrayList provides fast index access, whereas LinkedList is useful for efficient insertion 
//and removal when the position/node is already known.
