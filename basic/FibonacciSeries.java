package basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 0, sno = 1, tno, i;
		System.out.println(fno + " " + sno);
		for (i=0;i<=5;i++) 
		{
			tno = fno + sno;
			System.out.print(" " +tno);
			fno = sno;
			sno = tno;
		}
	}

}
