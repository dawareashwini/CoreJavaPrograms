package projectCorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private boolean available;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.available = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void borrow() {
		available = false;
	}

	public void returnBook() {
		available = true;
	}
}

class Library {
	private List<Book> books;

	public Library() {
		books = new ArrayList<>();
		initializeBooks();
	}

	private void initializeBooks() {
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
		books.add(new Book("1984", "George Orwell"));
		// Add more books as needed
	}

	public void displayAvailableBooks() {
		System.out.println("Available Books:");
		for (Book book : books) {
			if (book.isAvailable()) {
				System.out.println(book.getTitle() + " by " + book.getAuthor());
			}
		}
	}

	public void borrowBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
				book.borrow();
				System.out.println("You have borrowed " + book.getTitle() + ".");
				return;
			}
		}
		System.out.println("Sorry, the requested book is not available for borrowing.");
	}

	public void returnBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
				book.returnBook();
				System.out.println("Thank you for returning " + book.getTitle() + ".");
				return;
			}
		}
		System.out.println("Invalid return. The book was not borrowed from our library.");
	}
}

public class LirbaryProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("\nLibrary Catalog System Menu:");
			System.out.println("1. Display Available Books");
			System.out.println("2. Borrow a Book");
			System.out.println("3. Return a Book");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				library.displayAvailableBooks();
				break;
			case 2:
				System.out.print("Enter the title of the book you want to borrow: ");
				String borrowTitle = scanner.nextLine();
				library.borrowBook(borrowTitle);
				break;
			case 3:
				System.out.print("Enter the title of the book you want to return: ");
				String returnTitle = scanner.nextLine();
				library.returnBook(returnTitle);
				break;
			case 4:
				System.out.println("Exiting the Library Catalog System. Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
}
