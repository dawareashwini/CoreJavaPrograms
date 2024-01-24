package stringexample;

import java.util.Scanner;

// check whether given String is a palindrome or not
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String newString = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		for (i = (str.length() - 1); i >= 0; i--) {
			newString = newString + str.charAt(i);
		}
//		System.out.println(newString);
		if (str.toLowerCase().equals(newString.toLowerCase())) {
			System.out.println(" String " + str + " is Palindrome. ");
		} else
			System.out.println("The String " + str + " is Not Palindrome. ");
	}

}
