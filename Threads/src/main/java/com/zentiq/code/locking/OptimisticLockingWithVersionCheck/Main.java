package com.zentiq.code.locking.OptimisticLockingWithVersionCheck;

public class Main {

	public static void main(String[] args) throws Exception {

		Account account = new Account();

		Thread t1 = new Thread(new WithdrawTask(account, 8000), "Thread-1");

		Thread t2 = new Thread(new WithdrawTask(account, 3000), "Thread-2");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Balance = " + account.balance);
		System.out.println("Final Version = " + account.version);
	}
}