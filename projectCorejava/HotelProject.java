package projectCorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room {
	private int roomNumber;
	private boolean available;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		this.available = true;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void book() {
		available = false;
	}

	public void cancelBooking() {
		available = true;
	}
}

class Hotel {
	private List<Room> rooms;

	public Hotel(int numberOfRooms) {
		rooms = new ArrayList<>();
		initializeRooms(numberOfRooms);
	}

	private void initializeRooms(int numberOfRooms) {
		for (int i = 1; i <= numberOfRooms; i++) {
			rooms.add(new Room(i));
		}
	}

	public void displayAvailableRooms() {
		System.out.println("Available Rooms:");
		for (Room room : rooms) {
			if (room.isAvailable()) {
				System.out.println("Room " + room.getRoomNumber());
			}
		}
	}

	public void bookRoom(int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
				room.book();
				System.out.println("Room " + room.getRoomNumber() + " has been booked.");
				return;
			}
		}
		System.out.println("Sorry, the requested room is not available for booking.");
	}

	public void cancelBooking(int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber && !room.isAvailable()) {
				room.cancelBooking();
				System.out.println("Booking for Room " + room.getRoomNumber() + " has been canceled.");
				return;
			}
		}
		System.out.println("Invalid cancellation. The room was not booked in our system.");
	}
}

public class HotelProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rooms in the hotel: ");
		int numberOfRooms = scanner.nextInt();
		Hotel hotel = new Hotel(numberOfRooms);

		while (true) {
			System.out.println("\nHotel Reservation System Menu:");
			System.out.println("1. Display Available Rooms");
			System.out.println("2. Book a Room");
			System.out.println("3. Cancel Booking");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				hotel.displayAvailableRooms();
				break;
			case 2:
				System.out.print("Enter the room number you want to book: ");
				int roomToBook = scanner.nextInt();
				hotel.bookRoom(roomToBook);
				break;
			case 3:
				System.out.print("Enter the room number you want to cancel the booking for: ");
				int roomToCancel = scanner.nextInt();
				hotel.cancelBooking(roomToCancel);
				break;
			case 4:
				System.out.println("Exiting the Hotel Reservation System. Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
