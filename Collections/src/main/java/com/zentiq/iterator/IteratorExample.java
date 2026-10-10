package com.zentiq.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	    public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>();

	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);

	        Iterator<Integer> it = list.iterator();

	        while (it.hasNext()) {

	            System.out.println(it.next());
	        }
	    }
}

//hasNext()  => check next element available
//next()     =>  get next element
//remove()   =>  remove current element
