package com.zentiq.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> it = list.listIterator();

        // 1. Forward traversal
        System.out.println("--- Forward Traversal ---");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Backward traversal
        System.out.println("--- Backward Traversal ---");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        // 3. Add element during traversal
        System.out.println("--- Add 60 ---");

        ListIterator<Integer> it2 = list.listIterator();

        while (it2.hasNext()) {

            int val = it2.next();

            if (val == 50) {
                it2.add(60);
            }
        }

        System.out.println(list);

        // 4. Remove element during traversal
        System.out.println("--- Remove 30 ---");

        ListIterator<Integer> it3 = list.listIterator();

        while (it3.hasNext()) {

            int val = it3.next();

            if (val == 30) {
                it3.remove();
            }
        }

        System.out.println(list);

        // 5. Update element using set()
        System.out.println("--- Update 40 to 400 ---");

        ListIterator<Integer> it4 = list.listIterator();

        while (it4.hasNext()) {

            int val = it4.next();

            if (val == 40) {
                it4.set(400);
            }
        }

        System.out.println(list);
    }
}
