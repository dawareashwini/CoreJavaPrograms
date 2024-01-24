package basic;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float eng,phy,chem;
		double total,average,percentage;
		Scanner op=new Scanner(System.in);
		System.out.println("Enter marks of 3 subject--");
		System.out.println("Enter marks of Eng subject");
		eng=op.nextFloat();
		System.out.println("Enter marks of Phy subject");
		phy=op.nextFloat();
		System.out.println("Enter marks of Chem subject");
		chem=op.nextFloat();
		total=eng+phy+chem;
		average=(total/3.0);
		percentage=(total/300.0)*100;
		System.out.println("Total marks= "+total);
		System.out.println("Average marks= "+average);
		System.out.println("Percentage= "+percentage);
		
	}

}
