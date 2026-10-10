package com.zentiq.code.UsingSynchronizedKeyword;

class Counter {

	int count = 0;

    //using synchronized
	synchronized void increment() {
		count++;
	}
}
