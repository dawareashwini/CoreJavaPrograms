package controlstructure;

import java.util.Scanner;

public class callsbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int call,bill;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of calls :");
		call=scanner.nextInt();
		if(call<200)
		{
			bill=call*1;
		}
		else
		{
			bill=call*3;
		}
		System.out.println("Bill amount of calls :"+bill);
	}

}
