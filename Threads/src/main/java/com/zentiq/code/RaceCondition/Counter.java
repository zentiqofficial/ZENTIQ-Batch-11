package com.zentiq.code.RaceCondition;

class Counter {

	int count = 0;
	void increment() {
		count++;
	}
}
// ========synchronized makes increment() thread-safe ====
/*class Counter {

	int count = 0;
	synchronized void increment() {
		count++;
	}
}*/
//=========Lock makes increment() thread-safe===============
/*class Counter {

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
}*/
//=====================================
