package com.zentiq.code.locking.PessimisticLockingWithReadWriteLock;

public class Main {

	public static void main(String[] args) throws Exception {

		Account account = new Account();

		// ================= 3 READERS =================

		Thread r1 = new Thread(new ReadTask(account), "Reader-1");

		Thread r2 = new Thread(new ReadTask(account), "Reader-2");

		Thread r3 = new Thread(new ReadTask(account), "Reader-3");

		// ================= 3 WRITERS =================

		Thread w1 = new Thread(new WriteTask(account, 3000), "Writer-1");

		Thread w2 = new Thread(new WriteTask(account, 2000), "Writer-2");

		Thread w3 = new Thread(new WriteTask(account, 1000), "Writer-3");

		// Start all 6 threads

		r1.start();
		r2.start();
		r3.start();

		w1.start();
		w2.start();
		w3.start();

		// Wait for all threads

		r1.join();
		r2.join();
		r3.join();

		w1.join();
		w2.join();
		w3.join();

		System.out.println("Final Balance = " + account.balance);
	}
}