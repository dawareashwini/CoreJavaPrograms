package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an size of an arrys: ");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter an elements of an array:");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted array in ascending order:");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
