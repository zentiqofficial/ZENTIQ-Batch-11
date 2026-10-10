package com.zentiq.code.locking.PessimisticLockingWithSynchronized;

class WithdrawTask implements Runnable {

    Account account;
    int amount;

    WithdrawTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}