package loopingstructure;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse, sum = 0, temp, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number:");
		n = scanner.nextInt();
		temp = n;
		while (n > 0) {
			reverse = n % 10;
			sum = (sum * 10) + reverse;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Palindrome number.");
		else
			System.out.println("Not palindrome number.");

	}

}
