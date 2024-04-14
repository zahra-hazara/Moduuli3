package StaticAssignment.Task3.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private String memberId;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}
