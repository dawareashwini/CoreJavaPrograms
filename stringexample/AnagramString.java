package stringexample;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("triangle");
		String str2 = new String("integral");
		char str1Array[] = str1.toCharArray();
		char str2Array[] = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else if (Arrays.equals(str1Array, str2Array) == true) {
			System.out.println("Both the strings are anagram");
		} else {
			System.out.println("Both the strings are not anagram");
		}
	}
}
