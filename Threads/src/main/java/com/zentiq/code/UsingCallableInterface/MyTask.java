package com.zentiq.code.UsingCallableInterface;

import java.util.concurrent.Callable;
//Use Callable when you want a thread/task to perform some work and return a result.

class MyTask implements Callable<Integer> {

	@Override
	public Integer call() {

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum += i;
		}

		return sum;
	}
}
