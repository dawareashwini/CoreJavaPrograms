package arrayex;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sumE = 0, sumO = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an size of elements :");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements of an arrays:");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sumE = sumE + a[i];
			} else {
				sumO = sumO * a[i];
			}

		}
		System.out.println("Sum of Even Numbers:" + sumE);
		System.out.println("Product of Odd Numbers:" + sumO);
	}

}
