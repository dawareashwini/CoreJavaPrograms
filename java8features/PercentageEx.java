package java8features;
//4.create a functional interface with a method percentage(double m1 ,double m2, double m3)
//and implement lambda expression
@FunctionalInterface
interface percentage {
	double percentage(double m1, double m2, double m3);
}

public class PercentageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percentage p1 = (double m1, double m2, double m3) -> ((m1 + m2 + m3) / 300) * 100;
		System.out.println("percentage:" + p1.percentage(79, 80, 89)+"%");
	}

}