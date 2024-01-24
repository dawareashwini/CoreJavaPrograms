package arrayex;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  size of an array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter an array elements:");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("After Sorting in asending order : ");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
