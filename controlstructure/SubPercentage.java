package controlstructure;

import java.util.Scanner;

public class SubPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sub1,sub2,sub3,total,percentage,average;
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the marks of three subject :");
		sub1=scanner.nextFloat();
		sub2=scanner.nextFloat();
		sub3=scanner.nextFloat();
		 total = sub1 + sub2 + sub3;
		 average = (float)(total / 3.0);
	    percentage = (float)((total / 300.0) * 100);
	    if( average>90)
	    grade ='A';
	    else if( average>=80&& average<90)
	    	grade='B';
	    else if( average>=70&& average<80)
	    	grade='C';
	    else if( average>=60&& average<70)
	    	grade='D';
	    else 
	    	grade='E';
	    System.out.println("\nThe Total marks   = " + total + "/300.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
	}

}
