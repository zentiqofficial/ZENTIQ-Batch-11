package com.zentiq.Vector;

public class Main {

	    public static void main(String[] args) {

	    	VectorInternalImplementation vector = new VectorInternalImplementation();

	        vector.add(10);
	        vector.add(20);
	        vector.add(30);

	        vector.print();                    // [10, 20, 30]

	        System.out.println(vector.get(1)); // 20

	        vector.remove(1);

	        vector.print();                    // [10, 30]

	        System.out.println(vector.size()); // 2
	    }

}
