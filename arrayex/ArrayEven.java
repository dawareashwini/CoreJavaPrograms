package arrayex;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = scanner.nextInt();
		int a[] = new int[size];
		System.out.println("Enter elements array:");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Even number in array are");
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + "\t");
			}
		}

	}

}
