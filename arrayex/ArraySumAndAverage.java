package arrayex;

import java.util.Scanner;
// Write a program to calculate the average value of array elements

public class ArraySumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Limit :");

		int l = sc.nextInt();
		int[] a = new int[l];
		int sum = 0;
		for (int i = 0; i < l; i++) {

			System.out.printf("Element of a[%d]:", i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < l; i++)
			sum = sum + a[i];
		double ave = sum / l;
		System.out.println("Sum Values of Array : " + sum);
		System.out.println("Average of Array Value : " + ave);
	}
}
