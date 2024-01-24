package classandobject;

import java.util.Scanner;

public class DefaultMethodEx {
	int a, b;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}

	public void add() {
		System.out.println("Add:" + (a + b));
	}

	public int sub() {
		return a - b;
	}

	public void mul(double a, double b) {
		System.out.println("Mul :" + (a * b));
	}

	public double div(double x, double y) {
		return x / y;
	}

	public static void mod(double a, double b) {
		System.out.println("Reminder:" + (a % b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodEx obj = new DefaultMethodEx();
		obj.accept();
		obj.add();
		int res = obj.sub();
		System.out.println("sub:" + res);
		obj.mul(8.3, 2.1);
		double div = obj.div(25.5, 7.9);
		System.out.println("Div:" + div);
		DefaultMethodEx.mod(125.5, 12);

	}

}
