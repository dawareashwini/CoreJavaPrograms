package java8features;

//create a functional interface with a method circle(float r)and implement the  lambda expression


@FunctionalInterface
interface Circle {
	double Circle(float r);
}

public class LambdaCircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = (float r) -> Math.PI * r * r;
		System.out.println("Circle:" + c1.Circle(4));
	}

}
