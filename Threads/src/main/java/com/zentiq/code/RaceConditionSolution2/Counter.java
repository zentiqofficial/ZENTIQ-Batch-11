package com.zentiq.code.RaceConditionSolution2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock makes increment() thread-safe
class Counter {

	int count = 0;
	Lock lock = new ReentrantLock();

	void increment() {
		lock.lock();
		try {
			count++;
		} finally {
			lock.unlock();
		}
	}
}
//=====================================
