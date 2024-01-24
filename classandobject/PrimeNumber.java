package classandobject;

import java.util.Scanner;

public class PrimeNumber {
	public void prime() {
		Scanner sc = new Scanner(System.in);
		int n, flag = 1;
		System.out.println("Enter number:");
		n = sc.nextInt();
		if (n == 0 && n == 1) {
			flag = 0;
		}
		for (int i = 2; i < n; i++) {
			if (n % 1 == 0) {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println(n + ": Number is prime.");
		} else
			System.out.println(n + ": Number is not prime.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.prime();
	}

}
