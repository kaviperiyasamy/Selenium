package week2.day1;

public class LibraryManagement {
	// Main method to add and issue the book
	public static void main(String[] args) {
		Library libraryOptions = new Library();
		String bookName = libraryOptions.addBook("The Atomic Habits");
		System.out.println(" - " + bookName);
		libraryOptions.issueBook();
	}
}
