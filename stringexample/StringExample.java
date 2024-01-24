package stringexample;

import java.io.BufferedReader;
import java.util.Iterator;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello WOrld !");
		String str = "WelCome";
		String str1 = "WElCome";
		String s2 = "";
		String s3 = " ";
		String s4 = "     Hello My Name Ankita       ";
		String s5 = "Hello My name Ankita";
		System.out.println(s1);
		System.out.println(str);
		System.out.println("Length : " + s1.length());
		System.out.println("Length : " + str.length());
		System.out.println("CharAt : " + s1.charAt(4));
		System.out.println("Substring : " + s1.substring(4));
		System.out.println("Sub String : " + s1.substring(4, 7));// inclusive,exclusive(endIndex-1)
		System.out.println("COntains : " + s1.contains("h"));
		System.out.println("Is Empty : " + s2.isEmpty());
		System.out.println("Is Blank : " + s3.isBlank());
		System.out.println("Index of : " + s1.indexOf("e"));
		System.out.println("Index of : " + str.indexOf("e", 3));
		System.out.println("Last Index of : " + str.lastIndexOf("C"));
		System.out.println("Equals Ignore Case : " + str.equalsIgnoreCase(str1));
		System.out.println("Concat : " + str.concat(" " + s1));
		System.out.println("Replace : " + str.replace('l', 'a'));
		System.out.println("Uppercase : " + str.toLowerCase());
		System.out.println("LowerCase : " + str.toUpperCase());
		System.out.println("Before Trim length : " + s4.length());
		s4 = s4.trim();
		System.out.println("After Trim length : " + s4.length());
		String splitedString[] = s5.split(" ");
		System.out.println("Count of Word : " + splitedString.length);

		for (String string : splitedString) {
			System.out.println(string);
		}

	}

}
