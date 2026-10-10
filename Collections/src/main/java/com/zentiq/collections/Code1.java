package com.zentiq.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code1 {
	
	public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);

        System.out.println("Original:  " + list);

        // sort
        Collections.sort(list);
        System.out.println("Sorted:    " + list);

        // reverse
        Collections.reverse(list);
        System.out.println("Reversed:  " + list);

        // shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled:  " + list);

        // min and max
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));

        // frequency
        list.add(10);
        System.out.println("Frequency of 10: " +
                Collections.frequency(list, 10));

        // binary search
        Collections.sort(list);
        System.out.println("Index of 30: " +
                Collections.binarySearch(list, 30));

        // thread safe
        List<Integer> syncList =
                Collections.synchronizedList(list);
        System.out.println("Sync list: " + syncList);

        // unmodifiable
        List<Integer> unmodList =
                Collections.unmodifiableList(list);
        System.out.println("Unmodifiable: " + unmodList);
        // unmodList.add(99); // ❌ UnsupportedOperationException
    }

}
