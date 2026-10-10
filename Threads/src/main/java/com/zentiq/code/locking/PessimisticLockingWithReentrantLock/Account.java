package com.zentiq.code.locking.PessimisticLockingWithReentrantLock;

public class Account {

	int balance = 10000;

	synchronized void withdraw(int amount) {

		System.out.println(Thread.currentThread().getName() + " entered");

		System.out.println(Thread.currentThread().getName() + " balance = " + balance);

		if (balance >= amount) {

			balance = balance - amount;

			System.out.println(Thread.currentThread().getName() + " withdrew = " + amount);

			System.out.println("Remaining balance = " + balance);

		} else {

			System.out.println(Thread.currentThread().getName() + " withdrawal failed - Insufficient balance");
		}
	}
}