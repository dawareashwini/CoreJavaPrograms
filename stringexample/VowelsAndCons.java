package stringexample;

import java.util.Scanner;

// Program to count No. of vowels and consonants from a string
public class VowelsAndCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount = 0, ccount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vcount++;
			} else
				ccount++;
		}
		System.out.println("Number of vowels is : " + vcount + "\nNumber of consonants is : " + ccount);
	}
}
