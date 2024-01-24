package codingchallenges;

/*Q.1
Second Smallest:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:
class definitions:
class Source:
visibility: puiblic
method definitons:
getSecondSmallest(int []arr): accept an array of integer elements and return
the second smallest element in the arrayreturn type: int
visibility: public

Task
Create a Source class and implement below given method:
• getSecondSmallest(int []arr): accept an array of integer elements and return the second
smallest element in the array

Sample Input:
23, 45, 32, 22, 20, 96
Sample Output:
22*/
import java.util.Scanner;

public class SecondSmallestAssEx {
	public static int getSecondSmallest(int[] a) {
		int temp, i, j;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondSmallestAssEx s1 = new SecondSmallestAssEx();
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[]a = new int[size];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		int output = s1.getSecondSmallest(a);
		System.out.println(output);
	}

}
