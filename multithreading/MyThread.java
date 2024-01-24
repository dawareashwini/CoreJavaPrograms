package multithreading;

public class MyThread implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("currently executing thread:" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.setName("Riya");
		t1.start();

		Thread t2 = new Thread(myThread);
		t2.setName("Ashu");
		t2.start();
	}

}
