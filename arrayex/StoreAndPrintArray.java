package arrayex;

import java.util.Scanner;

public class StoreAndPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to store elements in an array and print it
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array limit:");
		int l = sc.nextInt();
		int[] a = new int[l];
		for(int i=0;i<l;i++) {
			System.out.printf("Print array elements a[%d]:",i);
			a[i]=sc.nextInt();
		}
		System.out.println("Display all elements :");
		for(int e:a)
		{
			System.out.println(e);
		}
	}

}
