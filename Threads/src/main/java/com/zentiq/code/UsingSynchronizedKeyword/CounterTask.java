package com.zentiq.code.UsingSynchronizedKeyword;

class CounterTask implements Runnable {

	Counter counter;

	CounterTask(Counter counter) {
		this.counter = counter;
	}

	public void run() {

		for (int i = 0; i < 10000; i++) {
			counter.increment();
		}
	}
}
