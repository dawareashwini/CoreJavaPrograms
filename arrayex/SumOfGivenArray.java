package arrayex;

import java.util.Arrays;
import java.util.Scanner;
// Write a program to print sum values of an array

public class SumOfGivenArray

{
	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Element of a[%d] :", i);
			a[i] = sc.nextInt();
		}

		for (int i : a)
			sum += i;
		System.out.println("Sum Values of Array : " + sum);
	}
}
