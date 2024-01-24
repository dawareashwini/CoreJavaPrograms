package projectCorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
	private String model;
	private boolean available;
	private double rentalFee;

	public Car(String model, double rentalFee) {
		this.model = model;
		this.available = true;
		this.rentalFee = rentalFee;
	}

	public String getModel() {
		return model;
	}

	public boolean isAvailable() {
		return available;
	}

	public double getRentalFee() {
		return rentalFee;
	}

	public void rent() {
		available = false;
	}

	public void returnCar() {
		available = true;
	}
}

class CarRentalSystem {
	private List<Car> cars;

	public CarRentalSystem() {
		cars = new ArrayList<>();
		initializeCars();
	}

	private void initializeCars() {
		cars.add(new Car("Toyota Camry", 50.0));
		cars.add(new Car("Honda Accord", 45.0));
		cars.add(new Car("Ford Mustang", 70.0));
		// Add more cars as needed
	}

	public void displayAvailableCars() {
		System.out.println("Available Cars:");
		for (Car car : cars) {
			if (car.isAvailable()) {
				System.out.println(car.getModel() + " - Rental Fee: $" + car.getRentalFee());
			}
		}
	}

	public void rentCar(String model) {
		for (Car car : cars) {
			if (car.getModel().equalsIgnoreCase(model) && car.isAvailable()) {
				car.rent();
				System.out.println("You have rented the " + car.getModel() + ".");
				return;
			}
		}
		System.out.println("Sorry, the requested car is not available for rent.");
	}

	public void returnCar(String model) {
		for (Car car : cars) {
			if (car.getModel().equalsIgnoreCase(model) && !car.isAvailable()) {
				car.returnCar();
				System.out.println("Thank you for returning the " + car.getModel() + ".");
				return;
			}
		}
		System.out.println("Invalid return. The car was not rented from our system.");
	}
}

public class CarProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarRentalSystem carRentalSystem = new CarRentalSystem();

		while (true) {
			System.out.println("\nCar Rental System Menu:");
			System.out.println("1. Display Available Cars");
			System.out.println("2. Rent a Car");
			System.out.println("3. Return a Car");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				carRentalSystem.displayAvailableCars();
				break;
			case 2:
				System.out.print("Enter the model of the car you want to rent: ");
				String rentModel = scanner.nextLine();
				carRentalSystem.rentCar(rentModel);
				break;
			case 3:
				System.out.print("Enter the model of the car you want to return: ");
				String returnModel = scanner.nextLine();
				carRentalSystem.returnCar(returnModel);
				break;
			case 4:
				System.out.println("Exiting the Car Rental System. Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
