package Series;

import java.util.Scanner;

public class Series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
n=sc.nextDouble();
for(double i=1;i<=n;i++)
{
	System.out.println("i/"+(int)i);
	if(i<n)
	{
		System.out.print(" + ");
	}
	sum=sum+(i/i);
}
System.out.println("="+sum);
	}

}
