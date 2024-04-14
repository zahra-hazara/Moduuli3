package StaticAssignment.Task3;

import StaticAssignment.Task3.model.Book;
import StaticAssignment.Task3.model.LibraryMember;
import StaticAssignment.Task3.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, and LibraryMember
        Library library = new Library();
        Book book2 = new Book("Data Structures", "Alice Johnson", "0987654321");
        Book book1 = new Book("Java Programming", "John Doe", "123456789");
        LibraryMember member1 = new LibraryMember("Alice", "M001" );
        LibraryMember member2 = new LibraryMember("John Doe", "M001");

        // Add book to library and member to library

        library.addMember(member1);
        library.addMember(member2);
        library.addBook(book1);
        library.addBook(book2);


        // Reserve the book for the member
        library.reserveBook(member1, book1);
        library.reserveBook(member1, book2);
        library.reserveBook(member2, book2);

        // Display reserved books for the member
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        // Cancel the reservation
        library.cancelReservation(member1, book1);
        System.out.println("Reservation of book \"" + book1.getTitle() + "\" canceled for " + member1.getName() + ".");
        library.cancelReservation(member2, book2);
        System.out.println("Reservation of book \"" + book2.getTitle() + "\" canceled for " + member2.getName() + ".");

        // Display reserved books after cancellation
        System.out.println("Reserved books for " + member1.getName() + " after cancellation:");
        library.displayReservedBooks(member1);
        System.out.println("Reserved books for " + member2.getName() + " after cancellation:");
        library.displayReservedBooks(member2);
    }
}
