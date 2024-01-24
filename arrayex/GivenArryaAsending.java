package arrayex;

import java.util.Arrays;

public class GivenArryaAsending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to Sort Numeric Array In Ascending Order
		int[] arr = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };
		System.out.println("print the given array element." + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Asending order of  array element." + Arrays.toString(arr));
	}
}