package abstraction;

import java.util.Scanner;

abstract class Bank {
	public abstract float getRateOfInterest();
}

class BOI extends Bank {
	public float getRateOfInterest() {
		return 8.7f;
	}
}

class TJSB extends Bank {
	public float getRateOfInterest() {
		return 6.6f;
	}
}

public class BankAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pricipleAmount, years, rateBOI, rateTJSB;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount :");
		pricipleAmount = sc.nextFloat();
		System.out.println("Enter number of years:");
		years = sc.nextFloat();

		Bank bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();

		Bank bTJSB = new BOI();
		rateTJSB = bTJSB.getRateOfInterest();

		float interestBOI = (pricipleAmount * years * rateBOI) / 100;
		float interestTJSB = (pricipleAmount * years * rateTJSB) / 100;
		System.out.println("Simple Interest for BOI:" + interestBOI);
		System.out.println("Simple Interest for BOI:" + interestTJSB);

	}

}
