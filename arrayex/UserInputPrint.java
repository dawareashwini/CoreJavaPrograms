package arrayex;

import java.util.Scanner;

public class UserInputPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. Write a program in to array size to be user input print it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("Print array of element a[%d]:", i);
			a[i] = sc.nextInt();
		}
		System.out.println("Display all elements:");
		for (int e : a) {
			System.out.println(e);
		}

	}

}
