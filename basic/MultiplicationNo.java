package basic;

import java.util.Scanner;

public class MultiplicationNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			result = i * n;
			System.out.println(result + " ");
		}
	}

}
