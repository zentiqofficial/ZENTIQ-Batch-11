package com.zentiq.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethodExample {
	
	public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        // Add elements
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);
        vector.addElement(10);

        System.out.println("Original Vector: " + vector);


        // removeElement()
        vector.removeElement(10);
        System.out.println("After removeElement(10): " + vector);
        // remove first occurrence of element


        // elementAt()
        System.out.println("elementAt(0): " + vector.elementAt(0));
        // get element at index


        // firstElement()
        System.out.println("firstElement(): " + vector.firstElement());
        // get first element


        // lastElement()
        System.out.println("lastElement(): " + vector.lastElement());
        // get last element


        // insertElementAt()
        vector.insertElementAt(99, 1);
        System.out.println(
                "After insertElementAt(99, 1): " + vector
        );
        // insert 99 at index 1


        // setElementAt()
        vector.setElementAt(50, 0);
        System.out.println(
                "After setElementAt(50, 0): " + vector
        );
        // update element at index 0


        // removeElementAt()
        vector.removeElementAt(0);
        System.out.println(
                "After removeElementAt(0): " + vector
        );
        // remove element at index 0


        // capacity()
        System.out.println(
                "Capacity: " + vector.capacity()
        );
        // get current capacity


        // elements()
        Enumeration<Integer> enumeration =
                vector.elements();

        System.out.println("Elements using Enumeration:");

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }


        // removeAllElements()
        vector.removeAllElements();

        System.out.println(
                "After removeAllElements(): " + vector
        );
    }

}
