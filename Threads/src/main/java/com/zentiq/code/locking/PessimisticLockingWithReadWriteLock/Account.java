package com.zentiq.code.locking.PessimisticLockingWithReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Account {

	int balance = 10000;

	ReadWriteLock lock = new ReentrantReadWriteLock();

	// ================= READ =================
	// Multiple readers can read at the same time.

	void checkBalance() {

		lock.readLock().lock();

		try {

			System.out.println(Thread.currentThread().getName() + " reading balance = " + balance);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " finished reading");

		} finally {

			lock.readLock().unlock();
		}
	}

	// ================= WRITE =================
	// Multiple writer threads can exist,
	// but only ONE writer can write at a time.

	void withdraw(int amount) {

		lock.writeLock().lock();

		try {

			System.out.println(Thread.currentThread().getName() + " entered for withdrawal");

			System.out.println("Balance = " + balance);

			if (balance >= amount) {

				balance = balance - amount;

				System.out.println(Thread.currentThread().getName() + " withdrew = " + amount);

				System.out.println("Remaining balance = " + balance);

			} else {

				System.out.println(Thread.currentThread().getName() + " withdrawal failed - Insufficient balance");
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} finally {

			lock.writeLock().unlock();
		}
	}
}