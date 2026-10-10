package com.zentiq.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethodExample {
	
	public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);

        System.out.println("Original List: " + list);

        // get()
        System.out.println("get(0): " + list.get(0));
        // get element by index


        // set()
        list.set(0, 99);
        System.out.println("After set(0, 99): " + list);
        // update element by index


        // indexOf()
        System.out.println("indexOf(10): " + list.indexOf(10));
        // first index of element


        // lastIndexOf()
        System.out.println("lastIndexOf(10): " + list.lastIndexOf(10));
        // last index of element


        // subList()
        System.out.println("subList(1, 3): " + list.subList(1, 3));
        // elements from index 1 to 2
        // end index 3 is exclusive


        // add(index, element)
        list.add(1, 99);
        System.out.println("After add(1, 99): " + list);
        // add element at specific index


        // remove(index)
        list.remove(0);
        System.out.println("After remove(0): " + list);
        // remove element at specific index


        // listIterator()
        ListIterator<Integer> iterator = list.listIterator();

        System.out.println("ListIterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
