package com.zentiq.Vector;

import java.util.Vector;

public class VectorCapacity {
	
	public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        v.add(10);
        v.add(20);
        v.add(30);
        
       /* v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);
        v.add(100);
        v.add(110);*/
 
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }

}

//When the Vector becomes full, it creates a new internal array with double the capacity, copies the existing elements into the new array, and then adds the new element
//For example, if a Vector has a default capacity of 10 and we add the 11th element (index 10), its capacity increases to 20