package com.zentiq.code.locking.PessimisticLockingWithReadWriteLock;

class WriteTask implements Runnable {

    Account account;
    int amount;

    WriteTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}