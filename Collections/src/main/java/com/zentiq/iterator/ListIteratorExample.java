package com.zentiq.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}


//hasNext()  		 =>  check next element available
//next()   			 => get next element
//hasPrevious()      => check previous element available
//previous()         => get previous element
//remove()           => remove current element
//set()              => update current element
//add()              => add new element
//nextIndex()        => get next element index
//previousIndex()    => get previous element index