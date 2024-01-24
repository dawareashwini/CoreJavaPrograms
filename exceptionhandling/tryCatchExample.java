package exceptionhandling;

public class tryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 5 / 0;
			System.out.println(a);
		} catch (Exception e) {
			// System.err.println(e);
			// System.out.println(n);
			e.printStackTrace();
		}
		System.out.println("rest of code..");
	}

}
