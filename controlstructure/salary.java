package controlstructure;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salary,tax;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter salary :");
		salary=scanner.nextFloat();
		if(salary<25000)
		{
			tax=salary*0.1f;
		}
		else
		{
			tax=salary*0.15f;
		}
		System.out.println("Tax amont is :"+tax);
	}

}
