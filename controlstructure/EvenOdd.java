package controlstructure;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n = scanner.nextInt();
		if (n % 2 == 0) {
			System.out.println("The number is even. ");
		} else {
			System.out.println("The number is odd.");
		}
	}

}
