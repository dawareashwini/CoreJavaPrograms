package arrayex;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println(" Enter " + size + " elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
