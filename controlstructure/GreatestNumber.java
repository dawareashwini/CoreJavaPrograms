package controlstructure;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1,n2,n3;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter 3 Numbers: ");
n1=scanner.nextInt();
n2=scanner.nextInt();
n3=scanner.nextInt();
if(n1>n2&&n1>n3)
	System.out.println("The largest number is : "+n1);
else if(n2>n1&&n2>n3)
	System.out.println("The largest number is :"+n2);
else if(n3>n1&&n3>n2)
	System.out.println("The largest number is :"+n3);
else
	System.out.println("The number is same.");
	}

}
