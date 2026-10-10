package com.zentiq.code.RaceConditionSolution;

// synchronized makes increment() thread-safe
class Counter {

	int count = 0;

	synchronized void increment() {
		count++;
	}
}
