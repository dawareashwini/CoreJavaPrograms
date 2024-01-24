package loopingstructure;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			if (i == 5) 
			{
				break;
			}
			System.out.println(i + " ");
		}
		System.out.println("Hello");
		for (int j = 1; j <= 1; j++) 
		{
			if (j == 5) 
			{
				continue;
			}
			System.out.println(j + " ");
		}
	}

}
