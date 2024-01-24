package exampractice;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50, i,sum=0;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
				sum=sum+i;
			}
			
		}
		System.out.println("="+sum);
	}

}
