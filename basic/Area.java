package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		float r,area;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius of circle :");
		r=Float.parseFloat(b1.readLine());
		area=3.14f*r*r;
		System.out.println("Area of circle :"+area);
	}

}
