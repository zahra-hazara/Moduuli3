package StaticAssignment.Library.system;

import java.util.ArrayList;
import java.util.List;

import StaticAssignment.Library.model.Book;
import StaticAssignment.Library.model.LibraryMember;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            member.borrowBook(book);
            books.remove(book);
            System.out.println("Book '" + book.getTitle() + "' borrowed by " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available in the library.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
    }

    public Book[] getBooks() {
        return books.toArray(new Book[0]);
    }

    public LibraryMember[] getMembers() {
        return members.toArray(new LibraryMember[0]);
    }
}
