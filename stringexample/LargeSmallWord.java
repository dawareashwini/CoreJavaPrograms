package stringexample;

import java.util.Scanner;

//To find large and Smallest word

public class LargeSmallWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr String : ");
		String str1 = sc.nextLine();
		int max = 0, min, i = 0;
		String large = "", small = " ";
//		String s5 = " My name Ankita";

		String str[] = str1.split(" ");
		min = str[i].length();
		for (i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//			System.out.println(str[i].length());
			if (str[i].length() > max) {
				large = str[i];
				max = str[i].length();

			}
			if (str[i].length() <= min) {
				small = str[i];
				min = str[i].length();
			}
		}
//		System.out.println("Maximum Length is : " + max + "\nMaximum Word is : " + large + "\nMinimum Length is : "
//				+ min + "\nMinimum Word is : " + small);
		System.out.println("\nMaximum Word is : " + large + "\nMinimum Word is : " + small);
	}
}
