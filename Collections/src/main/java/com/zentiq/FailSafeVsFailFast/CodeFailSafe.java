package com.zentiq.FailSafeVsFailFast;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CodeFailSafe {


		public static void main(String[] args) {

			CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);

			Iterator<Integer> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				list.add(40); // modify during traversal 
				// no exception
			}

			System.out.println(list);
		}

}
