package arrayex;

import java.util.Arrays;
import java.util.Collections;

public class DesendingArrayGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to Sort Numeric Array In Descending Order
		
		Integer[] arr = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };
		System.out.println("Print the given array: " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Desending order of given array:" + Arrays.toString(arr));
	}

}
