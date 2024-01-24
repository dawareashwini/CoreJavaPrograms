package controlstructure;

import java.util.Scanner;

//7.Accept purchase amount from the user and print discount amount. 10% discount on purchase if amount is greater than or equal to 10000, otherwise 2% discount.
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount,discount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount :");
		amount= scanner.nextFloat();
		if(amount>=10000)
		{
			discount=amount*0.1f;
		}
		else {
			discount=amount*0.02f;
		}
		System.out.println("Discount amount is :"+discount);
	}

}
