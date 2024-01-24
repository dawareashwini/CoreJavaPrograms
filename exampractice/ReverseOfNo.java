package exampractice;

import java.util.Scanner;

public class ReverseOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev = 0, n, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an number:");
		n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
