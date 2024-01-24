package codingchallenges;

/*
Distance Traveled
Problem Statement:
Write a program to calculate the distance travelled by car at different time intervals.
 The initial velocity of the car is 36km/hr and the constant acceleration is 5 m/s2.
The formula to calculate distance is:
Distance Travelled = u*t+((a*t*t)/2) where,
u = initial velocity of the car (36 km/hr)
a = acceleration of the car (5 m/s )
t = time duration in seconds
The program should accept 2-time intervals as the input (one-time interval per line) and 
print the distance travelled in meters by car (one output per line).
Definitions:
1 kilometer = 1000 meters
1 hour = 3600 seconds
Sample Input
10
8
Sample Output
350
240
*/
import java.util.Scanner;

public class DistanceTravelledAssEx {

	public static void calculateDistance(int t1, int t2) {
		int u, a, distanceTravelled1, distanceTravelled2;
		u = 10;
		a = 5;
		distanceTravelled1 = u * t1 + ((a * t1 * t1) / 2);
		distanceTravelled2 = u * t2 + ((a * t2 * t2) / 2);
		System.out.println(distanceTravelled1);
		System.out.println(distanceTravelled2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		calculateDistance(t1, t2);
	}

}
