package com.zentiq.ArrayList;

public class Main {
	
	    public static void main(String[] args) {

	    	ArrayListImplementation list = new ArrayListImplementation();

	        list.add(10);
	        list.add(20);
	        list.add(30);

	        list.print();                    // [10, 20, 30]

	        System.out.println(list.get(1)); // 20

	        list.remove(1);

	        list.print();                    // [10, 30]

	        System.out.println(list.size()); // 2
	    }

}
