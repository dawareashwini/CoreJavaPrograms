package designPatterns;

import java.util.Scanner;

interface Food {
	String prepareFood();

	float foodPrice();
}

class VegFood implements Food {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "Pickle & Salad";
	}

	@Override
	public float foodPrice() {
		// TODO Auto-generated method stub
		return 0.0f;
	}

}

class FoodDecorator implements Food {

	private Food food;

	public FoodDecorator(Food food) {
		super();
		this.food = food;
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return food.prepareFood();
	}

	@Override
	public float foodPrice() {
		// TODO Auto-generated method stub
		return food.foodPrice();
	}

}

class NonVegFood extends FoodDecorator {

	public NonVegFood(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + "Roasted Chicken";
	}

	@Override
	public float foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 180;
	}

}

class ChineeseFood extends FoodDecorator {

	public ChineeseFood(Food food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + "Fried Rice";
	}

	@Override
	public float foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 140;
	}

}

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("--------------Food Menu-------------");
			System.out.println("Enter your choice.");
			System.out.println(" 1.Non-Veg \n 2.Chineese \n 3.Exit ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Food food1 = new NonVegFood(new VegFood());
				System.out.println(food1.prepareFood());
				System.out.println(food1.foodPrice());
				break;
			case 2:
				Food food2 = new ChineeseFood(new VegFood());
				System.out.println(food2.prepareFood());
				System.out.println(food2.foodPrice());
				break;

			default:
				System.out.println("No other category is available");
			}

		} while (choice != 3);

	}

}
