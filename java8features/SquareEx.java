package java8features;

//1.create a functional interface with a method square(int n) and implement the lambda expression

@FunctionalInterface
interface square {
	int square(int n);
}

public class SquareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s1 = (int n) -> n * n;

		System.out.println("Square:" + s1.square(4));
	}

}
