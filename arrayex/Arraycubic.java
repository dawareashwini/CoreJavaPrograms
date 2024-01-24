package arrayex;

import java.util.Scanner;

public class Arraycubic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to array elements to print cubic values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		int cube[] = new int[size];
		System.out.printf("Enter the elements of array:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			cube[i] = a[i] * a[i] * a[i];
		}
		System.out.println("Cube array elements are:");
		for (int i = 0; i < cube.length; i++) {
			System.out.println(cube[i] + " ");
		}
	}

}
