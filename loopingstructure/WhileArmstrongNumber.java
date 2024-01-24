package loopingstructure;

import java.util.Scanner;

public class WhileArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an number :");
		int n=0,rem,sum=0;
		int org=n;
		n=scanner.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==org)
		{
			System.out.println("The number armstrong. ");
		}else
		{
		System.out.println("The number is not armstrong. ");
		}
	}

}
