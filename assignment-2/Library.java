import java.util.ArrayList;

public class Library {
    ArrayList<String> books = new ArrayList<String>();
    ArrayList<String> issuedBooks =  new ArrayList<String>();
    public void addBook(String bookTitle) {
        books.add(bookTitle);    
    }
    public void issueBook(String bookTitle) {
        books.remove(bookTitle);
        issuedBooks.add(bookTitle);
    }
    public void returnBook(String bookTitle) {
        books.add(bookTitle);
        issuedBooks.remove(bookTitle);
    }
    public void displayAvailableBooks() {
        int cnt =1;
        for(String b : books) {
            System.out.println(cnt + ". " + b);
            cnt++;
        }
    }
    public void displayIssuedBooks() {
        int cnt = 1;
        for(String b : issuedBooks) {
            System.out.println(cnt + ". " + b);
            cnt++;
        }
    }

}
