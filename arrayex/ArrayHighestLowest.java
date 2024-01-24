package arrayex;

import java.util.Scanner;

public class ArrayHighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an size of an array :");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter an elements of an array:");
		for (i = 0; i < a.length; i++) {
			//System.out.print("Element " + (i + 1) + ": ");
			a[i] = scanner.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for (i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("The highest element in the array is: " + max);
		System.out.println("The lowest element in the array is: " + min);
	}

}
