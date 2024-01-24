package arrayex;

import java.util.Scanner;

public class ArrayEvenOddAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, oddSum = 0, evenSum = 0, oddCount = 0, evenCount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an size of elements :");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter an elements of an array :");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
				evenCount++;
			} else {
				oddSum = oddSum + a[i];
				oddCount++;
			}
		}
		double avgOdd = oddSum / oddCount;
		double avgEven = evenSum / evenCount;
		System.out.println("\nAverage of even numbers are: " + avgEven);
		System.out.println("\nAverage of odd numbers are: " + avgOdd);
	}

}
