package arrayex;

import java.util.Scanner;

public class ReverseNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to read n number of values in an array and display in reverse
		// order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int l = sc.nextInt();
		int a[] = new int[l];
		System.out.println("enter all elements:");
		for (int i = 0; i < l; i++) {
			//System.out.println("Print all elements:");
			a[i] = sc.nextInt();
		}System.out.println("Display reverse order of all array elements:");
		for (int i = l - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

}
