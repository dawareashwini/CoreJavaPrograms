package multithreading;

class Customer {
	private int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw Rs." + amount);
		if (balance < amount) {
			System.out.println("Not enough balance in account waiting for deposit....");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - amount;
		System.out.println("Rs." + amount + "withdraw Balance:" + balance);
	}

	synchronized void deposit(int amount) {

	}

	public class InterThreadCom {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Customer customer = new Customer();
			new Thread("Paras") {
				public void run() {
					customer.withdraw(15000);
				};
			}.start();
			new Thread("Manas") {
				public void run() {
					customer.deposit(25000);
				};
			}.start();
		}

	}
}