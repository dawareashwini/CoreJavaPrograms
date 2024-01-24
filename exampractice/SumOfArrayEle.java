package exampractice;

import java.util.Scanner;

public class SumOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l, i, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Array element:");
		l = sc.nextInt();
		int[] a = new int[l];
		for (i = 0; i < l; i++) {
			System.out.println(" Element of a[%d]:" + i);
			a[i] = sc.nextInt();
		}
		for (i = 0; i < l; i++)
			sum = sum + a[i];
		System.out.println("Array element sum is:" + sum);
	}

}
