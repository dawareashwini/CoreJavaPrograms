package loopingstructure;

import java.util.Scanner;

public class WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, n, rem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number :");
		n = scanner.nextInt();
		while (n > 0) 
		{
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("sum=" + sum);

	}

}
