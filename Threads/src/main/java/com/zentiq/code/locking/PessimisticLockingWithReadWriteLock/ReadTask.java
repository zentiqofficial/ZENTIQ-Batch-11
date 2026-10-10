package com.zentiq.code.locking.PessimisticLockingWithReadWriteLock;

class ReadTask implements Runnable {

    Account account;

    ReadTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.checkBalance();
    }
}
