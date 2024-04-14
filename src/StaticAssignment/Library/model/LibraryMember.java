package StaticAssignment.Library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void returnBook(Book book) {
        System.out.println("Book '" + book.getTitle() + "' returned by " + this.getName());
    }

    public void borrowBook(Book book) {
        System.out.println("Book '" + book.getTitle() + "' borrowed by " + this.getName());
    }

    // Method to get borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
