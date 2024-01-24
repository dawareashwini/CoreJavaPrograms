package arrayex;

import java.util.Scanner;

public class ArraySortingAsDs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, temp;
		int size = 10;
		int a[] = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array :");
		for (i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < 4; i++) {
			for (j = i + 1; j < 5; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (i = 5; i < 9; i++) {
			for (j = i + 1; j < 9; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array:");
		for (i = 0; i <= 9; i++) {
			System.out.println(a[i]);
		}

	}

}
