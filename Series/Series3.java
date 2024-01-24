package Series;

import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = scanner.nextInt();
      System.out.println("The sries is :");
      for(int i=1;i<=n;i++)
      {
    	  
          int cube=(int)Math.pow(i, 3);
          System.out.print(cube +" ");
      }
	}

}
