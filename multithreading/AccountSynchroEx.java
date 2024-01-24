package multithreading;

public class AccountSynchroEx implements Runnable {
	private Account account = new Account();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSynchroEx accountSynchroEx = new AccountSynchroEx();
		Thread thread1 = new Thread(accountSynchroEx);
		Thread thread2 = new Thread(accountSynchroEx);
		thread1.setName("Ashu");
		thread2.setName("Ankii");
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; i++) {
			makeWithdrawal(1000);
		}
	}

	synchronized void makeWithdrawal(int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " Complete withdraw balance:" + account.getBalance());
		} else {
			System.out.println(" Not Engough balance in acount for" + Thread.currentThread().getName() + "Balance:"
					+ account.getBalance());
		}
	}
}
