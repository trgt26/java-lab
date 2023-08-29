public class LibraryDriverCode {
    public static void main(String [] args) {
        Library library = new Library();
        
        // Adding books to the library
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        // Displaying available books
        System.out.println("Available Books:");
        library.displayAvailableBooks();

        // Issuing a book
        library.issueBook("Book 1");

        // Displaying available and issued books
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books:");
        library.displayIssuedBooks();

        // Returning a book
        library.returnBook("Book 1");

        // Displaying available and issued books
        System.out.println("\nAvailable Books:");
        library.displayAvailableBooks();
        System.out.println("\nIssued Books:");
        library.displayIssuedBooks();
    }
}
