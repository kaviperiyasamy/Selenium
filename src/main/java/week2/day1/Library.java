package week2.day1;

public class Library {

	// This method is to add the book
	public String addBook(String bookTitle) {
		System.out.print("Book added successfully");
		return bookTitle;
	}

	// This method is to issue the book
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	// Main method to add and issue the book
	public static void main(String[] args) {
		Library libraryOptions = new Library();
		String bookName = libraryOptions.addBook("The Alchemist");
		System.out.println(" - " + bookName);
		libraryOptions.issueBook();
	}
}
