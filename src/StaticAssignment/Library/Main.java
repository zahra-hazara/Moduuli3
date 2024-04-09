package StaticAssignment.Library;

import StaticAssignment.Library.model.Book;
import StaticAssignment.Library.model.LibraryMember;
import StaticAssignment.Library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("Java Programming", "John Doe", "123456789");
        Book book2 = new Book("Data Structures", "Jane Smith", "987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Adding members to the library
        LibraryMember member1 = new LibraryMember("Alice", 1001);
        LibraryMember member2 = new LibraryMember("Bob", 1002);
        library.addMember(member1);
        library.addMember(member2);

        // Performing borrowing and returning operations
        // Let's assume Alice borrows a book
        library.borrowBook(member1, book1);

        // Print out information about the library
        System.out.println("Books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }

        System.out.println("\nMembers in the library:");
        for (LibraryMember member : library.getMembers()) {
            System.out.println("Name: " + member.getName() + ", Member ID: " + member.getMemberId());
        }
    }
}

