package Series;

import java.util.Scanner;

public class Series01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=scanner.nextInt();
		System.out.println("The series is:");
	
for(int i=1;i<=n;i=i+2)
{
	System.out.print(i+" ");
}
System.out.print(".");
	}

}

