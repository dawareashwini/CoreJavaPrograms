package controlstructure;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isVowel = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Character: ");
		char ch = scanner.next().charAt(0);
		scanner.close();
		switch (ch) {
		case 'a':
			isVowel = true;
		case 'e':
			isVowel = true;
		case 'i':
			isVowel = true;
		case 'o':
			isVowel = true;
		case 'u':
			isVowel = true;
		case 'A':
			isVowel = true;
		case 'E':
			isVowel = true;
		case 'I':
			isVowel = true;
		case 'O':
			isVowel = true;
		case 'U':
			isVowel = true;
		}
		if (isVowel == true) {
			System.out.println("Its a vowel :" + ch);
		} else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println(" It is a Consonant:" + ch);
			else
				System.out.println("Input is not an alphabet");
		}

	}
}
