package java8features;

//3.create a functional interface with a method simpleInterest(float p,float n, float r)
//and  implement lambda expression

@FunctionalInterface
interface simpleInterest{
	float simpleInterest(float p,float n, float r);
}
public class SimpleInterestEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleInterest si=(p,n,r)->(p*n*r)/100;
		System.out.println("simpleInterest:" + si.simpleInterest(3000,4,4));
	}

}
