package classandobject;

public class MethodOverloadingEx {
	public void add(int a, int b, int c) {
		System.out.println("Addition of 2 integers are:" + (a + b + c));
	}

	public void add(double a, double b) {
		System.out.println("Addition of 2 decimal are:" + (a + b));
	}

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.add(3.2, 5.3);
		obj.add(7, 3, 5);
		int res = obj.add(12, 8);
		System.out.println("Add with return :" + res);
	}

}
