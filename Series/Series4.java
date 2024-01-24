package Series;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number :");
int n=scanner.nextInt();
System.out.println("The series in :");
double sum=0;
for(int i=1;i<=n;i++)
{
	double term=(double)i/(i*1);
	System.out.print(term);
	if(i<n)
	{
		System.out.println(" + ");
	}
	sum+=term;
}
System.out.println();
System.out.println("Sum of the series is: "+sum);
	}

}
