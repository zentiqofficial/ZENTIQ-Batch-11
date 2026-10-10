package com.zentiq.code.locking.OptimisticLockingWithVersionCheck;

class WithdrawTask implements Runnable {

	Account account;
	int amount;

	WithdrawTask(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {

		// Read balance and version
		int myBalance = account.balance;
		int myVersion = account.version;

		System.out.println(
				Thread.currentThread().getName() + " read balance = " + myBalance + ", version = " + myVersion);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		// Version check + update must happen atomically
		synchronized (account) {

			if (account.version == myVersion) {

				account.balance = myBalance - amount;
				account.version++;

				System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " successfully");

			} else {

				System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount);

				System.out.println(Thread.currentThread().getName() + " failed - version mismatch");

				System.out.println(Thread.currentThread().getName() + " expected version = " + myVersion
						+ ", actual version = " + account.version);
			}
		}
	}
}