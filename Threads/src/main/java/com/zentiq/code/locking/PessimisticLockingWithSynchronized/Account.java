package com.zentiq.code.locking.PessimisticLockingWithSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

	int balance = 10000;

	Lock lock = new ReentrantLock();

	void withdraw(int amount) {

		lock.lock(); // Acquire the lock

		try {

			System.out.println(Thread.currentThread().getName() + " entered");

			System.out.println(Thread.currentThread().getName() + " balance = " + balance);

			if (balance >= amount) {

				balance = balance - amount;

				System.out.println(Thread.currentThread().getName() + " withdrew = " + amount);

				System.out.println("Remaining balance = " + balance);

			} else {

				System.out.println(Thread.currentThread().getName() + " withdrawal failed - Insufficient balance");
			}

		} finally {

			lock.unlock(); // Always release the lock
		}
	}
}