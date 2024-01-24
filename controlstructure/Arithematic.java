package controlstructure;

import java.util.Scanner;

public class Arithematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		char choice;
		System.out.println("Enter your choice : press \n +:for Addition\n -:for Subtraction\n *:for Multiplication\n /:for Division");
		choice=scanner.next().charAt(0);
	switch(choice)
	{
	case'+':System.out.println("Add :"+(n1+n2));
	break;
	case'-':System.out.println("Sub :"+(n1+n2));
	break;
	case'*':System.out.println("Mul :"+(n1+n2));
	break;
	case'/':System.out.println("Div :"+(n1+n2));
	break;
	default:System.out.println("Inavlid choice....");
	}

	}

}
