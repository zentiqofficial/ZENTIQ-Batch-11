package com.zentiq.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // get iterator
        Iterator<Integer> it = list.iterator();

        // 1. hasNext() and next()
        System.out.println("--- traverse ---");

        while (it.hasNext()) {

            System.out.println(it.next());
        }

        // 2. remove() - remove element during traversal
        System.out.println("--- remove 30 ---");

        Iterator<Integer> it2 = list.iterator();

        while (it2.hasNext()) {

            int val = it2.next();

            if (val == 30) {

                it2.remove(); // safe remove
            }
        }

        System.out.println(list);
    }
}