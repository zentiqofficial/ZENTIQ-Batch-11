package com.zentiq.FailSafeVsFailFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CodeFailFast {
	
	 public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);

	        Iterator<Integer> it = list.iterator();
	        while(it.hasNext()) {
	            System.out.println(it.next());
	            list.add(40); // modify during traversal 
	        }
	    }

}
