package loopingstructure;

import java.util.Scanner;

public class SwitchDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char ch,choice;
		do {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enetr two numbers :");
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println("Enter you choice : + for Addition\n - for Subtraction\n * for Multiplication\n/ for Division");
		choice=s1.next().charAt(0);
		switch(choice)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("Invalid choice.");
		}
		System.out.println("you want to contined..?");
		ch=s1.next().charAt(0);
		
	}while(ch=='Y'||ch=='Y');
	}

}
