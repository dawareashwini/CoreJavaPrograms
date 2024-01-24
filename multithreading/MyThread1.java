package multithreading;

public class MyThread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Current executing thread:" + getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		t1.setName("Ashu");
		t1.start();
		MyThread1 t2 = new MyThread1();
		t2.setName("Ankii");
		t2.start();
		MyThread1 t3 = new MyThread1();
		t3.setName("Shweta");
		t3.start();
	}

}
