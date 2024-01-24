package multithreading;

public class ThreadTypeEx extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTypeEx t1 = new ThreadTypeEx();
		ThreadTypeEx t2 = new ThreadTypeEx();
		ThreadTypeEx t3 = new ThreadTypeEx();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Functionality of daemon thread:" + getName());
		} else {
			System.out.println("Functionality of user thread:" + getName());
		}
	}

}
